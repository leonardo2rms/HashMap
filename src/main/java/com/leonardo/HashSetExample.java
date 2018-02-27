package com.leonardo;

import java.util.HashSet;

public class HashSetExample {
    private static final Integer[] listaDuplicada = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};

    public static void main(String[] args) {
        HashSet<Integer> listaSinDuplicados = new HashSet<>();

        for (Integer numero : listaDuplicada) {

            if (listaSinDuplicados.add(numero)) {
                System.out.println("Agregue el numero  : " + numero);
            }
        }

        System.out.println(listaSinDuplicados);

    }
}
