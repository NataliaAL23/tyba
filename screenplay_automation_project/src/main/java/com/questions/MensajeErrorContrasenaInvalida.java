package com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.userinterface.LoginPage.MENSAJE_ERROR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeErrorContrasenaInvalida implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MENSAJE_ERROR,isVisible()).forNoMoreThan(15).seconds());
        String mensajeError= Text.of(MENSAJE_ERROR).viewedBy(actor).asString();
        System.out.println(mensajeError);
        return mensajeError;
    }

    public static MensajeErrorContrasenaInvalida MensajeError() {
        return new MensajeErrorContrasenaInvalida();
    }
}
