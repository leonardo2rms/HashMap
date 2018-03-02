package com.streams;

import java.util.Collection;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsExamples {

    private Collection<String> preciosString;
    private Collection<String> productos;

    private int obtenerTotalPrecios() {
        return this.preciosString.stream()
                .mapToInt(Integer::valueOf)
                .sum();
    }

    private Collection<String> obtenerProductosSinDuplicados() {
        return productos.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    private Collection<String> multiplicarPorRandom(Collection<String> coleccion) {
        return coleccion.stream()
                .mapToDouble(Double::parseDouble)
                .map(e -> e * new Random().ints(1, 10).findFirst().getAsInt())
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
    }

    private Collection<String> retornarPares(Collection<String> coleccion) {
        return coleccion.stream()
                .mapToInt(Integer::parseInt)
                .filter(e -> (e % 2) == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
    }

    private String retornarRaizCuadradaYSumar(Collection<String> coleccion) {
        return String.valueOf(coleccion.stream()
                .mapToInt(Integer::parseInt)
                .map(e -> (int) Math.pow(e, 3))
                .sum());
    }


}
