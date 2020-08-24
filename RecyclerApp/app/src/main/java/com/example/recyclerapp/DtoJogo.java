package com.example.recyclerapp;

public class DtoJogo {
    private String nome, genero, data, nota;



    private int idImagem;

    public DtoJogo(String nome, String genero, String data, String nota, int idImagem) {
        this.nome = nome;
        this.genero = genero;
        this.data = data;
        this.nota = nota;
        this.idImagem = idImagem;
    }


    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    public DtoJogo(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
