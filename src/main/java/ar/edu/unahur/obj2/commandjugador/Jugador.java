package ar.edu.unahur.obj2.commandjugador;

public class Jugador {
    private Integer posX;
    private Integer posY;
    private Integer cantMovimientos = 0;

    public Jugador() {
        this.posX = 0;
        this.posY = 0;
    }

    public Jugador(Integer posX, Integer posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Integer getPosX() {
        return posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public Integer getCantMovimientos() {
        return cantMovimientos;
    }

    public void avanzar() {
        this.posX++; // suma 1
    }

    public void retroceder() {
        this.posX--; // resta 1
    }

    public void subir() {
        this.posY++;
    }

    public void bajar() {
        this.posY--;
    }

    public void incrementarMovimientos() {
        cantMovimientos++;
    }

    @Override
    public String toString() {
        return "Jugador {" + "posX=" + this.posX + ", posY=" + this.posY + ", cantMovimientos="
                + this.cantMovimientos + "}";
    }
}
