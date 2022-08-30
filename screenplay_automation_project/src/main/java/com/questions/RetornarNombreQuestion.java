package com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.userinterface.RegistroPage.BOTON_NOMBRE_LOGUEADO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RetornarNombreQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(BOTON_NOMBRE_LOGUEADO,isVisible()));
        String nombreUsuario= Text.of(BOTON_NOMBRE_LOGUEADO).viewedBy(actor).asString();
        return nombreUsuario;

    }

    public static RetornarNombreQuestion BuscarNombre() {
        return new RetornarNombreQuestion();
    }
}
