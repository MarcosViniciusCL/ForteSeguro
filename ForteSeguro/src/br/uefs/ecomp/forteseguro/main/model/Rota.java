/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.forteseguro.main.model;

import br.uefs.ecomp.forteseguro.main.util.Vertice;
import java.util.List;

/**
 *
 * @author User
 */
public class Rota {
    
    private List<Integer> caminho;
    private int tempo;
    
    public Rota(List caminho, int tempo) {
        this.caminho = caminho;
        this.tempo = tempo;
    }

    public List getCaminho() {
        return caminho;
    }

    public int getTempo() {
        return tempo;
    }
    
}
