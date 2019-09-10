package com.example.mdshoumikahammed.universityofrajshahifullmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {
    ArrayList<String> buildingnames=new ArrayList<>(Arrays.asList("প্রথম বিজ্ঞান ভবন",
            "দ্বিতীয় বিজ্ঞান ভবন","তৃতীয় বিজ্ঞান ভবন","চতুর্থ বিজ্ঞান ভবন","ইসমাইল হোসেন সিরাজী ভবন",
            "মমতাজ উদ্দিন কলা ভবন","শহীদুল্লাহ কলা ভবন","রবীন্দ্র ভবন","রাজশাহী বিশ্ববিদ্যালয় স্কুল","কৃষি অনুষদ ভবন",
            "চারুকলা ভবন"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.reID);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        TheAdapter adapter=new TheAdapter(this,buildingnames);
        recyclerView.setAdapter(adapter);
    }
}
