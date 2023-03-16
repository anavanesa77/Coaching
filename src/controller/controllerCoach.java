package controller;

import model.modelCoach;
import view.frmCoach;
import view.frmPrincipal;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class controllerCoach implements ActionListener {

    frmCoach frm;
    frmPrincipal menu;
    model.modelCoach modelCoach = new modelCoach();

    private final DefaultTableModel m = null;

    public controllerCoach() {

        frm = new frmCoach();
        IniciarCoach();
        cargarTabla();
        frm.setVisible(true);

    }

    public void cargarTabla() {

        model.modelCoach coach = new modelCoach();
        frm.getTablaCoach().setModel(coach.CargaDatos(m));

    }

    public void IniciarCoach() {

        frm.getBtnAltaCoach().addActionListener(this::actionPerformed);
        frm.getBtnBajaCoach().addActionListener(this::actionPerformed);
        frm.getBtnActualizarCoach().addActionListener(this::actionPerformed);
        frm.getBtnBuscarCoach().addActionListener(this::actionPerformed);
        frm.getBtnSalirCoach().addActionListener(this::actionPerformed);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Alta") {
            cargarTabla();
            modelCoach.AltaCoach();
            cargarTabla();
        }
        if (e.getActionCommand() == "Baja") {
            cargarTabla();
            modelCoach.BajaCoach();
            cargarTabla();
        }
        if (e.getActionCommand() == "Actualizar") {
            cargarTabla();
            modelCoach.ActualizarCoach();
            cargarTabla();
        }
        if (e.getActionCommand() == "Buscar") {
            cargarTabla();
            model.modelCoach coach = new modelCoach();
            frm.getTablaCoach().setModel(coach.CargaDatosBusqueda(m));
        }
        if (e.getActionCommand() == "Salir") {
            menu.setVisible(true);
        }
    }

}
