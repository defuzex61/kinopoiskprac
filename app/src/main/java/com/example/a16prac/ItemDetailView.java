package com.example.a16prac;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ItemDetailView extends AppCompatActivity {
    ApiInterface apiInterface;
    ImageView imageView;
    TextView filmInfo;
    TextView Description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail_view);

        Intent intent = getIntent();


        imageView = findViewById(R.id.imageView);
        filmInfo = findViewById(R.id.filmInfo);
        Description = findViewById(R.id.filmDescription);
        apiInterface = ServiceBuilder.buildRequest().create(ApiInterface.class);

        Call<Items> getList = apiInterface.getListFilmInfo(intent.getIntExtra("id", 1));
        getList.enqueue(new Callback<Items>() {
            @Override
            public void onResponse(Call<Items> call, Response<Items> response) {
                Picasso.with(getApplicationContext()).load(intent.getStringExtra("Poster")).into(imageView);
                filmInfo.setText(intent.getStringExtra("Name")+ " \n" + intent.getStringExtra("NameOriginal"));
                Description.setText(intent.getStringExtra("Description"));
            }

            @Override
            public void onFailure(Call<Items> call, Throwable t) {
                Toast.makeText(ItemDetailView.this, "Ошибка ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}