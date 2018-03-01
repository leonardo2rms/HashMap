package com.streams;

import javax.xml.ws.Response;
import java.util.Collection;
import java.util.Optional;
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
        Collection<String> productosSinDuplicados = productos.stream()
                .distinct()
                .collect(Collectors.toList());
        return productosSinDuplicados;
    }

    private Response<String> hola(){
        Optional<String> optional = Optional.empty();
        Optional<Response<String>>> = optional
                .map(val -> new Response(val))

    }

}
