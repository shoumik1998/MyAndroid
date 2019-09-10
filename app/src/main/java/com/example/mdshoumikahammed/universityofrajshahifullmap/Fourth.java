package com.example.mdshoumikahammed.universityofrajshahifullmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Fourth extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        imageView=(ImageView)findViewById(R.id.fourthID);
        imageView.setImageResource(R.mipmap.fourth);
    }
}
