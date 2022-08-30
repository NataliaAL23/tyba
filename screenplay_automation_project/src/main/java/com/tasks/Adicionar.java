package com.tasks;

import com.userinterface.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Adicionar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductPage.PRODUCTO));

    }

    public static Adicionar unProductoAlCarrito(){
        return instrumented(Adicionar.class);
    }
}
