package com.example.rviewpersonalizada;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MeuViewHolder> {


    ArrayList<DtoFilme> arrayListFilme;
    public MeuAdapter(ArrayList<DtoFilme> arrayListFilme) {
        this.arrayListFilme = arrayListFilme;
    }

    @NonNull
    @Override
    public MeuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista  = LayoutInflater.from(parent.getContext()).inflate(R.layout.meu_adapter, parent, false);
        return new MeuViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MeuViewHolder holder, int position) {
        holder.textViewNota.setText(arrayListFilme.get(position).getNota());
        holder.textViewTitulo.setText(arrayListFilme.get(position).getTitulo());
        holder.textViewGenero.setText(arrayListFilme.get(position).getGenero());
        holder.textViewAno.setText(arrayListFilme.get(position).getAno());

    }

    @Override
    public int getItemCount() {
        return arrayListFilme.size();
    }

    public class MeuViewHolder extends RecyclerView.ViewHolder{
        TextView textViewTitulo, textViewNota, textViewGenero, textViewAno;

        public MeuViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewAno = itemView.findViewById(R.id.textViewAno);
            textViewTitulo = itemView.findViewById(R.id.textViewTtulo);
            textViewGenero = itemView.findViewById(R.id.textViewGenero);
            textViewNota = itemView.findViewById(R.id.textViewNota);

        }
    }

}
