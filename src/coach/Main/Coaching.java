package coach.Main;

import static connect.ConexionBaseDatos.openConnection;
import controller.controllerPrincipal;

public class Coaching {

    public static void main(String[] args) {
       openConnection();
        new controllerPrincipal();
    }
}
