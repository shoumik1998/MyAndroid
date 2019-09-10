package com.example.mdshoumikahammed.universityofrajshahifullmap;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class TheViewHolder extends RecyclerView.ViewHolder {
            TextView textView;
    public TheViewHolder(@NonNull View itemView) {
        super(itemView);

        textView=(TextView)itemView.findViewById(R.id.buildingID);
    }
}
