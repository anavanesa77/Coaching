package controller;

import model.modelProyecto;
import view.frmProyecto;
import view.frmPrincipal;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class controllerProyecto implements ActionListener {

    frmProyecto frm;
    frmPrincipal menu;
    model.modelProyecto modelProyecto = new modelProyecto();

    private final DefaultTableModel m = null;

    public controllerProyecto() {

        frm = new frmProyecto();
        IniciarProyecto();
        cargarTabla();
        frm.setVisible(true);

    }

    public void cargarTabla() {

        model.modelProyecto coach = new modelProyecto();
        frm.getTablaCliente().setModel(modelProyecto.CargaDatos(m));

    }

    public void IniciarProyecto() {

        frm.getBtnBuscarCliente().addActionListener(this::actionPerformed);
        frm.getBtnSalirCoach().addActionListener(this::actionPerformed);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Buscar") {
            cargarTabla();
            model.modelProyecto proyecto = new modelProyecto();
            frm.getTablaCliente().setModel(modelProyecto.CargaDatosBusqueda(m));
        }
        if (e.getActionCommand() == "Salir") {
            menu.setVisible(true);

        }
    }
}
