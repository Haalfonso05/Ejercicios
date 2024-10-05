package Models;

public class Notas {
    int notaPrimerPrevio;
    int notaSegundoPrevio;
    int notaTercerPrevio;
    int examen;

    public Notas(int notaPrimerPrevio, int notaSegundoPrevio, int notaTercerPrevio, int examen) {
        this.notaPrimerPrevio = notaPrimerPrevio;
        this.notaSegundoPrevio = notaSegundoPrevio;
        this.notaTercerPrevio = notaTercerPrevio;
        this.examen = examen;
    }

    public int getNotaPrimerPrevio() {
        return notaPrimerPrevio;
    }

    public void setNotaPrimerPrevio(int notaPrimerPrevio) {
        this.notaPrimerPrevio = notaPrimerPrevio;
    }

    public int getNotaSegundoPrevio() {
        return notaSegundoPrevio;
    }

    public void setNotaSegundoPrevio(int notaSegundoPrevio) {
        this.notaSegundoPrevio = notaSegundoPrevio;
    }

    public int getNotaTercerPrevio() {
        return notaTercerPrevio;
    }

    public void setNotaTercerPrevio(int notaTercerPrevio) {
        this.notaTercerPrevio = notaTercerPrevio;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }
}
