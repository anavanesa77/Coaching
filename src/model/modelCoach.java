package model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connect.ConexionBaseDatos;
import dto.dtoCoach;
import view.frmCoach;

public class modelCoach implements KeyListener {

    frmCoach vista = new frmCoach();
    dtoCoach coach = new dtoCoach();
    int datos;
    String tipo;
    
    private Statement stmt;

    public DefaultTableModel CargaDatos(DefaultTableModel m) {
        String[] coach_cabecera = {"numeroRegistro", "dni", "nombre", "apellido1", "apellido2"};
        m = new DefaultTableModel(null, coach_cabecera);

        try {
            stmt = ConexionBaseDatos.getStmt();
            ResultSet rs = stmt.executeQuery("select * from coach");
            String[] fila = new String[5];

            while (rs.next()) {
                fila[0] = rs.getString("numeroRegistro");
                fila[1] = rs.getString("dni");
                fila[2] = rs.getString("nombre");
                fila[3] = rs.getString("apellido1");
                fila[4] = rs.getString("apellido2");
                m.addRow(fila);
            }
        } catch (SQLException e) {

        }
        return m;
    }

    public void introducirDatos() {
        coach.setNumeroRegistro(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de código del coach: ")));
        coach.setDni(JOptionPane.showInputDialog("Introduzca el DNI del coach: "));
        coach.setNombre(JOptionPane.showInputDialog("Introduzca el nombre del coach: "));
        coach.setApellido1(JOptionPane.showInputDialog("Introduzca el primer apellido del coach: "));
        coach.setApellido2(JOptionPane.showInputDialog("Introduzca el segundo apellido del coach: "));

    }

    public void AltaCoach() {

        introducirDatos();

        stmt = ConexionBaseDatos.getStmt();

        try {

            int rs = stmt.executeUpdate("INSERT INTO coach (numeroRegistro,dni,nombre,apellido1,apellido2)) VALUES ( '" + coach.getNumeroRegistro()+ "'," + coach.getDni() + ",'" + coach.getNombre() + "',"
                    + coach.getApellido1() + "," + coach.getApellido2() + ");");
            JOptionPane.showMessageDialog(vista, "Coach añadido.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Vuelva a introducir los datos.");
        }

    }

    public void BajaCoach() {
        coach.setNumeroRegistro(Integer.parseInt(JOptionPane.showInputDialog("Inserte el codigo del cliente que desea borrar")));
        stmt = ConexionBaseDatos.getStmt();
        try {
            int rs = stmt.executeUpdate("DELETE FROM coach where id=" + coach.getNumeroRegistro() + ";");
            JOptionPane.showMessageDialog(vista, "Coach borrado.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Vuelva a introducir los datos.");
        }

    }

    public void ActualizarCoach() {

        coach.setNumeroRegistro(Integer.parseInt(JOptionPane.showInputDialog("Inserte el codigo de coach a modificar")));
        introducirDatos();
        stmt = ConexionBaseDatos.getStmt();

        try {
            int rs = stmt.executeUpdate("UPDATE coach SET nombre='" + coach.getNombre() + "',apellidos1='" + coach.getApellido1() + "',apellido2='" + coach.getApellido2() + "';");

            JOptionPane.showMessageDialog(vista, "Datos del coach modificado.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Vuelva a introducir los datos.");
        }

    }

    public DefaultTableModel CargaDatosBusqueda(DefaultTableModel m) {

        tipo = JOptionPane.showInputDialog(vista, "Introduzca el DNI del coach a buscar: ");

        String[] coach = {"numeroRegistro", "dni", "nombre", "apellido1", "apellido2"};
        m = new DefaultTableModel(null, coach);

        try {
            stmt = ConexionBaseDatos.getStmt();

            ResultSet rs = stmt.executeQuery("select * from coach where dni ='" + tipo + "';");

            String[] fila = new String[5];

            while (rs.next()) {
                fila[0] = rs.getString("numeroRegistro");
                fila[1] = rs.getString("dni");
                fila[2] = rs.getString("nombre");
                fila[3] = rs.getString("apellido1");
                fila[4] = rs.getString("apellido2");

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
