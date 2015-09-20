package com.discover.discoverapp;
import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Toast;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class MainActivity extends ActionBarActivity {

    public Drawable newDrawable;
    public Drawable oldDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }

    public void addListenerOnButton() {

       // ImageButton imageButton = (ImageButton) findViewById(R.id.dollar);

//        imageButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mydiscover.co"));
//                startActivity(browserIntent);
//            }
//
//        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        return true;
    }

    public void setImage(View v) {
        //ImageView newiv = new ImageView(this);
        //newiv.setImageResource(R.drawable.waterloo);
        //ImageView iv = (ImageView) findViewById(R.id.homeImage);
        //iv.setImageResource(R.drawable.waterloo);
    }
    public void donateButton(){
        //invokes webview
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(browserIntent);
    }
    public void nextButton(View v){
        //shows new image
        setImage(v);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}

