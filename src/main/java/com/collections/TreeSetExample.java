package com.collections;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class TreeSetExample {

    /**
     * Se puede apreciar el ordenamiento que proporciona el TreeSet dependiendo del Comparable de la clase que se usa
     * en este caso es la clase Libro y esta comparando por ISBN que es un codigo unico en cada libro.
     *
     * @param args
     */
    public static void main(String[] args) {

        Set<Libro> arbolLibro = new TreeSet<>();

        IntStream.range(0,100).forEach(e-> {
            arbolLibro.add(new Libro());
        });

        /*A esta altura ya tenemos los 100 libros agregados, si los intentamos agregar nuevamente no podemos porque
        * estamos usando una implementacion de Set, que no permite elementos duplicados. el siguiente codigo no agregara
        * nada al TreeSet */
        arbolLibro.forEach(libro -> {
            arbolLibro.add(libro);
        });

        /*Imprimimos todos los elementos del TreeSet */
        arbolLibro.forEach(System.out::println);


    }
}
