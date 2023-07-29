package com.example.informationbook.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.informationbook.*;
import com.example.informationbook.activity.EarthActivity;
import com.example.informationbook.activity.MoonActivity;
import com.example.informationbook.activity.SaturnActivity;
import com.example.informationbook.model.ModelClass;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder> {

    private List<ModelClass> modelClassList;
    private Context context;

    public AdapterClass(List<ModelClass> modelClassList, Context context) {
        this.modelClassList = modelClassList;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CardViewHolder holder, int position) {

        ModelClass model = modelClassList.get(position);
        holder.textViewSplash.setText(model.getCategoryName());
        holder.imageViewSplash.setImageResource(
                context.getResources().getIdentifier(
                        model.getImageName(), "drawable", context.getPackageName()));

        holder.cardView.setOnClickListener(v -> {

            if (position == 0) {
                Intent intent = new Intent(context, MoonActivity.class);
                context.startActivity(intent);
            } else if (position == 1) {
                Intent intent = new Intent(context, EarthActivity.class);
                context.startActivity(intent);
            } else if (position == 2) {
                Intent intent = new Intent(context, SaturnActivity.class);
                context.startActivity(intent);
            } else if (position == 3) {
                Intent intent = new Intent(context, SaturnActivity.class);
                context.startActivity(intent);
            }

        });


    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }


    public class CardViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewSplash;
        private TextView textViewSplash;
        private CardView cardView;

        public CardViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);


            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textViewSplash = itemView.findViewById(R.id.textViewSplash);
            cardView = itemView.findViewById(R.id.cadView);
        }
    }

}
