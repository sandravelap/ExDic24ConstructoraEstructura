package services;

import DAOs.EmpleadoDAO;
import DAOs.ObraDAO;
import DTOs.EmpleadoXML;
import DTOs.EmpleadosXML;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import repositories.EmpleadoRepository;
import repositories.ObraRepository;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpleadosXMLServices {
    private EmpleadoRepository empleadoRepository = new EmpleadoRepository();
    private ObraRepository obraRepository = new ObraRepository();
    public String cargarEmpleados(Path ruta) {
        StringBuilder mensaje = new StringBuilder();

        return mensaje.toString();
    }
}
