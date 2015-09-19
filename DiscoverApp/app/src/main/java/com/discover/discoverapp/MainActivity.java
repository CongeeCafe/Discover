package com.discover.discoverapp;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;


public class MainActivity extends ActionBarActivity {


    public Drawable newDrawable;
    public Drawable oldDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    }

    public void setImageSwipe(Drawable dr) {
        //ImageView newiv = new ImageView(this);
        //newiv.setImageResource(R.drawable.waterloo);
        ImageView iv = (ImageView) findViewById(R.id.homeImage);
        iv.setImageDrawable(dr);

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
        ImageView iv = (ImageView) findViewById(R.id.homeImage);
        iv.setImageResource(R.drawable.waterloo);


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

