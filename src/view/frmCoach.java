package view;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class frmCoach extends javax.swing.JFrame {

    public frmCoach() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCoach = new javax.swing.JTable();
        btnBuscarCoach = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAltaCoach = new javax.swing.JButton();
        btnActualizarCoach = new javax.swing.JButton();
        btnBajaCoach = new javax.swing.JButton();
        btnSalirCoach = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coach", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        jPanel1.setName(""); // NOI18N

        tablaCoach.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tablaCoach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Coach", "DNI", "Nombre", "Apellido 1", "Apellido 2"
            }
        ));
        tablaCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(tablaCoach);

        btnBuscarCoach.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBuscarCoach.setText("Buscar");
        btnBuscarCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCoachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(btnBuscarCoach)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCoach)
                .addContainerGap())
        );

        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Encabezado (2).jpg"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setText("COACH");
        jLabel2.setToolTipText("");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btnAltaCoach.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAltaCoach.setText("Alta");
        btnAltaCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btnAltaCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, -1));

        btnActualizarCoach.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnActualizarCoach.setText("Actualizar");
        btnActualizarCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCoachActionPerformed(evt);
            }
        });
        jPanel4.add(btnActualizarCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, -1));

        btnBajaCoach.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBajaCoach.setText("Baja");
        btnBajaCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btnBajaCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, -1));

        btnSalirCoach.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSalirCoach.setText("Salir");
        btnSalirCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCoachActionPerformed(evt);
            }
        });
        jPanel4.add(btnSalirCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCoachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarCoachActionPerformed

    private void btnSalirCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCoachActionPerformed

    }//GEN-LAST:event_btnSalirCoachActionPerformed

    private void btnBuscarCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCoachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCoachActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarCoach;
    public javax.swing.JButton btnAltaCoach;
    public javax.swing.JButton btnBajaCoach;
    public javax.swing.JButton btnBuscarCoach;
    public javax.swing.JButton btnSalirCoach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tablaCoach;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnActualizarCoach() {
        return btnActualizarCoach;
    }

    public void setBtnActualizarCoach(JButton btnActualizarCoach) {
        this.btnActualizarCoach = btnActualizarCoach;
    }

    public JButton getBtnAltaCoach() {
        return btnAltaCoach;
    }

    public void setBtnAltaCoach(JButton btnAltaCoach) {
        this.btnAltaCoach = btnAltaCoach;
    }

    public JButton getBtnBajaCoach() {
        return btnBajaCoach;
    }

    public void setBtnBajaCoach(JButton btnBajaCoach) {
        this.btnBajaCoach = btnBajaCoach;
    }

    public JButton getBtnBuscarCoach() {
        return btnBuscarCoach;
    }

    public void setBtnBuscarCoach(JButton btnBuscarCoach) {
        this.btnBuscarCoach = btnBuscarCoach;
    }

    public JButton getBtnSalirCoach() {
        return btnSalirCoach;
    }

    public void setBtnSalirCoach(JButton btnSalirCoach) {
        this.btnSalirCoach = btnSalirCoach;
    }

    public JTable getTablaCoach() {
        return tablaCoach;
    }

    public void setTablaCoach(JTable tablaCoach) {
        this.tablaCoach = tablaCoach;
    }

}
