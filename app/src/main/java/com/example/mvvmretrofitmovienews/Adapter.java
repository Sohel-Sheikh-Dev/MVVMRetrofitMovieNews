package com.example.mvvmretrofitmovienews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    private ArrayList<Model> movieResponseArrayList = new ArrayList<>();

    public Adapter(Context context, ArrayList<Model> movieResponseArrayList) {
        this.context = context;
        this.movieResponseArrayList = movieResponseArrayList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.tvTitle.setText(movieResponseArrayList.get(position).getTitle());
        holder.tvOverview.setText(movieResponseArrayList.get(position).getOverview());
    }

    @Override
    public int getItemCount() {
        return movieResponseArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle, tvOverview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.title);
            tvOverview = itemView.findViewById(R.id.overview);

        }
    }
}
