package com.example.strangerthings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle b = getIntent().getExtras();
        strangerthings p= (strangerthings) b.getSerializable("Name");

        ImageView img = findViewById(R.id.imageView2);
        TextView name = findViewById(R.id.textView4);
        TextView actorname = findViewById(R.id.textView5);
        TextView actorage = findViewById(R.id.textView6);

        img.setImageResource(p.getImage());
        name.setText(p.getName());
        actorage.setText("Attack"+p.getActorage());
        actorname.setText("Defence"+p.getActorname());
    }
}