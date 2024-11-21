package DTOs;

import java.util.ArrayList;

public class EmpleadosXML {
    private ArrayList<EmpleadoXML> empleados;

    public EmpleadosXML() {}

    public ArrayList<EmpleadoXML> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<EmpleadoXML> empleados) {
        this.empleados = empleados;
    }
}
