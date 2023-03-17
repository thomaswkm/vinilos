package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    String[][] vinilos = new String[100][3];
    //código de prueba
    agregarVinilo(vinilos,"Iron Maiden","Iron Maiden","1980");
    agregarVinilo(vinilos,"Radiohead","OK Computer","1997");
    agregarVinilo(vinilos,"The Strokes","The New Abnormal","2020");
    agregarVinilo(vinilos,"Metallica","Ride The Lightning","1984");
    agregarVinilo(vinilos,"Arctic Monkeys","AM","2013");
    mostrarColeccion(vinilos);
    mostrarDisponibles(vinilos);
    mostrarOcupados(vinilos);
    mostrarEspacioMaximo(vinilos);
    mostrarBusquedaArtista(vinilos,"Radiohead");
    mostrarBusquedaArtista(vinilos,"David Bowie");


    }

    public static String[][] agregarVinilo(String[][] vinilos, String g, String lp, String a){

        int indice = obtenerIndiceNoNull(vinilos);
        if(indice<=99){
        vinilos[indice][0] = g;
        vinilos[indice][1] = lp;
        vinilos[indice][2] = a;
        } else {
            System.out.println("Limite de vinilos agregados");
        }
    return vinilos;
    }

    public static int obtenerIndiceNoNull(String[][] vinilos){
        int indice = -1;
        for (int i = 0; i < vinilos.length; i++) {
            if(vinilos[i][0]==null){
                indice = i;
                break;
            }
        }
        return indice;
    }

    public static void mostrarColeccion(String[][] vinilos){
        for (int i = 0; i < obtenerIndiceNoNull(vinilos); i++) {
            System.out.println("Fila "+i+": "+ Arrays.toString(vinilos[i]));
        }
    }
    public static void mostrarOcupados(String[][] vinilos){
        System.out.println("Hay un total de: "+obtenerIndiceNoNull(vinilos));
    }

    public static void mostrarDisponibles(String[][] vinilos){
        System.out.println("Quedan "+(100-obtenerIndiceNoNull(vinilos))+" espacios disponibles");
    }

    public static void mostrarEspacioMaximo(String[][] vinilos){
        System.out.println("Espacio máximo colección: "+vinilos.length);
    }
    public static boolean buscarArtista(String[][] vinilos, String a){
        for (int i = 0; i < obtenerIndiceNoNull(vinilos); i++) {
            if(vinilos[i][0].equals(a)){

                return true;
            }
        }
        return false;
    }

    public static void mostrarBusquedaArtista(String[][] vinilos, String a){
        
        if(buscarArtista(vinilos, a)){
            System.out.println("El artista "+a+" si está en la colección.");
        }else{
            System.out.println("El artista "+a+" no está en la colección.");
        }
        
    }
}