package com.example.shoppingappproductui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    List<Data> data;
    Context mContext;

    public RecyclerAdapter(List<Data> data, Context mContext) {
        this.data = data;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        holder.brand.setText(data.get(position).getBrand());
        holder.amount.setText(data.get(position).getAmount());
        holder.image.setImageResource(data.get(position).getImage());
        holder.ratingBar.setRating(data.get(position).getRating());



    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image, popUp,favourite;
        TextView amount, brand;
        RatingBar ratingBar;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_view);
            amount = itemView.findViewById(R.id.price);
            brand = itemView.findViewById(R.id.brand);
            ratingBar = itemView.findViewById(R.id.rating_bar);
            favourite=itemView.findViewById(R.id.favourite);
            popUp = itemView.findViewById(R.id.pop_up_menu);

            popUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PopupMenu popupMenu=new PopupMenu(mContext,v);
                    popupMenu.inflate(R.menu.recycler_poup);
                    popupMenu.show();
                }
            });
        }
    }
}
