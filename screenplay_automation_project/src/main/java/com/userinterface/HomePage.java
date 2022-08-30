package com.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage {

    public static final Target ICONO_USUARIO=
            the("Opciones de registrar o autenticar usuario")
                    .located(By.id("menuUserSVGPath"));

    public static final Target BOTON_CREAR_CUENTA =
            the("Boton crear cuenta")
                    .located(By.xpath("//a[@class='create-new-account ng-scope']"));


}
