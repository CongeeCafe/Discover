package com.discover.discoverapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import retrofit.Callback;
import retrofit.Endpoints;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

import com.discover.discoverapp.item.Location;
import com.discover.discoverapp.item.Scene;
import com.discover.discoverapp.net.Urthecast;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    private Urthecast urthecast;
    private TextView title;
    private WebView webImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView) findViewById(R.id.title);

        RestAdapter apiAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.urthecast.com/v1/archive")
                .build();

        urthecast = apiAdapter.create(Urthecast.class);

        getMap();

        /*
        ImageView v = (ImageView)findViewById(R.id.homeImage);
        v.setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeLeft() {
                // new
                setImageSwipe(newDrawable);
                //oldDrawable = curr;
                //newDrawable = newd;
            }

            public void onSwipeRight() {
                // old
                setImageSwipe(oldDrawable);
                //oldDrawable = oldd;
                //newDrawable = curr;
            }
        });
*/
    }

    public void newImage(View view) {
        getMap();
    }

    private void initWebView(Scene scene, Location location) {
        webImage = (WebView) findViewById(R.id.web_image);

        WebSettings webSettings = webImage.getSettings();
        webSettings.setJavaScriptEnabled(true);

        try {
            InputStream is = getAssets().open("map.html");
            int size = is.available();


            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            String str = new String(buffer);

            str = str.replace("%lat", location.getLat());
            str = str.replace("%lon", location.getLon());

            Scene.Payload payload = scene.getPayload(0);
//
//            if (payload != null) {
//                str = str.replace("%id", scene.getPayload(0).getId());
//            } else {
//                getMap();
//                return;
//            }

            webImage.loadData(str, "text/html; charset=utf-8", "UTF-8");
            webImage.reload();
            title.setText(location.getCity() + ", " + location.getProvince());
        } catch (IOException e) {

        }
    }

    private void getMap() {

        Random rand = new Random();
        int randomNum = rand.nextInt((9 - 1) + 1) + 1;

        Log.d("WP", "RANDOM: " + randomNum);

        final Location location = Locations.getLocation(randomNum);

        Log.d("WP", "POINT("
                + (Double.valueOf(location.getLon()) > 0 ? "-" + location.getLon() : location.getLon().substring(1, location.getLon().length()))
                + (Double.valueOf(location.getLat()) > 0 ? "+" : "") + location.getLat() + ")");

        urthecast.scenes("POINT("
                + (Double.valueOf(location.getLon()) > 0 ? "-" + location.getLon() : location.getLon().substring(1, location.getLon().length()))
                + "+" + location.getLat() + ")"
                , new Callback<Scene>() {
            @Override
            public void success(Scene scene, Response response) {
                Log.d("WP", "SUCCESS");
                initWebView(scene, location);
            }

            @Override
            public void failure(RetrofitError retrofitError) {
                Log.d("WP", retrofitError.getMessage() + retrofitError.getUrl());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void setImage(View v) {
        //ImageView newiv = new ImageView(this);
        //newiv.setImageResource(R.drawable.waterloo);
        //ImageView iv = (ImageView) findViewById(R.id.homeImage);
        //iv.setImageResource(R.drawable.waterloo);

        Intent intent = new Intent(this, DonateActivity.class);
        intent.putExtra("country", "North Korea");

        startActivity(intent);
    }

    public void donateButton() {
        //invokes webview
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mydiscover.co"));
        startActivity(browserIntent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

