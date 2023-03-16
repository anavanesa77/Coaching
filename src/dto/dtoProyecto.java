package dto;

import java.sql.Date;

public class dtoProyecto {

    private int id;
    private String codCliente;
    private String codCoach;
    private Date fecInicio;
    private Date fecFin;

    public dtoProyecto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getCodCoach() {
        return codCoach;
    }

    public void setCodCoach(String codCoach) {
        this.codCoach = codCoach;
    }

    public Date getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }
}
