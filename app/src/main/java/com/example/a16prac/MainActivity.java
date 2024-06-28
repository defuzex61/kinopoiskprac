package com.example.a16prac;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;
    static RecyclerView recyclerView;
    static  ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        apiInterface = ServiceBuilder.buildRequest().create(ApiInterface.class);
        bottomNav = findViewById(R.id.bottomNavigationView);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.top_rating:
                        Call<ItemsPage> getList = apiInterface.getListFilms();
                        FilmsRequest(getList);
                        return true;
                    case R.id.expected:
                        Call<ItemsPage> getExpectedList = apiInterface.getListExpectedFilms();
                        FilmsRequest(getExpectedList);
                        return true;
                }

                return false;
            }
        });


     }

     private void FilmsRequest(Call<ItemsPage> getList){
         getList.enqueue(new Callback<ItemsPage>() {
             @Override
             public void onResponse(Call<ItemsPage> call, Response<ItemsPage> response) {
                 recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                 recyclerView.setHasFixedSize(true);
                 ItemsPage list = response.body();
                 ItemAdapter adapter = new ItemAdapter(MainActivity.this, list.getItems());
                 recyclerView.setAdapter(adapter);
             }

             @Override
             public void onFailure(Call<ItemsPage> call, Throwable t) {
                 Toast.makeText(MainActivity.this, "Ошибка ", Toast.LENGTH_SHORT).show();
                 TextView check;
                 check= findViewById(R.id.check);
                 check.setText(String.valueOf(t));

             }
         });

     }
}