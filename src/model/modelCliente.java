package model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connect.*;
import dto.dtoCliente;
import view.frmClientes;


public class modelCliente implements KeyListener {

    frmClientes vista = new frmClientes();
    dtoCliente cliente = new dtoCliente();
    int datos;
    String tipo;

    private Statement stmt;

  
    public DefaultTableModel CargaDatos(DefaultTableModel m) {
        String[] cliente_cabecera = {"codigoCliente", "dni", "nombre", "apellido1", "apellido2"};
        m = new DefaultTableModel(null, cliente_cabecera);

        try {
            stmt = ConexionBaseDatos.getStmt();
            ResultSet rs = stmt.executeQuery("select * from clientes");
            String[] fila = new String[5];

            while (rs.next()) {
                fila[0] = rs.getString("codigoCliente");
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
        cliente.setCodigoCliente(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de código del cliente: ")));
        cliente.setDni(JOptionPane.showInputDialog("Introduzca el DNI del cliente: "));
        cliente.setNombre(JOptionPane.showInputDialog("Introduzca el nombre del cliente: "));
        cliente.setApellido1(JOptionPane.showInputDialog("Introduzca el primer apellido del cliente: "));
        cliente.setApellido2(JOptionPane.showInputDialog("Introduzca el segundo apellido del cliente: "));

    }

    public void AltaCliente() {

        introducirDatos();

        stmt = ConexionBaseDatos.getStmt();

        try {

            int rs = stmt.executeUpdate("INSERT INTO clientes (codigoCliente,dni,nombre,apellido1,apellido2) VALUES ( '" + cliente.getCodigoCliente()+ "'," + cliente.getDni() + ",'" + cliente.getNombre() + "',"
                    + cliente.getApellido1() + "," + cliente.getApellido2() + ");");
            JOptionPane.showMessageDialog(vista, "Cliente añadido.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Vuelva a introducir los datos.");
        }

    }

    public void BajaCliente() {
        cliente.setCodigoCliente(Integer.parseInt(JOptionPane.showInputDialog("Inserte el codigo del cliente que desea borrar")));
        stmt = ConexionBaseDatos.getStmt();
        try {
            int rs = stmt.executeUpdate("DELETE FROM clientes where codigoCliente=" + cliente.getCodigoCliente() + ";");
            JOptionPane.showMessageDialog(vista, "Cliente borrado.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Vuelva a introducir los datos.");
        }

    }

    public void ActualizarCliente() {

        cliente.setCodigoCliente(Integer.parseInt(JOptionPane.showInputDialog("Inserte el codigo de cliente a modificar")));
        introducirDatos();
        stmt = ConexionBaseDatos.getStmt();

        try {
            int rs = stmt.executeUpdate("UPDATE clientes SET nombre='" + cliente.getNombre() + "',apellido1='" + cliente.getApellido1() + "',apellido2='" + cliente.getApellido2() + "';");

            JOptionPane.showMessageDialog(vista, "Datos del cliente modificado.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Vuelva a introducir los datos.");
        }

    }

    public DefaultTableModel CargaDatosBusqueda(DefaultTableModel m) {

        tipo = JOptionPane.showInputDialog(vista, "Introduzca el DNI del cliente a buscar: ");

        String[] cliente_busqueda = {"codigoCliente", "dni", "nombre", "apellido1", "apellido2"};
        m = new DefaultTableModel(null, cliente_busqueda);

        try {
            stmt = ConexionBaseDatos.getStmt();

            ResultSet rs = stmt.executeQuery("select * from clientes where dni ='" + tipo + "';");

            String[] fila = new String[5];

            while (rs.next()) {
                fila[0] = rs.getString("codigoCliente");
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
