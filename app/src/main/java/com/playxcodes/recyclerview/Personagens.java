package com.playxcodes.recyclerview;

public class Personagens {

    private String nome;
    private String info;
    private int foto;

    public Personagens(){

    }


    public Personagens(String nome, String info, int foto) {
        this.nome = nome;
        this.info = info;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
