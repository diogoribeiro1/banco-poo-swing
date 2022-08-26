/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.banco.view;

import br.banco.dao.ClienteDao;
import br.banco.dao.CorrenteDao;
import br.banco.dao.PoupancaDao;
import br.banco.model.Cliente;
import br.banco.model.ContaCorrente;
import br.banco.model.ContaPoupanca;
import br.banco.model.Gerente;
//import com.mysql.cj.protocol.a.LocalDateTimeValueEncoder;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo
 */
public class FrmCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadastro
     */
    public FrmCadastroCliente() {
        initComponents();
        preencherBoxId();
        preencherComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGerar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        cboxTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Número:");

        btnGerar.setText("Gerar ");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        cboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Tipo:");

        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnGerar))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(cboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(84, 84, 84)
                        .addComponent(btnVoltar)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnVoltar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGerar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FrmPrincipal principal = new FrmPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            Gerente gerente = new Gerente();
            //BUSCANDO OS ITENS SELECIONADOS
            int tipoConta = box.getSelectedIndex();
            String nome = txtNome.getText();
            int cpf = Integer.parseInt(txtCpf.getText());
            int numero = Integer.parseInt(txtNumero.getText());
            int idGerente = FrmLoginGerente.gerenteLogin.getId();
            String tipo1 = (String) cboxTipo.getSelectedItem();
            char tipo = tipo1.charAt(0);

            //Fazendo o parse da Data
            ZoneId defaultZoneId = ZoneId.systemDefault();
            LocalDate todaysDate = LocalDate.now();
            Date dataFormat = Date.from(todaysDate.atStartOfDay(defaultZoneId).toInstant());
            java.sql.Date dataSql = new java.sql.Date(dataFormat.getTime());

            //VERIFICANDO  SE O CLIENTE JÁ EXISTE E POSSUE CONTA
            ClienteDao cliDao = new ClienteDao();
            Cliente cliente = cliDao.selectForNomeCpf(nome, cpf);
            if (cliente == null && tipoConta == 0) {
                Cliente cli = new Cliente(cpf, nome);
                gerente.cadastraCliente(cli);
                Cliente cliente2 = cliDao.selectForNomeCpf(nome, cpf);
                ContaCorrente conta = new ContaCorrente(tipo, numero, idGerente, cliente2.getIdCLiente(), 0.0);
                gerente.cadastraContaCorrente(conta);
                JOptionPane.showMessageDialog(null, "Conta Corrente Criada com Sucesso!");
                FrmCadastroCliente frmCadCli = new FrmCadastroCliente();
                frmCadCli.setVisible(true);
                dispose();
            } else if (cliente == null && tipoConta == 1) {
                Cliente cli = new Cliente(cpf, nome);
                gerente.cadastraCliente(cli);
                Cliente cliente2 = cliDao.selectForNomeCpf(nome, cpf);
                ContaPoupanca conta = new ContaPoupanca(dataSql, numero, idGerente, cliente2.getIdCLiente(), 0.0);
                gerente.cadastraContaPoupanca(conta);
                JOptionPane.showMessageDialog(null, "Conta Corrente Criada com Sucesso!");
                FrmCadastroCliente frmCadCli = new FrmCadastroCliente();
                frmCadCli.setVisible(true);
                dispose();
            } else if (cliente != null && tipoConta == 0) {
                CorrenteDao corDao = new CorrenteDao();
                ContaCorrente contaCor = corDao.selectForIdCliente(cliente.getIdCLiente());
                if (contaCor != null) {
                    JOptionPane.showMessageDialog(null, "Conta Corrente já existe");
                } else {
                    ContaCorrente conta = new ContaCorrente(tipo, numero, idGerente, cliente.getIdCLiente(), 0.0);
                    gerente.cadastraContaCorrente(conta);
                    JOptionPane.showMessageDialog(null, "Conta Corrente Criada com Sucesso!");
                    FrmCadastroCliente frmCadCli = new FrmCadastroCliente();
                    frmCadCli.setVisible(true);
                    dispose();
                }
            } else if (cliente != null && tipoConta == 1) {
                PoupancaDao pouDao = new PoupancaDao();
                ContaPoupanca contaPou = pouDao.selectForIdCliente(cliente.getIdCLiente());
                if (contaPou != null) {
                    JOptionPane.showMessageDialog(null, "Conta Poupança já existe");
                } else {
                    ContaPoupanca conta = new ContaPoupanca(dataSql, numero, idGerente, cliente.getIdCLiente(), 0.0);
                    gerente.cadastraContaPoupanca(conta);
                    JOptionPane.showMessageDialog(null, "Conta Corrente Criada com Sucesso!");
                    FrmCadastroCliente frmCadCli = new FrmCadastroCliente();
                    frmCadCli.setVisible(true);
                    dispose();
                }
            }
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro!");
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        Random gerador = new Random();
        //imprime sequência de 10 números inteiros aleatórios
        txtNumero.setText(String.valueOf(gerador.nextInt(10000)));
    }//GEN-LAST:event_btnGerarActionPerformed
    private void preencherBoxId() {
        cboxTipo.removeAllItems();
        cboxTipo.addItem("S");
        cboxTipo.addItem("E");
    }

    private void preencherComboBox() {
        box.removeAllItems();
        box.addItem("Conta Corrente");
        box.addItem("Conta Poupança");
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
