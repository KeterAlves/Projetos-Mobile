package com.example.rviewpersonalizada;

public class DtoFilme {
    private String titulo, ano, nota, genero;

    public DtoFilme(String titulo, String ano, String nota, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.nota = nota;
        this.genero = genero;
    }

    public DtoFilme(){}

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }


    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }


    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
