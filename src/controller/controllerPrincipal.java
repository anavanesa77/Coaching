package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import view.*;
import model.*;

public final class controllerPrincipal implements ActionListener, MouseListener, WindowListener, KeyListener {

    private final frmPrincipal menu = new frmPrincipal();
    private final frmCoach coach = new frmCoach();
    private final frmClientes cliente = new frmClientes();
    private final frmProyecto proyecto = new frmProyecto();

    public controllerPrincipal() {
        iniciarMenu();
        iniciarBotones();
    }

    public void iniciarMenu() {
        menu.setVisible(true);
    }

    public void iniciarBotones() {
        menu.getBtnCliente().addActionListener(this::actionPerformed);
        menu.getBtnCoach().addActionListener(this::actionPerformed);
        menu.getBtnProyecto().addActionListener(this::actionPerformed);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String opcion = e.getActionCommand();

        switch (opcion) {
            case "Clientes":
                controllerCliente controllerCliente = new controllerCliente();
                frmClientes frmClientes = new frmClientes();
                menu.setVisible(false);
                break;
                
            case "Coach":
                controllerCoach controllerCoach = new controllerCoach();
                frmCoach frmCoach = new frmCoach();
                menu.setVisible(false);
                break;

            case "Proyectos":
                controllerProyecto controllerProyecto = new controllerProyecto();
                frmProyecto frmProyecto = new frmProyecto();
                menu.setVisible(false);
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {

    }

    @Override
    public void mousePressed(MouseEvent arg0) {

    }

    @Override
    public void mouseReleased(MouseEvent arg0) {

    }

    @Override
    public void mouseEntered(MouseEvent arg0) {

    }

    @Override
    public void mouseExited(MouseEvent arg0) {

    }

    @Override
    public void windowOpened(WindowEvent arg0) {

    }

    @Override
    public void windowClosing(WindowEvent arg0) {

    }

    @Override
    public void windowClosed(WindowEvent arg0) {

    }

    @Override
    public void windowIconified(WindowEvent arg0) {

    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {

    }

    @Override
    public void windowActivated(WindowEvent arg0) {
    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
       
    }

}
