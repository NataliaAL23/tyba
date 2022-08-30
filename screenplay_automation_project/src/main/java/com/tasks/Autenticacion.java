package com.tasks;

import com.utils.HexadecimalToText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import java.util.List;
import java.util.Map;
import static com.userinterface.HomePage.ICONO_USUARIO;
import static com.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticacion implements Task {
    List<Map<String, String>> registro;
    public Autenticacion(List<Map<String, String>> registro){
        this.registro = registro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ICONO_USUARIO));
        actor.attemptsTo(Enter.theValue(registro.get(0).get("nombre_usuario")).into(INPUT_USUARIO));
        actor.attemptsTo(Type.theValue(HexadecimalToText.toStringHex(registro.get(0).get("contrasena"))).into(INPUT_PASSWORD));
        actor.attemptsTo(Click.on(BOTON_LOGIN));
    }

    public static Autenticacion enAdvantageShopping(List<Map<String, String>> registro){
        return instrumented(Autenticacion.class, registro);
    }
}
