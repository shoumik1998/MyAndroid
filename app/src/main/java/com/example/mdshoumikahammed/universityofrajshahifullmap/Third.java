package com.example.mdshoumikahammed.universityofrajshahifullmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Third extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        imageView=(ImageView)findViewById(R.id.thirdID);
        imageView.setImageResource(R.mipmap.third);
        imageView.setImageResource(R.mipmap.third);
    }
}
