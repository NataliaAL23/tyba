package com.tasks;

import com.interactions.ClickA;
import com.utils.HexadecimalToText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.awaitility.Awaitility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.openqa.selenium.support.ui.WebDriverWait.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.utils.HexadecimalToText.*;
import static com.userinterface.HomePage.*;
import static com.userinterface.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrar implements Task {
    List<Map<String, String>> registro;

    public Registrar(List<Map<String, String>> registro){
        this.registro = registro;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            //Awaitility.await().forever().pollInterval(10, TimeUnit.SECONDS);
            //actor.attemptsTo(WaitUntil.the(ICONO_USUARIO,isCurrentlyEnabled()));
            actor.attemptsTo(Click.on(ICONO_USUARIO));
            actor.attemptsTo(WaitUntil.the(BOTON_CREAR_CUENTA,isClickable()));
            actor.attemptsTo(MoveMouse.to(BOTON_CREAR_CUENTA));
            actor.attemptsTo(Click.on(BOTON_CREAR_CUENTA));
            actor.attemptsTo(Enter.theValue(registro.get(0).get("nombre_usuario")).into(CAMPO_NOMBRE_USUARIO));
            actor.attemptsTo(Enter.theValue(registro.get(0).get("correo")).into(CAMPO_CORREO));
            actor.attemptsTo(Enter.theValue(toStringHex(registro.get(0).get("contrasena"))).into(CAMPO_CONTRASENA));
            actor.attemptsTo(Enter.theValue(toStringHex(registro.get(0).get("confirmar_contrasena"))).into(CAMPO_CONFIRMAR_CONTRASENA));
            actor.attemptsTo(Enter.theValue(registro.get(0).get("nombre")).into(CAMPO_NOMBRE));
            actor.attemptsTo(Enter.theValue(registro.get(0).get("apellido")).into(CAMPO_APELLIDO));
            actor.attemptsTo(Enter.theValue(registro.get(0).get("telefono")).into(CAMPO_TELEFONO));
            actor.attemptsTo(SelectFromOptions.byVisibleText(registro.get(0).get("pais")).from(CAMPO_PAIS));
            actor.attemptsTo(Enter.theValue(registro.get(0).get("ciudad")).into(CAMPO_CIUDAD));
            actor.attemptsTo(Enter.theValue(registro.get(0).get("direccion")).into(CAMPO_DIRECCION));
            actor.attemptsTo(Enter.theValue(registro.get(0).get("estado")).into(CAMPO_ESTADO));
            actor.attemptsTo(Enter.theValue(registro.get(0).get("codigo_postal")).into(CAMPO_CODIGO_POSTAL));
            actor.attemptsTo(Click.on(DE_ACUERDO_CONDICIONES));
            actor.attemptsTo(Click.on(BOTON_REGISTRO));
    }

    public static Registrar enAdvantageShopping(List<Map<String, String>> registro){
        return instrumented(Registrar.class, registro);
    }
}
