package com.example.recyclerapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MeuViewHolder> {

    ArrayList<DtoJogo> arrayListJogo;
    public MeuAdapter(ArrayList<DtoJogo> arrayListJogo) {
        this.arrayListJogo = arrayListJogo;
    }

    @NonNull
    @Override
    public MeuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.meu_adapter,parent,false);
        return new MeuViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MeuViewHolder holder, int position) {
        holder.textViewGenero.setText(arrayListJogo.get(position).getGenero());
        holder.textViewNome.setText(arrayListJogo.get(position).getNome());
        holder.textViewNota.setText(arrayListJogo.get(position).getNota());
        holder.textViewData.setText(arrayListJogo.get(position).getData());
        holder.imageViewJogo.setImageResource(arrayListJogo.get(position).getIdImagem());

    }

    @Override
    public int getItemCount() {
        return arrayListJogo.size();
    }

    public class MeuViewHolder extends RecyclerView.ViewHolder{
        TextView textViewNome, textViewNota, textViewGenero, textViewData;
        ImageView imageViewJogo;

        public MeuViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewData = itemView.findViewById(R.id.textViewData);
            textViewGenero = itemView.findViewById(R.id.textViewGenero);
            textViewNome = itemView.findViewById(R.id.textViewNome);
            textViewNota = itemView.findViewById(R.id.textViewNota);
            imageViewJogo =itemView.findViewById(R.id.imagemJogo);
        }
    }
}
