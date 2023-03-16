package dto;

public class dtoCoach {

    private int NumeroRegistro;
    private String Dni;
    private String Nombre;
    private String apellido1;
    private String apellido2;

    public dtoCoach() {

    }

    public int getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(int NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

}
