package com.example.strangerthings;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.jar.Attributes;


    class strangeradapter extends RecyclerView.Adapter{
    ArrayList<strangerthings> pArray;
    Context context;

    public strangeradapter(ArrayList<strangerthings> pArray, Context context) {
        this.pArray = pArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
       ViewHolder io = new ViewHolder(V);
        return io;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img.setImageResource(pArray.get(position).getImage());
        ((ViewHolder) holder).Name.setText(pArray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Intent kl = new Intent( context,MainActivity3.class);
                        kl.putExtra("Name",pArray.get(position));
                         context.startActivity(kl);
            }
        });


    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img ;
        public TextView Name ;
        public View view ;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView);
            Name = itemView.findViewById(R.id.textView3);

        }
    }
}






