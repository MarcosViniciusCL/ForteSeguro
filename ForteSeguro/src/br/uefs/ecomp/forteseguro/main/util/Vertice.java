package br.uefs.ecomp.forteseguro.main.util;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private static int sequencia = 1;
    private int id;
    private String nome;
    int x;
    int y;
    private boolean estaNaArvore;

    public Vertice(String nome, int x, int y) {
        this.id = sequencia++;
        this.nome = nome;
        this.x = x;
        this.y = y;
        this.estaNaArvore = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean estaNaArvore() {
        return estaNaArvore;
    }

    public void setEstaNaArvore(boolean x) {
        this.estaNaArvore = x;
    }
}
