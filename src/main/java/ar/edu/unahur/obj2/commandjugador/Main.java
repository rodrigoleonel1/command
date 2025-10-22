package ar.edu.unahur.obj2.commandjugador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Teclado teclado = new Teclado(jugador);
        Scanner sc = new Scanner(System.in);
        System.out.println(jugador);
        System.out.print("Ingrese un comando para mover al jugador");
        Character l = sc.next().toLowerCase().charAt(0);
        System.out.println(l);
        teclado.moverAlPersonaje(l);
    }
}