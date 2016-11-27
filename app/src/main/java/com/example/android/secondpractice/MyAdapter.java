package com.example.android.secondpractice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.secondpractice.data.FInalData;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Bartek on 2016-07-20.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private FInalData fInalDataList;
    private Context context;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, url;
        public ImageView photo;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.titleTextView);
            url = (TextView) view.findViewById(R.id.urlTextView);
            photo = (ImageView) view.findViewById(R.id.photoImageView);
        }
    }


    public MyAdapter(Context context, FInalData finalDataList) {
        this.fInalDataList = finalDataList;
        this.context = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_element, parent, false);


        //LinearLayout linearLayout = (LinearLayout) itemView.findViewById(R.id.goTo);


//        linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                activity.startActivity(intent);
//            }
//        });


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        //FInalData finalData = fInalDataList.get(position);
        holder.title.setText(fInalDataList.getItems().get(position).getTitle());
        holder.url.setText(fInalDataList.getItems().get(position).getUrl());
        //holder.photo.setImageDrawable(context.getResources().getDrawable(R.mipmap.ic_launcher));
        Uri uri = Uri.parse(fInalDataList.getItems().get(position).getImage());
        Picasso.with(context).load(uri)

                .into(holder.photo);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(fInalDataList.getItems().get(position).getUrl()); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                holder.itemView.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return fInalDataList.getItems().size();
    }
}