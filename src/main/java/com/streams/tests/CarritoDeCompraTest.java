package com.streams.tests;


import com.streams.CarritoBuilder;
import com.streams.CarritoDeCompra;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CarritoDeCompraTest {

    @Test
    public void shouldReturnTheCountOfAllItems() throws Exception {

        CarritoBuilder builder = new CarritoBuilder(30);
        CarritoDeCompra CarritoDeCompra = builder.build();
        Assert.assertEquals(30, CarritoDeCompra.contarNumeroProductos());
    }

    @Test
    public void shouldCalculateTotalPrice() throws Exception {

        CarritoBuilder builder = new CarritoBuilder(60,5);
        CarritoDeCompra CarritoDeCompra = builder.build();
        Assert.assertEquals(300, CarritoDeCompra.calcularPrecioTotal());

    }



    @Test
    public void shouldCalculateTotalPriceLambda() throws Exception {

        CarritoBuilder builder = new CarritoBuilder(60, 5);
        CarritoDeCompra CarritoDeCompra = builder.build();
        Assert.assertEquals(300, CarritoDeCompra.calcularPrecioTotalLambda());
    }

    @Test
    public void shouldCalculateTotalPriceRefMethod() throws Exception {

        CarritoBuilder builder = new CarritoBuilder(60,5);
        CarritoDeCompra CarritoDeCompra = builder.build();
        Assert.assertEquals(300, CarritoDeCompra.calcularPrecioTotal());
    }
}