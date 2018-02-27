package com.leonardo;

import java.util.HashSet;
import java.util.Set;

public class CuentasUsuarios {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Antonio Banderas", "00001", 200000);
        Cliente cliente2 = new Cliente("Rafael Nadal", "00002", 250000);
        Cliente cliente3 = new Cliente("Penelope Cruz", "00003", 300000);
        Cliente cliente4 = new Cliente("Julio Iglesias", "00004", 500000);


        Set<Cliente> clientesBanco = new HashSet<>();
        clientesBanco.add(cliente1);
        clientesBanco.add(cliente2);
        clientesBanco.add(cliente3);
        clientesBanco.add(cliente4);


        for (Cliente cliente : clientesBanco) {
            System.out.println(cliente.getNombre() + " " + cliente.getNumeroCuenta() + " " + cliente.getSaldo());
        }

    }
}
