/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.forteseguro.main.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author User
 */
public class Dijkstra {
    
    private static int matrizAdjVertices[][];
    private static final int INDEFINIDO = -1;
    
    public static List<Integer> getVizinhos(int vertex) {
        List<Integer> vizinhos = new ArrayList<>();
        for (int i = 0; i < matrizAdjVertices[vertex].length; i++)
            if (matrizAdjVertices[vertex][i] > 0) {
                vizinhos.add(i);
            }

        return vizinhos;
    }

    public static List<Integer> caminho(int inicio, int fim) {

        matrizAdjVertices = Grafo.matrizAdjVertices();
        int custo[] = new int[matrizAdjVertices.length];
        int prev[] = new int[matrizAdjVertices.length];
        Set<Integer> semVisitar = new HashSet<>();

        custo[inicio] = 0;

        for (int v = 0; v < matrizAdjVertices.length; v++) {
            if (v != inicio) {
                custo[v] = Integer.MAX_VALUE;
            }
            prev[v] = INDEFINIDO;
            semVisitar.add(v);
        }
        while (!semVisitar.isEmpty()) {
            int indexMaisProximo = maisProximo(custo, semVisitar);
            semVisitar.remove(indexMaisProximo);

            for (Integer vizinho : getVizinhos(indexMaisProximo)) {
                int custoTotal = custo[indexMaisProximo] + getCusto(indexMaisProximo, vizinho);
                if (custoTotal < custo[vizinho]) {
                    custo[vizinho] = custoTotal;
                    prev[vizinho] = indexMaisProximo;
                }
            }
            if (indexMaisProximo == fim) {
                return menorDistancia(prev, indexMaisProximo);
            }
        }

        return Collections.emptyList();
        
    }

    private static int maisProximo(int[] dist, Set<Integer> semVisitar) {
        double minDist = Integer.MAX_VALUE;
        int minIndex = 0;
        for (Integer i : semVisitar) {
            if (dist[i] < minDist) {
                minDist = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static int getCusto(int vertex1, int vertex2) {
        return matrizAdjVertices[vertex1][vertex2];
    }

    private static List<Integer> menorDistancia(int[] prev, int u) {
        List<Integer> caminho = new ArrayList<>();
        caminho.add(u);
        while (prev[u] != INDEFINIDO) {
            caminho.add(prev[u]);
            u = prev[u];
        }
        Collections.reverse(caminho);
        return caminho;
    }
}
