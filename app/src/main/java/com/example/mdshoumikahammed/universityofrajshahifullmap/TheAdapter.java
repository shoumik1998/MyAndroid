package com.example.mdshoumikahammed.universityofrajshahifullmap;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class TheAdapter extends RecyclerView.Adapter<TheViewHolder> {
    ArrayList<String> buildingNames;
    Context c;

    public TheAdapter(Context c,ArrayList<String> buildingNames) {
        this.c=c;
        this.buildingNames=buildingNames;

    }

    @NonNull
    @Override
    public TheViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.names,parent,false);
        TheViewHolder TVH=new TheViewHolder(v);

        return TVH;
    }

    @Override
    public void onBindViewHolder(@NonNull TheViewHolder holder, final int position) {
        holder.textView.setText(buildingNames.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0){
                    Intent intent=new Intent(c,First.class);
                    ((Main2Activity)c).startActivityForResult(intent,1);
                }
                if (position==1){
                    Intent intent=new Intent(c,Second.class);
                    ((Main2Activity)c).startActivityForResult(intent,2);
                }
                if (position==2){
                    Intent intent=new Intent(c,Third.class);
                    ((Main2Activity)c).startActivityForResult(intent,3);
                }
                if (position==3){
                    Intent intent=new Intent(c,Fourth.class);
                    ((Main2Activity)c).startActivityForResult(intent,4);
                }
                if (position==4){
                    Intent intent=new Intent(c,Shirajy.class);
                    ((Main2Activity)c).startActivityForResult(intent,5);
                }
                if (position==5){
                    Intent intent=new Intent(c,Momotaj.class);
                    ((Main2Activity)c).startActivityForResult(intent,6);
                }
                if (position==6){
                    Intent intent=new Intent(c,Shohidullah.class);
                    ((Main2Activity)c).startActivityForResult(intent,7);
                }
                if (position==7){
                    Intent intent=new Intent(c,Robindro.class);
                    ((Main2Activity)c).startActivityForResult(intent,8);
                }
                if (position==8){
                    Intent intent=new Intent(c,RaselSchool.class);
                    ((Main2Activity)c).startActivityForResult(intent,9);
                }
                if (position==9){
                    Intent intent=new Intent(c,Agriculture.class);
                    ((Main2Activity)c).startActivityForResult(intent,10);
                }
                if (position==10){
                    Intent intent=new Intent(c,Charukola.class);
                    ((Main2Activity)c).startActivityForResult(intent,11);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return buildingNames.size();
    }
}
