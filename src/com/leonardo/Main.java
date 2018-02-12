package com.leonardo;

import java.util.HashMap;
import java.util.HashSet;

public class Main {


    private static final Integer[] listaDuplicada = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
    private static final Integer[][] listaEjecucionesDuplicadas = {{1, 2}, {2, 1}, {1, 3}, {1, 5}};

    public static void main(String[] args) {
        HashSet<Integer> listaSinDuplicados = new HashSet<>();

        for (Integer numero : listaDuplicada) {

            if (listaSinDuplicados.add(numero)) {
                System.out.println("Agregue el numero : " + numero);
            } else {
            }
        }

        System.out.println(listaSinDuplicados);


        HashMap<Integer, Integer> listaEjecuciones = new HashMap<>();

        for (Integer[] trx : listaEjecucionesDuplicadas) {

            Integer trxConseguida = listaEjecuciones.get(trx[0]);
            if (trxConseguida != null) {
                Integer idEjecucion = trx[0];
                Integer cantidadEjecuciones = trxConseguida + trx[1];
                Integer resultado = listaEjecuciones.put(idEjecucion, cantidadEjecuciones);

            } else {
                Integer resultado = listaEjecuciones.put(trx[0], trx[1]);
            }

        }

        System.out.println(listaEjecuciones);


    }
}
