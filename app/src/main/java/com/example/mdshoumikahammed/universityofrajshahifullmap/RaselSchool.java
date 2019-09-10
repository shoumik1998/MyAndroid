package com.example.mdshoumikahammed.universityofrajshahifullmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class RaselSchool extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rasel_school);
        imageView=(ImageView)findViewById(R.id.schoolID);
        imageView.setImageResource(R.mipmap.school);
    }
}
