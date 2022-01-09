package com.example.recyclerviewcustombasicadapterinjava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.recyclerviewcustombasicadapterinjava.R;
import com.example.recyclerviewcustombasicadapterinjava.adapter.MainRecyclerViewAdapter;
import com.example.recyclerviewcustombasicadapterinjava.model.Member;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Context context;
    ArrayList<Member> members;
    MainRecyclerViewAdapter mainRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        initViews();
    }

    private void initViews() {
        RecyclerView recyclerView = findViewById(R.id.rv_main);
        members= new ArrayList();
        addMember();
        mainRecyclerViewAdapter = new MainRecyclerViewAdapter(members);
        recyclerView.setAdapter(mainRecyclerViewAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));

    }

    private void addMember() {
        for (int i = 0; i < 50; i++) {
            members.add(new Member(R.drawable.icon_person,"Matyaqubov","+998975259712"));
        }
    }
}