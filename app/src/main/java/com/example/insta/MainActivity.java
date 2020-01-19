package com.example.insta;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView r;
MycustomAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=(RecyclerView)findViewById(R.id.recyclerView);
        ad=new MycustomAdapter(this,data.getData());
        r.setAdapter(ad);
        r.setLayoutManager(new LinearLayoutManager(this));

    }
}