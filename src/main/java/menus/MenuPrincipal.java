package menus;

import java.util.Scanner;

public class MenuPrincipal {
    private boolean salir = false;
    private Scanner sc = new Scanner(System.in);

    public void muestraMenu() {
        String opcion;
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Listar maquinaria.");
            System.out.println("2. Cargar empleados de XML.");
            System.out.println("3. Generar informe de obra en Json.");
            System.out.println("0. Salir");
            opcion = this.pideOpcion();
            this.procesaOpcion(opcion);
        } while (!salir);
    }

    private String pideOpcion() {
        return this.sc.nextLine();
    }

    private void procesaOpcion(String opcion) {

        switch (opcion) {
            case "0" -> salir = true;
            case "1" -> {

            }
            case "2" -> {

            }
            case "3" ->{

            }
            default -> System.out.println("Opción incorrecta");
        }
    }
}
