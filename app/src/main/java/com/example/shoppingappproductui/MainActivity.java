package com.example.shoppingappproductui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    Toolbar toolbar;
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    List<Data> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recycler_view);
        setSupportActionBar(toolbar);
        getSupportActionBar();


        list = new ArrayList<>();
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        adapter = new RecyclerAdapter(list, this);

        list.add(new Data(R.drawable.creatoess, "$28", "Creatoess", 3));
        list.add(new Data(R.drawable.krassa, "$25", "Krassa", 4));
        list.add(new Data(R.drawable.ligero, "$23", "Ligero", 5));
        list.add(new Data(R.drawable.longwalk, "$255", "Longwalk", 4));
        list.add(new Data(R.drawable.sparx, "$30", "Sparx", 3));
        list.add(new Data(R.drawable.sportstar, "$28", "Sportstar", 3));
        list.add(new Data(R.drawable.creatoess, "$28", "Creatoess", 3));
        list.add(new Data(R.drawable.krassa, "$25", "Krassa", 4));
        list.add(new Data(R.drawable.ligero, "$23", "Ligero", 5));
        list.add(new Data(R.drawable.longwalk, "$255", "Longwalk", 4));
        list.add(new Data(R.drawable.sparx, "$30", "Sparx", 3));
        list.add(new Data(R.drawable.sportstar, "$28", "Sportstar", 3));
        list.add(new Data(R.drawable.creatoess, "$28", "Creatoess", 3));
        list.add(new Data(R.drawable.krassa, "$25", "Krassa", 4));
        list.add(new Data(R.drawable.ligero, "$23", "Ligero", 5));
        list.add(new Data(R.drawable.longwalk, "$255", "Longwalk", 4));
        list.add(new Data(R.drawable.sparx, "$30", "Sparx", 3));
        list.add(new Data(R.drawable.sportstar, "$28", "Sportstar", 3));


        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cart:
                Toast.makeText(this, "Cart", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}