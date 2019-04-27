package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isshowing=true;
    public void fade(View view){
        Log.i("info","Start");
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        ImageView homerimage=(ImageView)findViewById(R.id.homerimageView);
        if(isshowing){
            isshowing=false;
        imageView.animate().alpha(0).setDuration(200);
        homerimage.animate().alpha(1).setDuration(200);
    }else{
            isshowing=true;
            imageView.animate().alpha(1).setDuration(200);
            homerimage.animate().alpha(0).setDuration(200);

        }}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
