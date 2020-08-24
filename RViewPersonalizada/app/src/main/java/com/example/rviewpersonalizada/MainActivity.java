package com.example.rviewpersonalizada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<DtoFilme> arrayListFilme = new ArrayList<>();
    RecyclerView recyclerViewFilme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewFilme = findViewById(R.id.recyclerViewFilme);

        carregaFilmes();
        MeuAdapter adapter  = new MeuAdapter(arrayListFilme);

        recyclerViewFilme.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerViewFilme.setAdapter(adapter);

    }

    private void carregaFilmes() {
        DtoFilme filme = new DtoFilme("A procura da felicidade", "2007", "10", "Drama");
        DtoFilme filme2 = new DtoFilme("O mar não ta pra peixe", "2006", "8", "Animação");
        DtoFilme filme3 = new DtoFilme("Pokemon", "20xx", "10", "Animação");
        DtoFilme filme4 = new DtoFilme("Vingadores:Ultimato", "2019", "9", "Ação");
        DtoFilme filme5 = new DtoFilme("Kimi no nawa", "2018", "9", "Sci-fi");
        DtoFilme filme6 = new DtoFilme("Bunny girl", "2018", "8", "Sci-fi");

        arrayListFilme.add(filme);
        arrayListFilme.add(filme2);
        arrayListFilme.add(filme3);
        arrayListFilme.add(filme4);
        arrayListFilme.add(filme5);
        arrayListFilme.add(filme6);

    }
}