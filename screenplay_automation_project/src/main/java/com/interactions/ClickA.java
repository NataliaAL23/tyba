package com.interactions;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.userinterface.RegistroPage.BOTON_REGISTRO;
import static com.userinterface.RegistroPage.DE_ACUERDO_CONDICIONES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ClickA implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_REGISTRO));
    }

    public static Performable ClickA(){
        return Tasks.instrumented(ClickA.class);
    }
}
