package view;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import controller.*;
public class frmClientes extends javax.swing.JFrame {

    public frmClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAltaCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        btnSalirCliente = new javax.swing.JButton();
        btnBajaCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        jPanel1.setName(""); // NOI18N

        btnBuscarCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        tablaCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Cliente", "DNI", "Nombre", "Apellido 1", "Apellido 2"
            }
        ));
        tablaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(tablaCliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCliente)
                .addContainerGap())
        );

        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Encabezado (2).jpg"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnAltaCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAltaCliente.setText("Alta");
        btnAltaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaClienteActionPerformed(evt);
            }
        });
        jPanel4.add(btnAltaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, -1));

        btnActualizarCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btnActualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 120, -1));

        btnSalirCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSalirCliente.setText("Salir");
        btnSalirCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirClienteActionPerformed(evt);
            }
        });
        jPanel4.add(btnSalirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 90, 30));

        btnBajaCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBajaCliente.setText("Baja");
        btnBajaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btnBajaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 120, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setText("CLIENTES");
        jLabel2.setToolTipText("");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirClienteActionPerformed

    }//GEN-LAST:event_btnSalirClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaClienteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarCliente;
    public javax.swing.JButton btnAltaCliente;
    public javax.swing.JButton btnBajaCliente;
    public javax.swing.JButton btnBuscarCliente;
    public javax.swing.JButton btnSalirCliente;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnActualizarCliente() {
        return btnActualizarCliente;
    }

    public void setBtnActualizarCliente(JButton btnActualizarCliente) {
        this.btnActualizarCliente = btnActualizarCliente;
    }

    public JButton getBtnAltaCliente() {
        return btnAltaCliente;
    }

    public void setBtnAltaCliente(JButton btnAltaCliente) {
        this.btnAltaCliente = btnAltaCliente;
    }

    public JButton getBtnBajaCliente() {
        return btnBajaCliente;
    }

    public void setBtnBajaCliente(JButton btnBajaCliente) {
        this.btnBajaCliente = btnBajaCliente;
    }

    public JButton getBtnBuscarCliente() {
        return btnBuscarCliente;
    }

    public void setBtnBuscarCliente(JButton btnBuscarCliente) {
        this.btnBuscarCliente = btnBuscarCliente;
    }

    public JButton getBtnSalirCliente() {
        return btnSalirCliente;
    }

    public void setBtnSalirCliente(JButton btnSalirCliente) {
        this.btnSalirCliente = btnSalirCliente;
    }

    public JTable getTablaCliente() {
        return tablaCliente;
    }

    public void setTablaCliente(JTable tablaCliente) {
        this.tablaCliente = tablaCliente;
    }

}
