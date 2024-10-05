package Models;

public class Notas {
    private double notaPrimerPrevio;
    private double notaSegundoPrevio;
    private double notaTercerPrevio;
    private double examen;
    private double promedio;

    public Notas(double notaPrimerPrevio, double notaSegundoPrevio, double notaTercerPrevio, double examen, double promedio) {
        this.notaPrimerPrevio = notaPrimerPrevio;
        this.notaSegundoPrevio = notaSegundoPrevio;
        this.notaTercerPrevio = notaTercerPrevio;
        this.examen = examen;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "{" +
                "notaPrimerPrevio=" + notaPrimerPrevio +
                ", notaSegundoPrevio=" + notaSegundoPrevio +
                ", notaTercerPrevio=" + notaTercerPrevio +
                ", examen=" + examen +
                ", promedio=" + promedio +
                '}';
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
