package br.uefs.ecomp.forteseguro.main.controller;

import br.uefs.ecomp.forteseguro.main.util.*;
import br.uefs.ecomp.forteseguro.main.exceptions.*;
import br.uefs.ecomp.forteseguro.main.model.Rota;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Controller {

    private static Grafo grafo;
    private static List<Vertice> listVertice = new ArrayList<>();
    private static List<Aresta> listAresta = new ArrayList<>();

    public static Vertice addVertice(String nome, int x, int y) throws CampoVazioException {

        if (nome.isEmpty()) {
            throw new CampoVazioException();
        }

        Vertice vertice = new Vertice(nome, x, y);
        listVertice.add(vertice);
        return vertice;
    }

    public static Aresta addAresta(String origemNome, String destinoNome, int peso) {

        Vertice origem = buscaVertice(origemNome);
        Vertice destino = buscaVertice(destinoNome);

        Aresta aresta = new Aresta(origem, destino, peso);
        listAresta.add(aresta);
        return aresta;
    }

    public static Aresta removeAresta(String origem, String destino,int peso) {

        Aresta obj;

        obj = buscaAresta(origem, destino, peso);
        if (obj == null) {
            return null;
        }
        listAresta.remove(obj);
        return obj;
    }

    private static void removeAresta(String vertice) {
        //Remove aresta contém em um das duas extremidades o vertice enviado;
        int tamanho = listAresta.size();
        Vertice objVertice = buscaVertice(vertice);
        if (objVertice == null) {
            return;
        }
        List<Aresta> listRemoveAresta = new ArrayList<>();
        for (int j = 0; j < tamanho; j++) {
            Aresta aresta = listAresta.get(j);
            if (aresta.getOrigem().equals(objVertice) || aresta.getDestino().equals(objVertice)) {
                listRemoveAresta.add(aresta);
            }
        }
        for(Aresta a : listRemoveAresta)
            listAresta.remove(a);
       
    }

    public static Rota calcularCaminho(String origemNome, String destinoNome) {
        criarGrafo();
        Vertice origem = buscaVertice(origemNome);
        Vertice destino = buscaVertice(destinoNome);
        List<Integer> list = Dijkstra.caminho(listVertice.indexOf(origem), listVertice.indexOf(destino));
        List<Vertice> caminhoVertice = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            caminhoVertice.add(listVertice.get(list.get(i)));
        }
        return new Rota(caminhoVertice, 0);
    }

    public static Vertice removeVertice(String nome) {
        Vertice obj;
        if (listVertice.isEmpty()) {
            return null;
        }
        obj = buscaVertice(nome);
        if (obj == null) {
            return null;
        }
        removeAresta(obj.getNome());
        listVertice.remove(obj);
        return obj;
    }

    private static void criarGrafo() {
        Aresta aresta;
        grafo = new Grafo(listVertice.size());
        for (int i = 0; i < listAresta.size(); i++) {
            aresta = listAresta.get(i);
            grafo.inserirAresta(listVertice.indexOf(aresta.getOrigem()), listVertice.indexOf(aresta.getDestino()), aresta.getPeso());
        }
    }

    public static Vertice buscaVertice(String nome) {
        Iterator i = listVertice.iterator();
        Vertice obj;

        while (i.hasNext()) {
            obj = (Vertice) i.next();
            if (obj.getNome().equals(nome)) {
                return obj;
            }
        }
        return null;
    }

    public static Aresta buscaAresta(String nome1, String nome2, int peso) {
        for (Aresta aresta : listAresta) {
            if (aresta.getOrigem().equals(buscaVertice(nome1)) && aresta.getDestino().equals(buscaVertice(nome2)) && aresta.getPeso() == peso) {
                return aresta;
            }
        }
        return null;
    }

    public static List<Aresta> getListaAresta() {
        return listAresta;
    }

    public static List<Vertice> getListaVertices() {
        return listVertice;
    }

    public static void apagarTudo() {
        listAresta.clear();
        listVertice.clear();
    }

}
