package com.example.mdshoumikahammed.universityofrajshahifullmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Second extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView=(ImageView)findViewById(R.id.secondID);
        imageView.setImageResource(R.mipmap.second);
        imageView.setImageResource(R.mipmap.second);
    }
}
