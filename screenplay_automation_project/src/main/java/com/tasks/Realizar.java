package com.tasks;

import com.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Realizar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue("standard_user").into(LoginPage.INPUT_USUARIO),
                Enter.theValue("secret_sauce").into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BOTON_LOGIN)
        );
    }

    public static Realizar AutenticacionEnSaucelabs(){
        return instrumented(Realizar.class);
    }
}
