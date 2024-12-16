/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proiect_java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author jh0nix
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        SERIEL = new javax.swing.JLabel();
        MARIME_BECL = new javax.swing.JLabel();
        INALTIMEL = new javax.swing.JLabel();
        CULOAREL = new javax.swing.JLabel();
        BATERIEL = new javax.swing.JLabel();
        MARIME_BEC = new javax.swing.JTextField();
        SERIE = new javax.swing.JTextField();
        INALTIME = new javax.swing.JTextField();
        CULOARE = new javax.swing.JTextField();
        BATERIE = new javax.swing.JTextField();
        Adaugare = new javax.swing.JButton();
        Stergere = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        REZISTENT_APA = new javax.swing.JTextField();
        TIP_MATERIAL = new javax.swing.JTextField();
        NIVEL_LUMINA = new javax.swing.JTextField();
        TIP_BEC = new javax.swing.JTextField();
        PUTERE = new javax.swing.JTextField();
        TIP_LAMPA = new javax.swing.JTextField();
        TIP_LAMPAL = new javax.swing.JLabel();
        REZISTENT_APAL = new javax.swing.JLabel();
        TIP_MATERIALL = new javax.swing.JLabel();
        NIVEL_LUMINAL = new javax.swing.JLabel();
        TIP_BECL = new javax.swing.JLabel();
        PUTEREL = new javax.swing.JLabel();
        Import = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERIE", "MARIME BEC", "INALTIME", "CULOARE", "BATERIE", "REZISTENT APA", "TIP MATERIAL", "NIVEL LUMINA", "TIP BEC", "PUTERE"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        SERIEL.setText("SERIE");

        MARIME_BECL.setText("MARIME BEC");

        INALTIMEL.setText("INALTIME");

        CULOAREL.setText("CULOARE");

        BATERIEL.setText("BATERIE");

        MARIME_BEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MARIME_BECActionPerformed(evt);
            }
        });

        SERIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SERIEActionPerformed(evt);
            }
        });

        INALTIME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INALTIMEActionPerformed(evt);
            }
        });

        CULOARE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CULOAREActionPerformed(evt);
            }
        });

        BATERIE.setText(" ");

        Adaugare.setText("Adaugare");
        Adaugare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaugareActionPerformed(evt);
            }
        });

        Stergere.setText("Stergere");
        Stergere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StergereActionPerformed(evt);
            }
        });

        jButton1.setText("Filtrare");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TIP_LAMPAL.setText("TIP_LAMPA");

        REZISTENT_APAL.setText("REZISTENT APA");

        TIP_MATERIALL.setText("TIP MATERIAL");

        NIVEL_LUMINAL.setText("NIVEL LUMINA");

        TIP_BECL.setText("TIP_BEC");

        PUTEREL.setText("PUTERE");

        Import.setText("IMPORT");
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(REZISTENT_APAL)
                            .addComponent(TIP_MATERIALL)
                            .addComponent(NIVEL_LUMINAL)
                            .addComponent(TIP_BECL)
                            .addComponent(PUTEREL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PUTERE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(TIP_BEC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NIVEL_LUMINA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TIP_MATERIAL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(REZISTENT_APA, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MARIME_BECL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(INALTIME, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(CULOARE)
                                    .addComponent(MARIME_BEC)
                                    .addComponent(BATERIE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(INALTIMEL)
                                    .addComponent(CULOAREL)
                                    .addComponent(BATERIEL)
                                    .addComponent(SERIEL)
                                    .addComponent(TIP_LAMPAL))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TIP_LAMPA)
                                    .addComponent(SERIE, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Adaugare)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Stergere, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Import)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SERIEL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TIP_LAMPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TIP_LAMPAL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SERIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MARIME_BEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MARIME_BECL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INALTIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INALTIMEL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CULOARE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CULOAREL))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BATERIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BATERIEL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(REZISTENT_APA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(REZISTENT_APAL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TIP_MATERIAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TIP_MATERIALL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIVEL_LUMINA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NIVEL_LUMINAL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TIP_BEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TIP_BECL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PUTERE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PUTEREL))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Adaugare)
                            .addComponent(Stergere))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Import)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MARIME_BECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MARIME_BECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MARIME_BECActionPerformed

    private void SERIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SERIEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SERIEActionPerformed

    private void INALTIMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INALTIMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INALTIMEActionPerformed

    private void CULOAREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CULOAREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CULOAREActionPerformed

    private void AdaugareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaugareActionPerformed
   DefaultTableModel model = (DefaultTableModel) tabel.getModel();
    String tipObiect = TIP_LAMPA.getText().trim();

    if (tipObiect.equalsIgnoreCase("Lampa")) {
        Lampa lampa = new Lampa();
        lampa.setserie(SERIE.getText().trim());
        lampa.setmarime_bec(Integer.parseInt(MARIME_BEC.getText().trim()));
        lampa.setInaltime(Integer.parseInt(INALTIME.getText().trim()));
        lampa.setCuloare(CULOARE.getText().trim());
        lampa.setcuBaterie(Boolean.parseBoolean(BATERIE.getText().trim()));

        model.addRow(new Object[]{
            lampa.getserie(),
            lampa.getmarime_bec(),
            lampa.getInaltime(),
            lampa.getCuloare(),
            lampa.getcuBaterie(),
            "-", "-", "-", "-", "-", "-", "-" 
        });
    } else if (tipObiect.equalsIgnoreCase("Lampa Exterioara")) {
        LampaExterioara lampaExt = new LampaExterioara();
        lampaExt.setserie(SERIE.getText().trim());
        lampaExt.setmarime_bec(Integer.parseInt(MARIME_BEC.getText().trim()));
        lampaExt.setInaltime(Integer.parseInt(INALTIME.getText().trim()));
        lampaExt.setCuloare(CULOARE.getText().trim());
        lampaExt.setcuBaterie(Boolean.parseBoolean(BATERIE.getText().trim()));
        lampaExt.setrezistent_apa(Boolean.parseBoolean(REZISTENT_APA.getText().trim()));
        lampaExt.settip_MaterialCarcasa(TIP_MATERIAL.getText().trim());

        model.addRow(new Object[]{
            lampaExt.getserie(),
            lampaExt.getmarime_bec(),
            lampaExt.getInaltime(),
            lampaExt.getCuloare(),
            lampaExt.getcuBaterie(),
            lampaExt.getrezistent_apa(),
            lampaExt.gettip_MaterialCarcasa(),
            "-", "-", "-", "-" // Coloană goală pentru alte tipuri
        });
    } else if (tipObiect.equalsIgnoreCase("Sursa Iluminat")) {
        SursaIluminat sursa = new SursaIluminat();
        sursa.setserie(SERIE.getText().trim());
        sursa.setmarime_bec(Integer.parseInt(MARIME_BEC.getText().trim()));
        sursa.setInaltime(Integer.parseInt(INALTIME.getText().trim()));
        sursa.setCuloare(CULOARE.getText().trim());
        sursa.setcuBaterie(Boolean.parseBoolean(BATERIE.getText().trim()));
        sursa.settip_bec(TIP_BEC.getText().trim());
        sursa.setputere(Integer.parseInt(PUTERE.getText().trim()));
        sursa.setdurata_lumina(Integer.parseInt(NIVEL_LUMINA.getText().trim()));
        sursa.setalimentare(REZISTENT_APA.getText().trim());
        sursa.settip_lumina(TIP_MATERIAL.getText().trim());

        model.addRow(new Object[]{
            sursa.getserie(),
            sursa.getmarime_bec(),
            sursa.getInaltime(),
            sursa.getCuloare(),
            sursa.getcuBaterie(),
            "-", "-", 
            sursa.getdurata_lumina(),
            sursa.gettip_lumina(),
            sursa.gettip_bec(),
            sursa.getputere()
        });
    }
    }//GEN-LAST:event_AdaugareActionPerformed
            
    private void StergereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StergereActionPerformed
       
        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        
    int randselectat = tabel.getSelectedRow(); 
    if (randselectat != -1) {
    
        model.removeRow(randselectat);
    } 
    }//GEN-LAST:event_StergereActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     DefaultTableModel model = (DefaultTableModel) tabel.getModel();
    
   
    List<Object[]> toateDatele = new ArrayList<>();
    for (int i = 0; i < model.getRowCount(); i++) {
        Object[] row = new Object[model.getColumnCount()];
        for (int j = 0; j < model.getColumnCount(); j++) {
            row[j] = model.getValueAt(i, j);
        }
        toateDatele.add(row);
    }

    // Golim tabelul pentru a reintroduce doar rândurile care trec filtrul
    model.setRowCount(0);

    // Citim valorile introduse de utilizator pentru filtrare
    String serieFiltru = SERIE.getText().trim();
    String culoareFiltru = CULOARE.getText().trim();
    String tipBecFiltru = TIP_BEC.getText().trim();
    String baterieFiltru = BATERIE.getText().trim(); // True/False
    String putereFiltru = PUTERE.getText().trim(); // Numerică

    // Parcurgem fiecare rând salvat și verificăm condițiile
    for (Object[] row : toateDatele) {
        boolean adauga = true;

        // Condiția pentru SERIE
        if (!serieFiltru.isEmpty() && !row[0].toString().equals(serieFiltru)) {
            adauga = false;
        }

        // Condiția pentru CULOARE
        if (!culoareFiltru.isEmpty() && !row[3].toString().equals(culoareFiltru)) {
            adauga = false;
        }

        // Condiția pentru TIP_BEC (valabil doar pentru SursaIluminat)
        if (!tipBecFiltru.isEmpty() && row[8] != null && !row[8].toString().equals(tipBecFiltru)) {
            adauga = false;
        }

        // Condiția pentru BATERIE (true/false)
        if (!baterieFiltru.isEmpty() && !row[4].toString().equals(baterieFiltru)) {
            adauga = false;
        }

        // Condiția pentru PUTERE (numerică, valabilă doar pentru SursaIluminat)
        if (!putereFiltru.isEmpty()) {
            try {
                int putere = Integer.parseInt(putereFiltru);
                if (row[9] != null && Integer.parseInt(row[9].toString()) != putere) {
                    adauga = false;
                }
            } catch (NumberFormatException e) {
                
                adauga = false;
            }
        }

        // Dacă trece toate condițiile, îl reintroducem în tabel
        if (adauga) {
            model.addRow(row);
        }
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
        // TODO add your handling code here:
        
           JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this); //FISIERRUL SELECTAT
        if (returnValue == JFileChooser.APPROVE_OPTION) { //VERIFICA DACA FISIERUL ESTE VALID
            File file = fileChooser.getSelectedFile();

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                DefaultTableModel model = (DefaultTableModel) tabel.getModel();


                model.setRowCount(0);

               
                while ((line = br.readLine()) != null) {
                    
                    StringTokenizer st = new StringTokenizer(line, ",");
                    String[] rowData = new String[model.getColumnCount()];

                    int i = 0;
                    while (st.hasMoreTokens()) {
                        rowData[i++] = st.nextToken();
                    }
                    model.addRow(rowData);
                }
                JOptionPane.showMessageDialog(this, "Datele au fost încărcate cu succes!");
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            }        }
    }//GEN-LAST:event_ImportActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adaugare;
    private javax.swing.JTextField BATERIE;
    private javax.swing.JLabel BATERIEL;
    private javax.swing.JTextField CULOARE;
    private javax.swing.JLabel CULOAREL;
    private javax.swing.JTextField INALTIME;
    private javax.swing.JLabel INALTIMEL;
    private javax.swing.JButton Import;
    private javax.swing.JTextField MARIME_BEC;
    private javax.swing.JLabel MARIME_BECL;
    private javax.swing.JTextField NIVEL_LUMINA;
    private javax.swing.JLabel NIVEL_LUMINAL;
    private javax.swing.JTextField PUTERE;
    private javax.swing.JLabel PUTEREL;
    private javax.swing.JTextField REZISTENT_APA;
    private javax.swing.JLabel REZISTENT_APAL;
    private javax.swing.JTextField SERIE;
    private javax.swing.JLabel SERIEL;
    private javax.swing.JButton Stergere;
    private javax.swing.JTextField TIP_BEC;
    private javax.swing.JLabel TIP_BECL;
    private javax.swing.JTextField TIP_LAMPA;
    private javax.swing.JLabel TIP_LAMPAL;
    private javax.swing.JTextField TIP_MATERIAL;
    private javax.swing.JLabel TIP_MATERIALL;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
