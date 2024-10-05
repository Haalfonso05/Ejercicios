package Service;

import Models.Notas;

import java.util.Scanner;

public class NotasService {

    private Scanner sc;
    private Notas notas;

    public NotasService() {
        this.sc = new Scanner(System.in);
    }

    public Notas asignarNota(){
        System.out.println("Diga la nota 1");
        double nota1 = sc.nextDouble();
        System.out.println("Diga la nota 2");
        double nota2 = sc.nextDouble();
        System.out.println("Diga la nota 3");
        double nota3 = sc.nextDouble();
        System.out.println("Diga la nota del examen");
        double examen = sc.nextDouble();
        notas = new Notas(nota1,nota2,nota3,examen,promedio(nota1,nota2,nota3,examen));
        return notas;
    }
    private double promedio(double nota1, double nota2, double nota3,double examen){
        return ((((nota1+nota2+nota3)/3)*0.7)+(examen*0.3));
    }

}
