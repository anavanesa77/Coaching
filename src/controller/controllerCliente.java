package controller;

import model.modelCliente;
import view.frmClientes;
import view.frmPrincipal;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.controllerPrincipal;

public final class controllerCliente implements ActionListener {

    frmClientes frm;
    frmPrincipal menu;
    model.modelCliente modelCliente = new modelCliente();

    private final DefaultTableModel m = null;

    public controllerCliente() {

        frm = new frmClientes();
        IniciarClientes();
        cargarTabla();
        frm.setVisible(true);

    }

    public void cargarTabla() {

        model.modelCliente cliente = new modelCliente();
        frm.getTablaCliente().setModel(cliente.CargaDatos(m));

    }

    public void IniciarClientes() {

        frm.getBtnAltaCliente().addActionListener(this::actionPerformed);
        frm.getBtnBajaCliente().addActionListener(this::actionPerformed);
        frm.getBtnActualizarCliente().addActionListener(this::actionPerformed);
        frm.getBtnBuscarCliente().addActionListener(this::actionPerformed);
        frm.getBtnSalirCliente().addActionListener(this::actionPerformed);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Salir") {
            menu.setVisible(true);
            
        }
        if (e.getActionCommand() == "Alta") {
            cargarTabla();
            modelCliente.AltaCliente();
            cargarTabla();
        }
        if (e.getActionCommand() == "Baja") {
            cargarTabla();
            modelCliente.BajaCliente();
            cargarTabla();
        }
        if (e.getActionCommand() == "Actualizar") {
            cargarTabla();
            modelCliente.ActualizarCliente();
            cargarTabla();
        }
        if (e.getActionCommand() == "Buscar") {
            cargarTabla();
            model.modelCliente cliente = new modelCliente();
            frm.getTablaCliente().setModel(cliente.CargaDatosBusqueda(m));
        }
       
    }
}
