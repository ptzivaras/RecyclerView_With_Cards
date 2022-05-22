package com.example.recyclerview_cards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;//Bridge between data and image/ arrayList and RecyclerView
    private RecyclerView.LayoutManager mLayoutManager;//allign single items in our list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem("Line 1", "Line 2"));
        exampleList.add(new ExampleItem("Line 3", "Line 4"));
        exampleList.add(new ExampleItem( "Line 5", "Line 6"));
        exampleList.add(new ExampleItem("Line 7", "Line 8"));
        exampleList.add(new ExampleItem( "Line 9", "Line 10"));
        exampleList.add(new ExampleItem("Line 11", "Line 12"));
        exampleList.add(new ExampleItem("Line 13", "Line 14"));
        exampleList.add(new ExampleItem("Line 15", "Line 16"));
        exampleList.add(new ExampleItem("Line 17", "Line 18"));
        exampleList.add(new ExampleItem("Line 19", "Line 20"));
        exampleList.add(new ExampleItem("Line 21", "Line 22"));
        exampleList.add(new ExampleItem("Line 23", "Line 24"));
        exampleList.add(new ExampleItem("Line 25", "Line 26"));
        exampleList.add(new ExampleItem("Line 27", "Line 28"));
        exampleList.add(new ExampleItem("Line 29", "Line 30"));
        exampleList.add(new ExampleItem("Line 1", "Line 2"));
        exampleList.add(new ExampleItem("Line 3", "Line 4"));
        exampleList.add(new ExampleItem( "Line 5", "Line 6"));
        exampleList.add(new ExampleItem("Line 7", "Line 8"));
        exampleList.add(new ExampleItem( "Line 9", "Line 10"));
        exampleList.add(new ExampleItem("Line 11", "Line 12"));
        exampleList.add(new ExampleItem("Line 13", "Line 14"));
        exampleList.add(new ExampleItem("Line 15", "Line 16"));
        exampleList.add(new ExampleItem("Line 17", "Line 18"));
        exampleList.add(new ExampleItem("Line 19", "Line 20"));
        exampleList.add(new ExampleItem("Line 21", "Line 22"));
        exampleList.add(new ExampleItem("Line 23", "Line 24"));
        exampleList.add(new ExampleItem("Line 25", "Line 26"));
        exampleList.add(new ExampleItem("Line 27", "Line 28"));
        exampleList.add(new ExampleItem("Line 29", "Line 30"));
        exampleList.add(new ExampleItem("Line 1", "Line 2"));
        exampleList.add(new ExampleItem("Line 3", "Line 4"));
        exampleList.add(new ExampleItem( "Line 5", "Line 6"));
        exampleList.add(new ExampleItem("Line 70", "Line 8"));
        exampleList.add(new ExampleItem( "Line 9", "Line 10"));
        exampleList.add(new ExampleItem("Line 11", "Line 12"));
        exampleList.add(new ExampleItem("Line 13", "Line 14"));
        exampleList.add(new ExampleItem("Line 105", "Line 16"));
        exampleList.add(new ExampleItem("Line 17", "Line 18"));
        exampleList.add(new ExampleItem("Line 109", "Line 20"));
        exampleList.add(new ExampleItem("Line 21", "Line 22"));
        exampleList.add(new ExampleItem("Line 23", "Line 24"));
        exampleList.add(new ExampleItem("Line 2445", "Line 26"));
        exampleList.add(new ExampleItem("Line 27", "Line 280"));
        exampleList.add(new ExampleItem("Line 299999", "Line 300"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}