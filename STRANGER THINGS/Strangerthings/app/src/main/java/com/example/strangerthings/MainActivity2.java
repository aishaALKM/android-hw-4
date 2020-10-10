package com.example.strangerthings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<strangerthings>  upside = new ArrayList<>();


        strangerthings s1 = new strangerthings("Eleven",R.drawable.e11,"Millie",16);
        strangerthings s2 = new strangerthings("Max",R.drawable.max,"Sadie",18);
        strangerthings s3 = new strangerthings("Nancy",R.drawable.nan,"Natalia",22);
        strangerthings s4 = new strangerthings("Dustin",R.drawable.dustybun,"Gaten",18);
        strangerthings s5 = new strangerthings("Mike",R.drawable.mikef,"Finn",18);
        strangerthings s6 = new strangerthings("Steve",R.drawable.steee,"Harrington",16);
        strangerthings s7 = new strangerthings("Will",R.drawable.wiilll,"Noah",15);
        strangerthings s8 = new strangerthings("Joyce",R.drawable.popcorn,"Winona",49);

        upside.add(s1);
        upside.add(s2);
        upside.add(s3);
        upside.add(s4);
        upside.add(s5);
        upside.add(s6);
        upside.add(s7);
        upside.add(s8);

        RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager kp = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(kp);

        strangeradapter po = new strangeradapter(upside,this);
        recyclerView.setAdapter(po);







    }
}