package com.streams;

import com.leonardo.Cliente;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExamples {

    private Collection<String> preciosString;
    private Collection<String> productos;
    private int[] matriz = new int[6];
    private int[] segundaMatriz = {10, 5, 6 , -1, 100};

    public static void main(String[] args) {
        StreamsExamples examples = new StreamsExamples();

        System.out.println(examples.retornarMayor(examples.segundaMatriz));
        System.out.println(examples.retornarMayor(examples.matriz));
        System.out.println(examples.retornarMenor(examples.segundaMatriz));

    }
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

    private String retornarMayor(int[] matriz){
        return Optional.ofNullable(Arrays.stream(matriz).max())
                .map(e-> e.getAsInt())
                .map(e -> e.toString())
                .orElse("");
    }

    private String retornarMenor(int[] matriz){
        return Optional.ofNullable(Arrays.stream(matriz).min())
                .map(e-> e.getAsInt())
                .map(e -> e.toString())
                .orElse("");
    }


}
