package com.example.android.secondpractice;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.android.secondpractice.data.FInalData;
import com.example.android.secondpractice.data.Item;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bartek on 2016-07-21.
 */
public class MyService extends IntentService{

    String url = "http://www.wikia.com/api/v1/Wikis/List?expand=1&hub=Gaming&lang=en&limit=10&batch=1";
    private List<FInalData> finalDataList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private int i=0;
    private Handler handler = new Handler();
    private FInalData fInalData;
    public MyService() {
        super("myService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        GsonRequest<FInalData> gsonObjReq = new GsonRequest(
                url,FInalData.class, null,
                new Response.Listener<FInalData>() {


                    @Override
                    public void onResponse(FInalData response) {

                        fInalData = response;
                        EventBus.getDefault().postSticky(new MessageEvent(fInalData));

                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(gsonObjReq);

    }



}
