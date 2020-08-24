package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<DtoJogo> arrayListJogo = new ArrayList<>();
RecyclerView recyclerViewJogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewJogo = findViewById(R.id.recyclerViewJogo);

        carregaJogos();

        MeuAdapter adapter = new MeuAdapter(arrayListJogo);

        recyclerViewJogo.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerViewJogo.setAdapter(adapter);
    }

    private void carregaJogos() {
        DtoJogo jogo1 = new DtoJogo("Megaman","Plataforma", "1987", "10", R.drawable.megaman);
        DtoJogo jogo2 = new DtoJogo("Street Fighter","Luta", "1987", "8",R.drawable.street);
        DtoJogo jogo3 = new DtoJogo("God of War","Ação", "2005", "10", R.drawable.god);
        DtoJogo jogo4 = new DtoJogo("The last of us","Aventura", "2013", "10", R.drawable.thelast);
        DtoJogo jogo5 = new DtoJogo("League of legends","MOBA", "2009", "6", R.drawable.league);

        arrayListJogo.add(jogo1);
        arrayListJogo.add(jogo2);
        arrayListJogo.add(jogo3);
        arrayListJogo.add(jogo4);
        arrayListJogo.add(jogo5);
    }
}