package com.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {
    public static final Target INPUT_USUARIO =
            the("Campo de ingreso de usuario")
                    .located(By.name("username"));

    public static final Target INPUT_PASSWORD =
            the("Campo de ingreso de usuario")
                    .located(By.name("password"));

    public static final Target BOTON_LOGIN =
            the("Campo de ingreso de usuario")
                    .located(By.id("sign_in_btnundefined"));

    public static final Target MENSAJE_ERROR =
            the("Mensaje error contrasena invalida")
                    .located(By.xpath("//*[contains(text(),'Incorrect user name or password.')]"));
}
