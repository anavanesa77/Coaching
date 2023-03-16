package model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connect.ConexionBaseDatos;
import dto.dtoProyecto;
import view.frmProyecto;

public class modelProyecto implements KeyListener {

    frmProyecto vista = new frmProyecto();
    dtoProyecto coach = new dtoProyecto();
    int datos;
    String tipo;

    private Statement stmt;

    public DefaultTableModel CargaDatos(DefaultTableModel m) {
        String[] proyecto_cabecera = {"id", "codCliente", "codCoach", "fecInicio", "fecFin", "estado"};
        m = new DefaultTableModel(null, proyecto_cabecera);

        try {
            stmt = ConexionBaseDatos.getStmt();
            ResultSet rs = stmt.executeQuery("select*from proyecto");
            String[] fila = new String[6];

            while (rs.next()) {
                fila[0] = rs.getString("id");
                fila[1] = rs.getString("codCliente");
                fila[2] = rs.getString("codCoach");
                fila[3] = rs.getString("fecInicio");
                fila[4] = rs.getString("fecFin");
                fila[5] = rs.getString("estado");

                m.addRow(fila);
            }
        } catch (SQLException e) {

        }
        return m;
    }

    public DefaultTableModel CargaDatosBusqueda(DefaultTableModel m) {

        tipo = JOptionPane.showInputDialog(vista, "Introduzca el Codigo del Cliente para buscar el proyecto:");

        String[] proyecto_busqueda = {"id", "codCliente", "codCoach", "fecInicio", "fecFin", "estado"};
        m = new DefaultTableModel(null, proyecto_busqueda);

        try {
            stmt = ConexionBaseDatos.getStmt();

            ResultSet rs = stmt.executeQuery("select * from proyecto where codCliente ='" + tipo + "';");

            String[] fila = new String[6];

            while (rs.next()) {
                fila[0] = rs.getString("id");
                fila[1] = rs.getString("codCliente");
                fila[2] = rs.getString("codCoach");
                fila[3] = rs.getString("fecInicio");
                fila[4] = rs.getString("fecFin");
                fila[5] = rs.getString("estado");

                m.addRow(fila);
            }
        } catch (SQLException e) {

        }
        return m;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
