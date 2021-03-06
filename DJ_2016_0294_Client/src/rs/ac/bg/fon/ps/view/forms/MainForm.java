/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.forms;

import rs.ac.bg.fon.ps.domain.Korisnik;

/**
 *
 * @author GaGiiiii
 */
public class MainForm extends javax.swing.JFrame {

    private Korisnik korisnik;

    public MainForm(Korisnik korisnik) {
        initComponents();
        this.korisnik = korisnik;
        setLocationRelativeTo(null);
        setTitle("Main form");
        loggedInAs.setText(korisnik.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loggedInAs = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        kreirajFilm = new javax.swing.JMenuItem();
        kreirajSalu = new javax.swing.JMenuItem();
        kreirajProjekciju = new javax.swing.JMenuItem();
        kreirajDnevniRaspored = new javax.swing.JMenuItem();
        PretraziFilmove = new javax.swing.JMenuItem();
        PretraziSale = new javax.swing.JMenuItem();
        PretraziProjekcije = new javax.swing.JMenuItem();
        IzmeniDnevniRaspored = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ulogovani kao: ");

        loggedInAs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loggedInAs.setForeground(new java.awt.Color(255, 0, 0));
        loggedInAs.setText("USER");

        jMenu1.setText("Sistemske operacije");

        kreirajFilm.setText("Kreiraj film");
        kreirajFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kreirajFilmActionPerformed(evt);
            }
        });
        jMenu1.add(kreirajFilm);

        kreirajSalu.setText("Kreiraj salu");
        kreirajSalu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kreirajSaluActionPerformed(evt);
            }
        });
        jMenu1.add(kreirajSalu);

        kreirajProjekciju.setText("Kreiraj projekciju");
        kreirajProjekciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kreirajProjekcijuActionPerformed(evt);
            }
        });
        jMenu1.add(kreirajProjekciju);

        kreirajDnevniRaspored.setText("Kreiraj dnevni raspored");
        kreirajDnevniRaspored.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kreirajDnevniRasporedActionPerformed(evt);
            }
        });
        jMenu1.add(kreirajDnevniRaspored);

        PretraziFilmove.setText("Pretrazi filmove");
        PretraziFilmove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PretraziFilmoveActionPerformed(evt);
            }
        });
        jMenu1.add(PretraziFilmove);

        PretraziSale.setText("Pretrazi sale");
        PretraziSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PretraziSaleActionPerformed(evt);
            }
        });
        jMenu1.add(PretraziSale);

        PretraziProjekcije.setText("Pretrazi projekcije");
        PretraziProjekcije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PretraziProjekcijeActionPerformed(evt);
            }
        });
        jMenu1.add(PretraziProjekcije);

        IzmeniDnevniRaspored.setText("Izmeni dnevni raspored");
        IzmeniDnevniRaspored.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzmeniDnevniRasporedActionPerformed(evt);
            }
        });
        jMenu1.add(IzmeniDnevniRaspored);

        exitItem.setText("Exit");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loggedInAs, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 253, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loggedInAs)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PretraziProjekcijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PretraziProjekcijeActionPerformed
        PretraziProjekcijeForm ptp = new PretraziProjekcijeForm(this, true);
        ptp.setVisible(true);
    }//GEN-LAST:event_PretraziProjekcijeActionPerformed

    private void kreirajFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kreirajFilmActionPerformed
        ZapamtiFilmForm kff = new ZapamtiFilmForm(this, true);
        kff.setVisible(true);
    }//GEN-LAST:event_kreirajFilmActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void kreirajSaluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kreirajSaluActionPerformed
        ZapamtiSaluForm ksf = new ZapamtiSaluForm(this, true);
        ksf.setVisible(true);
    }//GEN-LAST:event_kreirajSaluActionPerformed

    private void kreirajProjekcijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kreirajProjekcijuActionPerformed
        ZapamtiProjekcijuForm kpf = new ZapamtiProjekcijuForm(this, true);
        kpf.setVisible(true);
    }//GEN-LAST:event_kreirajProjekcijuActionPerformed

    private void PretraziFilmoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PretraziFilmoveActionPerformed
        PretraziFilmoveForm ptf = new PretraziFilmoveForm(this, true);
        ptf.setVisible(true);
    }//GEN-LAST:event_PretraziFilmoveActionPerformed

    private void PretraziSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PretraziSaleActionPerformed
        PretraziSaleForm pts = new PretraziSaleForm(this, true);
        pts.setVisible(true);
    }//GEN-LAST:event_PretraziSaleActionPerformed

    private void kreirajDnevniRasporedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kreirajDnevniRasporedActionPerformed
        ZapamtiDnevniRasporedForm kdrf = new ZapamtiDnevniRasporedForm(this, true);
        kdrf.setVisible(true);
    }//GEN-LAST:event_kreirajDnevniRasporedActionPerformed

    private void IzmeniDnevniRasporedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzmeniDnevniRasporedActionPerformed
        IzmeniDnevniRasporedForm idrf = new IzmeniDnevniRasporedForm(this, true);
        idrf.setVisible(true);
    }//GEN-LAST:event_IzmeniDnevniRasporedActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem IzmeniDnevniRaspored;
    private javax.swing.JMenuItem PretraziFilmove;
    private javax.swing.JMenuItem PretraziProjekcije;
    private javax.swing.JMenuItem PretraziSale;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem kreirajDnevniRaspored;
    private javax.swing.JMenuItem kreirajFilm;
    private javax.swing.JMenuItem kreirajProjekciju;
    private javax.swing.JMenuItem kreirajSalu;
    private javax.swing.JLabel loggedInAs;
    // End of variables declaration//GEN-END:variables
}
