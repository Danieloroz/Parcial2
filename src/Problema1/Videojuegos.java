package Problema1;

import java.io.Closeable;
import java.io.IOException;

public enum Videojuegos implements Closeable {
    DEPORTIVOS(1){
        @Override
        public String getNombreVideojuego() {
            return "FIFA 2024";
        }

        @Override
        public String getComoJugar() {
            return "Crea el equipo de tus sueños y juega con y contra amigos";
        }

        @Override
        public int getAñoCreacion() {
            return 2023;
        }

        @Override
        public String mostrarPosicionRanking() {
            return "Top #34";
        }

        @Override
        public String comprarMonedas() {
            return "Aquí podrás adquirir monedas del juego para mejorar tus personajes o comprar otros";
        }

        @Override
        public String toString(){
            return "START implementation. Priority="+getPriority();
        }
    },
    ESTRATEGIA(2){
        @Override
        public String getNombreVideojuego() {
            return "UNO";
        }

        @Override
        public String getComoJugar() {
            return "Juega con tus amigos con una baraja. Gana el que primero se quede sin cartas.";
        }

        @Override
        public int getAñoCreacion() {
            return 2008;
        }

        @Override
        public String mostrarPosicionRanking() {
            return "Top #UNO";
        }

        @Override
        public String comprarMonedas() {
            return "Aquí podrás comprar monedas para adquirir diferentes aspectos para tus cartas";
        }
    },
    MUSICALES(3){
        @Override
        public String getNombreVideojuego() {
            return "JUST DANCE";
        }

        @Override
        public String getComoJugar() {
            return "Déjate llevar por la música y solo baila";
        }

        @Override
        public int getAñoCreacion() {
            return 2014;
        }

        @Override
        public String mostrarPosicionRanking() {
            return "Top #108";
        }

        @Override
        public String comprarMonedas() {
            return "Aquí puedes adquirir monedas para comprar canciones únicas y exclusivas de Just Dance";
        }
    },
    AVENTURA(4) {
        @Override
        public String getNombreVideojuego() {
            return "TOMB RAIDER";
        }

        @Override
        public String getComoJugar() {
            return "Adéntrate en el mundo de la protagonista buscando como sobrevivir al nuevo mundo";
        }

        @Override
        public int getAñoCreacion() {
            return 2021;
        }

        @Override
        public String mostrarPosicionRanking() {
            return "Top #309";
        }

        @Override
        public String comprarMonedas() {
            return "Aquí podrás comprar monedas para personalizar el aspecto de tu personaje";
        }
    },
    SIMULACION(5){
        @Override
        public String getNombreVideojuego() {
            return "GOAT SIMULATOR";
        }

        @Override
        public String getComoJugar() {
            return "Simplemente vive como una cabra";
        }

        @Override
        public int getAñoCreacion() {
            return 2020;
        }

        @Override
        public String mostrarPosicionRanking() {
            return "Top #500";
        }

        @Override
        public String comprarMonedas() {
            return "Aquí podrás comprar diferentes aspectos para personalizar tu experiencia dentro del juego";
        }
    };
    private int priority;
    private String nombreVideojuego;
    private String comoJugar;
    private int añoCreacion;


    public abstract String getNombreVideojuego();
    public abstract String getComoJugar();
    public abstract int getAñoCreacion();
    public abstract String mostrarPosicionRanking();
    public abstract String comprarMonedas();
    private Videojuegos(int i){
        priority = i;
    }

    public int getPriority(){
        return this.priority;
    }

    public void setPriority(int p){
        this.priority = p;
    }

    @Override
    public String toString(){
        return "Prioridad ="+getPriority();
    }

    @Override
    public void close() throws IOException {
        System.out.println("Fuera del Enum");
    }
}

class Main{
    public static void main(String[] args) {
        Videojuegos videojuegos = Videojuegos.ESTRATEGIA;
        videojuegos.setPriority(2);
        System.out.println(videojuegos.toString());
        System.out.println(videojuegos.getNombreVideojuego());
        System.out.println(videojuegos.getComoJugar());
        System.out.println(videojuegos.getAñoCreacion());
        System.out.println(videojuegos.mostrarPosicionRanking());
        System.out.println(videojuegos.comprarMonedas());
    }
}