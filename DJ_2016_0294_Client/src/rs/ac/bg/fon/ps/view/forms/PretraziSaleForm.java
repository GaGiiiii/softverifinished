/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.forms;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import rs.ac.bg.fon.ps.communication.Response;
import rs.ac.bg.fon.ps.controllerC.ControllerC;
import rs.ac.bg.fon.ps.domain.IDomain;
import rs.ac.bg.fon.ps.domain.Sala;
import rs.ac.bg.fon.ps.view.tableModels.SalaTableModel;

/**
 *
 * @author GaGiiiii
 */
public class PretraziSaleForm extends javax.swing.JDialog {

    private SalaTableModel tableModel;
    private Sala selectedSala;

    public PretraziSaleForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        setTitle("Pretrazivanje sala");
        init();
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
        jLabel3 = new javax.swing.JLabel();
        naziv = new javax.swing.JTextField();
        pretraziBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        saleTable = new javax.swing.JTable();
        salaInfoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        klima = new javax.swing.JLabel();
        has3D = new javax.swing.JLabel();
        nazivInfo = new javax.swing.JLabel();
        brojMesta = new javax.swing.JLabel();
        vipMesta = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("PRETRAZI SALE");

        jLabel3.setText("Unesi naziv");

        pretraziBtn.setText("PRETRAZI");
        pretraziBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretraziBtnActionPerformed(evt);
            }
        });

        saleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(saleTable);

        jLabel2.setText("BROJ MESTA");

        jLabel4.setText("NAZIV:");

        jLabel5.setText("3D");

        jLabel7.setText("VIP MESTA");

        jLabel8.setText("KLIMA");

        klima.setText("jLabel11");

        has3D.setText("jLabel11");

        nazivInfo.setText("jLabel11");

        brojMesta.setText("jLabel11");

        vipMesta.setText("jLabel11");

        closeBtn.setText("ZATVORI");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout salaInfoPanelLayout = new javax.swing.GroupLayout(salaInfoPanel);
        salaInfoPanel.setLayout(salaInfoPanelLayout);
        salaInfoPanelLayout.setHorizontalGroup(
            salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salaInfoPanelLayout.createSequentialGroup()
                        .addGroup(salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(klima, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(salaInfoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vipMesta, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(salaInfoPanelLayout.createSequentialGroup()
                                .addGroup(salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(67, 67, 67)
                                .addGroup(salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(brojMesta, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nazivInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(salaInfoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(has3D, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(salaInfoPanelLayout.createSequentialGroup()
                        .addGroup(salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(closeBtn))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        salaInfoPanelLayout.setVerticalGroup(
            salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nazivInfo))
                .addGap(18, 18, 18)
                .addGroup(salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brojMesta)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(vipMesta))
                .addGap(18, 18, 18)
                .addGroup(salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(klima))
                .addGap(18, 18, 18)
                .addGroup(salaInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(has3D))
                .addGap(18, 18, 18)
                .addComponent(closeBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salaInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(naziv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pretraziBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(naziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pretraziBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salaInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pretraziBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretraziBtnActionPerformed
        try {

            String nazivf = naziv.getText();
            LinkedList<IDomain> sale = new LinkedList<>();
            Response res = ControllerC.getInstance().pretraziSale(nazivf, sale);

            if (res.getException() == null) {
                List<Sala> list1 = (List<Sala>) res.getResponse();
                if (list1.size() == 0) {
                    JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje sale po zadatoj vrednosti", "Neuspesno pretrazivanje sala", JOptionPane.ERROR_MESSAGE);
                } else {
                    tableModel = new SalaTableModel((List<Sala>) res.getResponse());
                    saleTable.setModel(tableModel);
                    JOptionPane.showMessageDialog(this, "Sistem je pronasao sale po zadatoj vrednosti", "Uspesno pretrazivanje sala", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje sale po zadatoj vrednosti", "Neuspesno pretrazivanje sala", JOptionPane.ERROR_MESSAGE);
                res.getException().printStackTrace();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje sale po zadatoj vrednosti", "Greska prilikom pretrazivanja sala", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_pretraziBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        salaInfoPanel.setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brojMesta;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel has3D;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel klima;
    private javax.swing.JTextField naziv;
    private javax.swing.JLabel nazivInfo;
    private javax.swing.JButton pretraziBtn;
    private javax.swing.JPanel salaInfoPanel;
    private javax.swing.JTable saleTable;
    private javax.swing.JLabel vipMesta;
    // End of variables declaration//GEN-END:variables

    private void init() {
        try {
            salaInfoPanel.setVisible(false);

            LinkedList<Sala> sale = new LinkedList<>();
            sale = ControllerC.getInstance().ucitajListuSala(sale);

            tableModel = new SalaTableModel(sale);
            saleTable.setModel(tableModel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        saleTable.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    Sala sala = (Sala) tableModel.getValueAtRow(row);
                    try {
                        Sala sala2;
                        sala2 = (Sala) ControllerC.getInstance().nadjiSalu(sala).getResponse();
                        selectedSala = sala2;
                        salaInfoPanel.setVisible(true);
                        nazivInfo.setText(sala2.getNaziv());
                        brojMesta.setText(sala2.getBroj_mesta() + "");
                        vipMesta.setText(sala2.isVip_mesta() + "");
                        klima.setText(sala2.isKlima() + "");
                        has3D.setText(sala2.isHas3D() + "");
                        JOptionPane.showMessageDialog(null, "Sistem je ucitao salu", "Uspesno ucitavanje sale", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Sistem ne moze da ucita salu", "Neuspesno ucitavanje sale", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }
        });
    }

}
