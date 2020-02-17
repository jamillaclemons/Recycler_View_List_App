package com.example.recyclerviewlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.recyclerviewlistapp.R.layout.recycler_view_item;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] items;
    String[] prices;
    String[] descriptions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        recyclerView = findViewById(R.id.myRecyclerListView);
        for (String s : items = res.getStringArray(R.array.items)) {

            
        }

        for (String s : prices = res.getStringArray(R.array.prices)) {

        }

        for (String s : descriptions = res.getStringArray(R.array.descriptions)) {

        }



    }
}
