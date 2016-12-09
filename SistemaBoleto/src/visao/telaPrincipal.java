/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.jrimum.bopepo.BancosSuportados;
import org.jrimum.bopepo.Boleto;
import static org.jrimum.bopepo.exemplo.Exemplos.mostreBoletoNaTela;
import org.jrimum.bopepo.view.BoletoViewer;
import org.jrimum.domkee.comum.pessoa.endereco.CEP;
import org.jrimum.domkee.comum.pessoa.endereco.Endereco;
import org.jrimum.domkee.comum.pessoa.endereco.UnidadeFederativa;
import org.jrimum.domkee.financeiro.banco.febraban.Agencia;
import org.jrimum.domkee.financeiro.banco.febraban.Carteira;
import org.jrimum.domkee.financeiro.banco.febraban.Cedente;
import org.jrimum.domkee.financeiro.banco.febraban.ContaBancaria;
import org.jrimum.domkee.financeiro.banco.febraban.NumeroDaConta;
import org.jrimum.domkee.financeiro.banco.febraban.Sacado;
import org.jrimum.domkee.financeiro.banco.febraban.SacadorAvalista;
import org.jrimum.domkee.financeiro.banco.febraban.TipoDeTitulo;
import org.jrimum.domkee.financeiro.banco.febraban.Titulo;

public class telaPrincipal extends javax.swing.JFrame {

   telaCedente telaCedente = new telaCedente();
    telaContaBancaria telaContaBancaria = new telaContaBancaria();
    telaSacadoAvalista telaSacadoAvalista = new telaSacadoAvalista();
    telaSacado telaSacado = new telaSacado();
    telaDadosDoTitulo telaDadosDoTitulo = new telaDadosDoTitulo();
    telaDadosDoBoleto telaDadosDoBoleto = new telaDadosDoBoleto();
    public telaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GeradorDeBoletoLabel = new javax.swing.JLabel();
        cedente = new javax.swing.JButton();
        sacado = new javax.swing.JButton();
        contaBancaria = new javax.swing.JButton();
        sacadoAvalista = new javax.swing.JButton();
        dadosDoTitulo = new javax.swing.JButton();
        gerarBoleto = new javax.swing.JButton();
        dadosDoBoleto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GeradorDeBoletoLabel.setFont(new java.awt.Font("URW Gothic L", 1, 18)); // NOI18N
        GeradorDeBoletoLabel.setForeground(new java.awt.Color(1, 1, 1));
        GeradorDeBoletoLabel.setText(" BOLETOS BANCÁRIOS");

        cedente.setText("Cedente");
        cedente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedenteActionPerformed(evt);
            }
        });

        sacado.setText("Sacado");
        sacado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacadoActionPerformed(evt);
            }
        });

        contaBancaria.setText("Conta Bancaria");
        contaBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contaBancariaActionPerformed(evt);
            }
        });

        sacadoAvalista.setText("Sacado avalista");
        sacadoAvalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacadoAvalistaActionPerformed(evt);
            }
        });

        dadosDoTitulo.setText("Dados do Titulo");
        dadosDoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadosDoTituloActionPerformed(evt);
            }
        });

        gerarBoleto.setText("Gerar boleto");
        gerarBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarBoletoActionPerformed(evt);
            }
        });

        dadosDoBoleto.setText("Dados do Boleto");
        dadosDoBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadosDoBoletoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(GeradorDeBoletoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cedente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sacado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sacadoAvalista)
                    .addComponent(dadosDoTitulo)
                    .addComponent(gerarBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dadosDoBoleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contaBancaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeradorDeBoletoLabel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedente)
                    .addComponent(contaBancaria)
                    .addComponent(sacadoAvalista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadosDoBoleto)
                    .addComponent(sacado)
                    .addComponent(dadosDoTitulo))
                .addGap(31, 31, 31)
                .addComponent(gerarBoleto)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedenteActionPerformed
         telaCedente.setVisible(true);
         telaCedente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_cedenteActionPerformed

    private void sacadoAvalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacadoAvalistaActionPerformed
        telaSacadoAvalista.setVisible(true);
        telaSacadoAvalista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_sacadoAvalistaActionPerformed

    private void contaBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contaBancariaActionPerformed
        telaContaBancaria.setVisible(true);
        telaContaBancaria.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_contaBancariaActionPerformed

    private void sacadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacadoActionPerformed
        telaSacado.setVisible(true);
        telaSacado.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_sacadoActionPerformed

    private void dadosDoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadosDoTituloActionPerformed
        telaDadosDoTitulo.setVisible(true);
        telaDadosDoTitulo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_dadosDoTituloActionPerformed

    private void dadosDoBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadosDoBoletoActionPerformed
       telaDadosDoBoleto.setVisible(true);
       telaDadosDoBoleto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_dadosDoBoletoActionPerformed

    private void gerarBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarBoletoActionPerformed
        Cedente cedente = new Cedente(telaCedente.NomeDaEmpresa, telaCedente.CNPJEmpresa);
        
        Sacado sacado = new Sacado(telaSacado.Nome, telaSacado.CPF);
        
        
        
    }//GEN-LAST:event_gerarBoletoActionPerformed
        
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GeradorDeBoletoLabel;
    private javax.swing.JButton cedente;
    private javax.swing.JButton contaBancaria;
    private javax.swing.JButton dadosDoBoleto;
    private javax.swing.JButton dadosDoTitulo;
    private javax.swing.JButton gerarBoleto;
    private javax.swing.JButton sacado;
    private javax.swing.JButton sacadoAvalista;
    // End of variables declaration//GEN-END:variables
}
