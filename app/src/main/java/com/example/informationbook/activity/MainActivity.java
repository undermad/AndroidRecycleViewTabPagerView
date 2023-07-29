package com.example.informationbook.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.informationbook.model.ModelClass;
import com.example.informationbook.R;
import com.example.informationbook.adapter.AdapterClass;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<ModelClass> categories;
    private AdapterClass adapterClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        categories = new ArrayList<>();

        ModelClass moon = new ModelClass("moon", "Moon");
        ModelClass earth = new ModelClass("earth", "Earth");
        ModelClass saturn = new ModelClass("saturn", "Saturn");
        ModelClass uran = new ModelClass("uran", "Uran");

        categories.add(moon);
        categories.add(earth);
        categories.add(saturn);
        categories.add(uran);

        adapterClass = new AdapterClass(categories, this);
        recyclerView.setAdapter(adapterClass);





    }
}