package com.dest1.GTA.V.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jogo {
    @Id
    private int id;
    private String nome;
    private String genero;
    private String platafroma;
    private int anoLancamento;
    private String imagem;
    private String descricao;

public Jogo(){
}

    public Jogo(int id, String nome, String genero, String platafroma, int anoLancamento, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.platafroma = platafroma;
        this.anoLancamento = anoLancamento;
        this.imagem = imagem;
        this.descricao = descricao;
    }

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

    public String getPlatafroma() {
        return platafroma;
    }

    public void setPlatafroma(String platafroma) {
        this.platafroma = platafroma;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}