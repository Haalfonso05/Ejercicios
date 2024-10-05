package Service;

import Models.Estudiante;
import Models.Notas;

import java.util.HashMap;
import java.util.Scanner;

public class EstudianteService {
    private Scanner sc;
    private Estudiante estudiante;
    private HashMap<String, Estudiante> listaEstudiantes;
    private HashMap<String, Notas> listaNotas;
    private NotasService notasService;
    private Notas notas;


    public EstudianteService() {
        this.sc = new Scanner(System.in);
        listaEstudiantes = new HashMap<>();
        this.notasService = new NotasService();
        listaNotas = new HashMap<>();
    }
    public void menu(){
        int i =0;
        int seleccion;
        do{
            System.out.println("""
                    ********Menu********
                    \t 1. AGREGAR ESTUDIANTE
                    \t 2. LISTADO DE ESTUDIANTES
                    \t 3. PROMEDIO DEL GRUPO
                    \t 4. ESTUDIANTES CON MAL PROMEDIO
                    \t 0. SALIR
                    Elija una seleccion
                    """);

            seleccion = sc.nextInt();

            switch (seleccion){
                case 1 ->agregarEstudiante();
                case 2 ->listadoEstudiantes();
                case 3 ->pomedioGrupo();
                case 4 -> estudiantesMalPromedio();
                default ->{
                    System.out.println("GRACIAS POR USAR EL MENU");
                }
            }
        }while(seleccion != 0);
    }
    private void agregarEstudiante(){
        System.out.println("Diga el codigo");
        String codigo = sc.next();
        System.out.println("Diga el nombre");
        String nombre= sc.next();
        System.out.println("Diga la edad");
        String edad = sc.next();
        System.out.println("Diga la carrera");
        String carrera = sc.next();
        System.out.println("Diga la asignatura");
        String asignatura = sc.next();
        notas = notasService.asignarNota();
        estudiante = new Estudiante(codigo,nombre,edad,carrera,asignatura,notas);
        listaEstudiantes.put(codigo,estudiante);
        listaNotas.put(codigo,notas);
    }
    private void listadoEstudiantes(){
        for(Estudiante estudiante: listaEstudiantes.values()){
            System.out.println(estudiante);
        }
    }
    private double pomedioGrupo(){
        int numeroDeEstudientes =0;
        double i = 0;
        for (Notas notas: listaNotas.values()){
            i = i + notas.getPromedio();
            numeroDeEstudientes ++;
        }

        double promedio = i/numeroDeEstudientes;
        return promedio;
    }
    private void estudiantesMalPromedio() {
        for (Estudiante estudiante : listaEstudiantes.values()){
            for (Notas notas : listaNotas.values()) {
                if (notas.getPromedio() < this.pomedioGrupo()) {
                    System.out.println("El estudiante " +  estudiante.getNombre() + "Tiene un promedio inferior al promedio");
                }
            }
        }
    }
}
