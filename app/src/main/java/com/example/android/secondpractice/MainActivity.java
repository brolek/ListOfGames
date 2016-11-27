package com.example.android.secondpractice;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Movie;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.android.secondpractice.data.FInalData;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startMyService();

        button = (Button) findViewById(R.id.buttonB);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());


        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        //startService(new Intent(getBaseContext(), MyService.class));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainFragmentActivity.class);
                startActivity(intent);
            }
        });



//        GsonRequest<FInalData> gsonObjReq = new GsonRequest(
//                url,FInalData.class, null,
//                new Response.Listener<FInalData>() {
//
//
//                    @Override
//                    public void onResponse(FInalData response) {
//                        mAdapter = new MyAdapter(getApplicationContext(),response);
//                        recyclerView.setAdapter(mAdapter);
//
//                    }
//                }, new Response.ErrorListener() {
//
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//            }
//        });
//
//        // Adding request to request queue
//        AppController.getInstance().addToRequestQueue(gsonObjReq);
        // Add the scroll listener
//        recyclerView.addOnScrollListener(new EndlessRecyclerViewScrollListener(linearLayoutManager) {
//            @Override
//            public void onLoadMore(int page, int totalItemsCount) {
//                // Triggered only when new data needs to be appended to the list
//                // Add whatever code is needed to append new items to the bottom of the list
//                //customLoadMoreDataFromApi(page);
//
//
//
//
//            }
//        });
       // recyclerView.setLayoutManager(mLayoutManager);
       // recyclerView.setItemAnimator(new DefaultItemAnimator());

        //prepareMovieData();






    }

  private void startMyService(){
      Intent i = new Intent(this, MyService.class);
      startService(i);
  }



    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onEvent(MessageEvent event) {
        // UI updates must run on MainThread
        //.setText(event.message);
        //Toast.makeText(MainActivity.this, event.message.getItems().get(0).getTitle(), Toast.LENGTH_SHORT).show();
        mAdapter = new MyAdapter(getApplicationContext(),event.message);
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }



}
