package DAOs;

public class MaquinariaDAO {
    private String matricula;
    private String modelo;
    private EmpleadoDAO empleado;
    private String nombreObra;

    public MaquinariaDAO() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public EmpleadoDAO getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EmpleadoDAO empleado) {
        this.empleado = empleado;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }
}
