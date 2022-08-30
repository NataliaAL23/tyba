package com.stepdefinitions;

import com.questions.MensajeErrorUsuarioExistente;
import com.questions.RetornarNombreQuestion;
import com.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;



public class AdvantageRegistroUsuarioStepDefinition {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario (.*) abre la pagina web de Advantage Online Shopping")
    public void queElUsuarioAbreLaPagina(String nombre) {
        theActorCalled(nombre).wasAbleTo(Open.url("https://www.advantageonlineshopping.com/#"));
    }

    @Cuando("se registra con los datos")
    public void seRegistra(List<Map<String,String>> registros) {
       theActorInTheSpotlight().attemptsTo(Registrar.enAdvantageShopping(registros));
    }

    @Entonces("debe poder navegar en la pagina")
    public void debePoderNavegarEnLaPagina(List<Map<String,String>> registros) {
        theActorInTheSpotlight().should(seeThat(RetornarNombreQuestion.BuscarNombre(),containsString(registros.get(0).get("nombre_usuario"))));
    }

    @Entonces("debe recibir el mensaje de error")
    public void debeRecibirMensajeError(List<Map<String,String>> registros) {
        theActorInTheSpotlight().should(seeThat(MensajeErrorUsuarioExistente.MensajeError(),containsString(registros.get(0).get("mensaje_error_usuario_existente"))));
    }

}
