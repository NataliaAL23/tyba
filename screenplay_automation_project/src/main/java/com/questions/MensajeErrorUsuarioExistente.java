package com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static com.userinterface.RegistroPage.BOTON_NOMBRE_LOGUEADO;
import static com.userinterface.RegistroPage.MENSAJE_ERROR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeErrorUsuarioExistente implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MENSAJE_ERROR,isVisible()).forNoMoreThan(15).seconds());
        String mensajeError= Text.of(MENSAJE_ERROR).viewedBy(actor).asString();
        System.out.println(mensajeError);
        return mensajeError;
    }

    public static MensajeErrorUsuarioExistente MensajeError() {
        return new MensajeErrorUsuarioExistente();
    }
}
