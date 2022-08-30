package com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarProductosACarrito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static IngresarProductosACarrito IngresarProductos(List<Map<String, String>> registro){
        return instrumented(IngresarProductosACarrito.class, registro);
    }
}
