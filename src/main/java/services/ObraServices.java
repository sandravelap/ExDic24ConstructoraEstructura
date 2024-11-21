package services;

import DAOs.ObraDAO;
import DTOs.ObraJSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import repositories.EmpleadoRepository;
import repositories.MaquinariaRepository;
import repositories.ObraRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;

public class ObraServices {
    ObraRepository obraRepository = new ObraRepository();
    EmpleadoRepository empleadoRepository = new EmpleadoRepository();
    MaquinariaRepository maquinariaRepository = new MaquinariaRepository();

    ObraJSON obraJSON = new ObraJSON();
    ObraDAO obraDAO = new ObraDAO();
    String obraString;
    Path pOutJson = Path.of("target/obra.json");
    Path p = Path.of("target");
    public String informeObra(String nombreObra){
        String mensaje = "";

        return mensaje;
    }
}
