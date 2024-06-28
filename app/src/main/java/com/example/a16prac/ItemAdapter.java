package com.example.a16prac;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Converter;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private Context context;
    private List<Items> filmArrayList;

    public ItemAdapter(Context context, List<Items> filmArrayList){
        this.context = context;
        this.filmArrayList = filmArrayList;
    }


    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card,parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        Items page = filmArrayList.get(position);
        holder.tv.setText(page.getNameRu());
        holder.tv_rating.setText("Рейтинг кинопоиск: "+ String.valueOf(page.getRatingKinopoisk()));
        Picasso.with(context).load(page.getPosterUrlPreview()).into(holder.iv);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ItemDetailView.class);
                intent.putExtra("id",page.getId());
                intent.putExtra("Poster", page.getPosterUrl());
                intent.putExtra("Name", page.getNameRu() );
                intent.putExtra("NameOriginal",page.getNameOriginal());
                intent.putExtra("Description", page.getDescription());
                v.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return filmArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv_rating;
        TextView tv;
        ImageView iv;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_rating = itemView.findViewById(R.id.item_rating);
            tv = itemView.findViewById(R.id.item_tv);
            iv = itemView.findViewById(R.id.item_iv);
        }

    }
}
