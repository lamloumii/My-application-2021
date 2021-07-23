package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



class Adapteer extends RecyclerView.Adapter<Adapteer.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView Point ,Direction,Prix,Date,Reference,Directoin1;

        public ViewHolder (View itemView){
            super(itemView);
            Point=itemView.findViewById(R.id.poids);
            Direction=itemView.findViewById(R.id.directions);
            Prix=itemView.findViewById(R.id.priix);
            Date=itemView.findViewById(R.id.dates);
            Reference=itemView.findViewById(R.id.references);
            Directoin1=itemView.findViewById(R.id.directions1 );
        }

    }
    Context context ;
    java.util.List<Recycle> List;
    public Adapteer(Context c , List<Recycle> RecycleList) {
        this.context=c ;
        this.List=RecycleList ;


    }


    @NonNull
    @Override
    public Adapteer.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.my_row,parent,false);
        return  new Adapteer.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapteer.ViewHolder holder, int position) {
        Recycle M = List.get(position);
        holder.Point.setText(M.getPoint());
        holder.Directoin1.setText(M.getDirection1());
        holder.Date.setText(M.getDate());
        holder.Direction.setText(M.getDirection());
        holder.Reference.setText(M.getReference());
        holder.Prix.setText(M.getPrix());
    }

    @Override
    public int getItemCount() {
        return List.size();

    }
}
