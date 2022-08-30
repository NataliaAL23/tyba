package com.stepdefinitions;

import com.questions.MensajeErrorContrasenaInvalida;
import com.tasks.Autenticacion;
import com.tasks.IngresarProductosACarrito;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class AdvantageCompraProductosStepDefinition {
    @Dado("que el usuario (.*) se loguea en la pagina")
    public void queElUsuarioSeLogueaLaPagina( List<Map<String,String>> registros) {
        theActorCalled("Pedro").wasAbleTo(Open.url("https://www.advantageonlineshopping.com/#"));
        theActorInTheSpotlight().attemptsTo(Autenticacion.enAdvantageShopping(registros));
    }

    @Cuando("ingresa los productos al carrito")
    public void ingresaSusCredenciales(List<Map<String,String>> registros) {
        theActorInTheSpotlight().attemptsTo(IngresarProductosACarrito.IngresarProductos(registros));

    }

    @Cuando("realiza el pago")
    public void realizarPago(List<Map<String,String>> registros) {


    }
    @Entonces("comprobar que el costo tota fue")
    public void mensajeErrorContrasenaInvalida(List<Map<String,String>> registros) {


    }
}
