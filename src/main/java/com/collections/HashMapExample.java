package com.collections;

import java.util.HashMap;

/**
 * Dada una lista clave-valor que puede tener claves repetidas, generar una salida con una lista sin claves repetidas y que ademas sume
 * los valores de las que ya se encuentren, ejemplo: clave:1 valor:2 es el primer elemento, si en alguno de los siguientes elementos se
 * consigue clave:1 entonces sumar el valor:2 mas el nuevo valor que se esta ingresando
 */
public class HashMapExample {


    private static final Integer[][] listaClaveValorDuplicada = {{1, 2}, {2, 1}, {1, 3}, {1, 5}};

    //Buscar en una lista de Transacciones ejecutadas, si alguna ya fue ejecutada, si se consigue, se obtiene el numero
    //de ejecuciones que tiene y se le suman los del nuevo elemento que se esta agregando, e.g:

    /*
    Lista1:
    trx1 - 10 ejecuciones
    trx2 - 21 ejecuciones
    trx3 - 5 ejecuciones
    trx4 - 5 ejecuciones
    lista2:

    trx7 - 10 ejecuciones
    trx11 - 5 ejecuciones
    trx2 - 17 ejecuciones
    trx20 - 5 ejecuciones

    al sumarizar la cantidad de ejecuciones por TRX deberia quedar asi:

    trx1 - 10 ejecuciones
    trx2 - 38 ejecuciones -> se sumaron 21 ejecuciones + 17 de la otra lista
    trx3 - 5 ejecuciones
    trx4 - 5 ejecuciones
    trx7 - 10 ejecuciones
    trx11 - 5 ejecuciones
    trx20 - 5 ejecuciones

    */

    public static void main(String[] args) {

        HashMap<Integer, Integer> listaClaveValor = new HashMap<>();

        for (Integer[] claveValor : listaClaveValorDuplicada) {

            Integer trxConseguida = listaClaveValor.get(claveValor[0]);
            if (trxConseguida != null) {
                Integer clave = claveValor[0];
                Integer valor = trxConseguida + claveValor[1];
                Integer resultado = listaClaveValor.put(clave, valor);
            } else {
                Integer resultado = listaClaveValor.put(claveValor[0], claveValor[1]);
            }
        }
        System.out.println(listaClaveValor);
    }
}
