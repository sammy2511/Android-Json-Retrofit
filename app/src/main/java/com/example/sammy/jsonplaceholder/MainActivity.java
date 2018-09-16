package com.example.sammy.jsonplaceholder;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    String tag_json_arry = "json_array_req";

    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        final ProgressDialog pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.show();




        ApiInterface apiService =
                BaseClient.getClient().create(ApiInterface.class);
        Log.d("Tag", "onCreate: beforecall");
        Call<List<Item>> call =apiService.getItems();
        call.enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                Log.d("", "onResponse: "+response.body().get(0));
                List<Item> items = response.body();
                itemAdapter = new ItemAdapter(items,getApplicationContext());
                recyclerView.setAdapter(itemAdapter);
                pDialog.hide();


            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                Log.d("", "onFailure: "+call.toString());
                pDialog.hide();
            }
        });


    }
}
