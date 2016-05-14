/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.forteseguro.main.view;

import br.uefs.ecomp.forteseguro.main.controller.Controller;
import br.uefs.ecomp.forteseguro.main.exceptions.CampoVazioException;
import br.uefs.ecomp.forteseguro.main.model.Rota;
import br.uefs.ecomp.forteseguro.main.util.Aresta;
import br.uefs.ecomp.forteseguro.main.util.Vertice;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Principal extends JFrame {

    public Principal() {
        initComponents();
    }

    public static JComboBox getJComboBox() {
        return jComboBoxListaVertices;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoNovaAresta = new javax.swing.JButton();
        jComboBoxListaVertices = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jToggleButtonNovoPonto = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxListaArestas = new javax.swing.JComboBox<>();
        labelRodape = new javax.swing.JLabel();
        panelDesenho = new javax.swing.JPanel();
        jLabelModoNovoPonto = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemLimpaTudo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 250));

        botaoNovaAresta.setText("Nova Aresta");
        botaoNovaAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovaArestaActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista de Pontos:");

        jToggleButtonNovoPonto.setText("Novo Ponto");
        jToggleButtonNovoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonNovoPontoActionPerformed(evt);
            }
        });

        jButton1.setText("Caminho");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir Ponto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir Aresta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Lista de Aresta:");

        jComboBoxListaArestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListaArestasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoNovaAresta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxListaVertices, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButtonNovoPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBoxListaArestas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButtonNovoPonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoNovaAresta)
                .addGap(5, 5, 5)
                .addComponent(jButton3)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxListaVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxListaArestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        labelRodape.setText(" ");

        panelDesenho.setBackground(new java.awt.Color(255, 255, 255));
        panelDesenho.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDesenho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDesenhoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDesenhoLayout = new javax.swing.GroupLayout(panelDesenho);
        panelDesenho.setLayout(panelDesenhoLayout);
        panelDesenhoLayout.setHorizontalGroup(
            panelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        panelDesenhoLayout.setVerticalGroup(
            panelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jLabelModoNovoPonto.setText(" ");

        jMenu1.setText("Arquivo");

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ferramentas");

        jMenuItemLimpaTudo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemLimpaTudo.setText("Limpar Tudo");
        jMenuItemLimpaTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLimpaTudoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemLimpaTudo);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Mostrar Matriz");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelModoNovoPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelRodape)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelModoNovoPonto)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovaArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovaArestaActionPerformed
        if (jComboBoxListaVertices.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Não há pontos cadastrados");
            return;
        }
        if (jComboBoxListaVertices.getItemCount() < 2) {
            JOptionPane.showMessageDialog(null, "Tem que haver no mínimo 2 pontos cadastrados");
            return;
        }
        JanelaAddAresta janelaAddAresta = new JanelaAddAresta(jComboBoxListaVertices);
        janelaAddAresta.setLocationRelativeTo(null);
        janelaAddAresta.setVisible(true);
    }//GEN-LAST:event_botaoNovaArestaActionPerformed

    private static void mostraMensagemRodape(String texto, long segundos) {

//        try {
        labelRodape.setText(texto);
//            g.wait(segundos);
        //           labelRodape.setText("");
        //       } catch (InterruptedException ex) {
        //           Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        //       }

    }

    public static void removeAresta(String origem, String destino, String peso) {
        Controller.removeAresta(origem, destino, Integer.parseInt(peso));
        atualizarInterfaceGrafica();
    }

    private static void atualizarListaVertice() {
        Iterator i = Controller.getListaVertices().iterator();
        Vertice obj;
        jComboBoxListaVertices.removeAllItems();

        while (i.hasNext()) {
            obj = (Vertice) i.next();
            jComboBoxListaVertices.addItem(obj.getNome());
        }
    }

    private static void atualizarListaAresta() {
        Iterator i = Controller.getListaAresta().iterator();
        Aresta obj;
        jComboBoxListaArestas.removeAllItems();

        while (i.hasNext()) {
            obj = (Aresta) i.next();
            jComboBoxListaArestas.addItem(obj.getOrigem().getNome() + "-" + obj.getDestino().getNome() + ":" + obj.getPeso());
        }
    }

    private void jToggleButtonNovoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonNovoPontoActionPerformed
        if (jToggleButtonNovoPonto.isSelected()) {
            jLabelModoNovoPonto.setText("Modo criar nó: UP");
        } else {
            jLabelModoNovoPonto.setText("Modo criar nó: DOWN");
        }

    }//GEN-LAST:event_jToggleButtonNovoPontoActionPerformed

    private void panelDesenhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDesenhoMouseClicked
        if (jToggleButtonNovoPonto.isSelected()) {
            criarVertice(evt);
        }

    }//GEN-LAST:event_panelDesenhoMouseClicked

    private void criarVertice(java.awt.event.MouseEvent evt) {
        int x = evt.getX();
        int y = evt.getY();
        //Verificando se existe ponto onde houve o clique
        for (int h = 0; h < jComboBoxListaVertices.getItemCount(); h++) {
            Vertice v = Controller.buscaVertice(jComboBoxListaVertices.getItemAt(h));
            boolean colidiu = colisao(x, y, 25, 25, v.getX(), v.getY(), 25, 25);
            if (colidiu) {
                JOptionPane.showMessageDialog(null, "Não é possivel criar um ponto neste lugar");
                return;
            }
        }
        String nome = JOptionPane.showInputDialog("Nome do ponto");
        for (int i = 0; i < jComboBoxListaVertices.getItemCount(); i++) {
            String teste = jComboBoxListaVertices.getItemAt(i);
            if (teste.equals(nome)) {
                JOptionPane.showMessageDialog(null, "Nome já existe");
                return;
            }
        }
        if (nome != null) {
            try {
                Controller.addVertice(nome, x, y);
                mostraMensagemRodape("Nó criado com sucesso", 5000);
            } catch (CampoVazioException ex) {
                JOptionPane.showMessageDialog(null, "Escreva um nome");
            }
        }
        atualizarInterfaceGrafica();

    }

    public static void removeVertice(String nome) {
        Controller.removeVertice(nome);
        atualizarInterfaceGrafica();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jComboBoxListaVertices.getItemCount() < 3) {
            JOptionPane.showMessageDialog(null, "Tem que haver no mínimo 3 pontos cadastrados");
            return;
        }
        JanelaCaminho janelaCaminho = new JanelaCaminho(jComboBoxListaVertices);
        janelaCaminho.setLocationRelativeTo(null);
        janelaCaminho.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItemLimpaTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLimpaTudoActionPerformed
        panelDesenho.paint(panelDesenho.getGraphics());
        Controller.apagarTudo();
        atualizarInterfaceGrafica();
    }//GEN-LAST:event_jMenuItemLimpaTudoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jComboBoxListaVertices.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Lista de pontos vazia");
            return;
        }
        JanelaExcluirVertice janela = new JanelaExcluirVertice(jComboBoxListaVertices);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jComboBoxListaArestas.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Lista de arestas vazia");
            return;
        }
        JanelaExcluirAresta janela = new JanelaExcluirAresta(jComboBoxListaArestas);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jComboBoxListaArestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListaArestasActionPerformed
        int retorno = JOptionPane.showConfirmDialog(null, "Editar aresta selecionada?");
        if(retorno == 1){
            
        }
    }//GEN-LAST:event_jComboBoxListaArestasActionPerformed

    public static void criarAresta(String origem, String destino, int peso) {
        Graphics g = panelDesenho.getGraphics();
        Vertice vert1 = Controller.buscaVertice(origem);
        Vertice vert2 = Controller.buscaVertice(destino);
        Controller.addAresta(origem, destino, peso);
        atualizarInterfaceGrafica();

//        g.drawLine(vert1.getX(), vert1.getY(), vert2.getX(), vert2.getY());
//        g.drawString(peso + "", vert1.getX() + vert2.getX() / 2, vert1.getY() + vert2.getY() / 2);
        mostraMensagemRodape("Aresta cria com sucesso: " + origem + " <-----> " + destino, 50000);
    }

    public static void verificaCaminho(String partida, String coleta, String chegada) {
        Rota ateColeta = Controller.calcularCaminho(partida, coleta);
        Iterator i = ateColeta.getCaminho().iterator();
        Graphics2D g2d = (Graphics2D) panelDesenho.getGraphics();
        g2d.setStroke(new BasicStroke(5));
        Vertice obj2 = (Vertice) i.next(), obj;
        while (i.hasNext()) {
            obj = obj2;
            obj2 = (Vertice) i.next();
            g2d.setColor(Color.GREEN);
            g2d.drawLine(obj.getX(), obj.getY(), obj2.getX(), obj2.getY());
        }
        int retorno = JOptionPane.showConfirmDialog(null, "Mostrar caminho de coletor até chegada?");
        if (retorno == 0) {
            Rota ateChegada = Controller.calcularCaminho(coleta, chegada);
            i = ateChegada.getCaminho().iterator();
            obj2 = (Vertice) i.next();
            while (i.hasNext()) {
                obj = obj2;
                obj2 = (Vertice) i.next();
                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.BLUE);
                g2d.drawLine(obj.getX(), obj.getY(), obj2.getX(), obj2.getY());
            }
            mostraMensagemRodape("VERDE: Partida até coleta | AZUL: Coleta até Chegada", 5000);
        }
    }

    public static void atualizarInterfaceGrafica() {
        //Redesenha todo o grafo na tela
        panelDesenho.paintAll(panelDesenho.getGraphics());
        Graphics2D g = (Graphics2D) panelDesenho.getGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //Desenhando os vertices do grafo
        for (Vertice vert : Controller.getListaVertices()) {
            g.fillOval(vert.getX() - 15, vert.getY() - 15, 25, 25);
            g.drawString(vert.getNome(), vert.getX() - 5, vert.getY() - 20);
        }
        //Desenhando as arestas do grafo
        for (Aresta a : Controller.getListaAresta()) {
            g.drawLine(a.getOrigem().getX(), a.getOrigem().getY(), a.getDestino().getX(), a.getDestino().getY());
        }
        atualizarListaAresta();
        atualizarListaVertice();
    }

    private boolean colisao(int obj1X, int obj1Y, int obj1W, int obj1H, int obj2X, int obj2Y, int obj2W, int obj2H) {
        //Verifica se dois objetos estão colidindo
        if ((obj1X >= obj2X && obj1X <= obj2X + obj2W) && (obj1Y >= obj2Y && obj1Y <= obj2Y + obj2H)) {
            return true;
        } else if ((obj1X + obj1W >= obj2X && obj1X + obj1W <= obj2X + obj2W) && (obj1Y >= obj2Y && obj1Y <= obj2Y + obj2H)) {
            return true;
        } else if ((obj1X >= obj2X && obj1X <= obj2X + obj2W) && (obj1Y + obj1H >= obj2Y && obj1Y + obj1H <= obj2Y + obj2H)) {
            return true;
        } else if ((obj1X + obj1W >= obj2X && obj1X + obj1W <= obj2X + obj2W) && (obj1Y + obj1H >= obj2Y && obj1Y + obj1H <= obj2Y + obj2H)) {
            return true;
        } else {
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoNovaAresta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private static javax.swing.JComboBox<String> jComboBoxListaArestas;
    private static javax.swing.JComboBox<String> jComboBoxListaVertices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelModoNovoPonto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemLimpaTudo;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButtonNovoPonto;
    private static javax.swing.JLabel labelRodape;
    private static javax.swing.JPanel panelDesenho;
    // End of variables declaration//GEN-END:variables
}
