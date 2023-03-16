package view;

import javax.swing.JButton;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEscritorio = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnCoach = new javax.swing.JButton();
        btnProyecto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1BienvenidoCoach = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlEscritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCliente.setText("Clientes");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        pnlEscritorio.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, 40));

        btnCoach.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCoach.setText("Coach");
        btnCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoachCoach(evt);
            }
        });
        pnlEscritorio.add(btnCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 100, 40));

        btnProyecto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnProyecto.setText("Proyectos");
        btnProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProyectoProyecto(evt);
            }
        });
        pnlEscritorio.add(btnProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 100, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        jLabel3.setText("Bienvenido/a COACH");
        pnlEscritorio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel1BienvenidoCoach.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1BienvenidoCoach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sombras (3).png"))); // NOI18N
        pnlEscritorio.add(jLabel1BienvenidoCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pie_de_pagina (3).jpg"))); // NOI18N
        pnlEscritorio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCoachCoach(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoachCoach
        // frmCoach ver = new frmCoach();

        // ver.setVisible(true);
    }//GEN-LAST:event_btnCoachCoach

    private void btnProyectoProyecto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyectoProyecto
        //  frmProyecto verProyecto = new frmProyecto();

        //  verProyecto.setVisible(true);
    }//GEN-LAST:event_btnProyectoProyecto

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        //  frmClientes ver = new frmClientes();

        //  ver.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCliente;
    public javax.swing.JButton btnCoach;
    public javax.swing.JButton btnProyecto;
    private javax.swing.JLabel jLabel1BienvenidoCoach;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlEscritorio;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnCliente() {
        return btnCliente;
    }

    public void setBtnCliente(JButton btnCliente) {
        this.btnCliente = btnCliente;
    }

    public JButton getBtnCoach() {
        return btnCoach;
    }

    public void setBtnCoach(JButton btnCoach) {
        this.btnCoach = btnCoach;
    }

    public JButton getBtnProyecto() {
        return btnProyecto;
    }

    public void setBtnProyecto(JButton btnProyecto) {
        this.btnProyecto = btnProyecto;

    }

}
