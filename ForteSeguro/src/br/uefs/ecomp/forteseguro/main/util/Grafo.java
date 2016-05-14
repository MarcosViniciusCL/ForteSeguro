package br.uefs.ecomp.forteseguro.main.util;


import java.util.*;

public class Grafo {
    
    private static int matrizAdjVertices[][];

    public Grafo(int numVertices) {
        matrizAdjVertices = new int[numVertices][numVertices];
    }

    public void inserirAresta(int vertex1, int vertex2, int time) {
        matrizAdjVertices[vertex1][vertex2] = time;
        matrizAdjVertices[vertex2][vertex1] = time;
    }

    public void removeAresta(int vertex1, int vertex2) {
        matrizAdjVertices[vertex1][vertex2] = 0;
        matrizAdjVertices[vertex2][vertex1] = 0;
    }

   

    public static int[][] matrizAdjVertices(){
        return matrizAdjVertices;
    }

}