package DTOs;

import java.sql.Date;
import java.util.ArrayList;

public class ObraJSON {
    private int idObra;
    private String nombreObra;
    private String direccion;
    private Date fechaObra;
    private ArrayList<String> nombreEmpleados;
    private ArrayList<String> maquinas;

    public ObraJSON() {
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaObra() {
        return fechaObra;
    }

    public void setFechaObra(Date fechaObra) {
        this.fechaObra = fechaObra;
    }

    public ArrayList<String> getNombreEmpleados() {
        return nombreEmpleados;
    }

    public void setNombreEmpleados(ArrayList<String> nombreEmpleados) {
        this.nombreEmpleados = nombreEmpleados;
    }

    public ArrayList<String> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<String> maquinas) {
        this.maquinas = maquinas;
    }
}
