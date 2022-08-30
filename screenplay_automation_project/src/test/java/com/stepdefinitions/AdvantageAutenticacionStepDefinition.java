package com.stepdefinitions;

import com.questions.MensajeErrorContrasenaInvalida;
import com.tasks.Autenticacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.containsString;

import java.util.List;
import java.util.Map;

public class AdvantageAutenticacionStepDefinition {

    @Cuando("ingresa sus credenciales")
    public void ingresaSusCredenciales(List<Map<String,String>> registros) {
        theActorInTheSpotlight().attemptsTo(Autenticacion.enAdvantageShopping(registros));

    }

    @Entonces("debe obtener el mensaje de error")
    public void mensajeErrorContrasenaInvalida(List<Map<String,String>> registros) {
        theActorInTheSpotlight().should(seeThat(MensajeErrorContrasenaInvalida.MensajeError(),containsString(registros.get(0).get("mensaje_error_contrasena_invalida"))));

    }
}
