package com.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;


public class RegistroPage {

    public static final Target CAMPO_NOMBRE_USUARIO =
            the("Campo nombre usuario")
                    .located(By.name("usernameRegisterPage"));

    public static final Target CAMPO_CORREO =
            the("Campo correo")
                    .located(By.name("emailRegisterPage"));

    public static final Target CAMPO_CONTRASENA =
            the("Campo contrasena")
                    .located(By.name("passwordRegisterPage"));

    public static final Target CAMPO_CONFIRMAR_CONTRASENA =
            the("Campo confirmar contrasena")
                    .located(By.name("confirm_passwordRegisterPage"));

    public static final Target CAMPO_NOMBRE =
            the("Campo nombre")
                    .located(By.name("first_nameRegisterPage"));

    public static final Target CAMPO_APELLIDO =
            the("Campo apellido")
                    .located(By.name("last_nameRegisterPage"));
    public static final Target CAMPO_TELEFONO =
            the("Campo telefono")
                    .located(By.name("phone_numberRegisterPage"));

    public static final Target CAMPO_PAIS =
            the("Campo pais")
                    .located(By.name("countryListboxRegisterPage"));

    public static final Target CAMPO_CIUDAD =
            the("Campo ciudad")
                    .located(By.name("cityRegisterPage"));

    public static final Target CAMPO_DIRECCION =
            the("Campo direccion")
                    .located(By.name("addressRegisterPage"));

    public static final Target CAMPO_ESTADO =
            the("Campo estado")
                    .located(By.name("state_/_province_/_regionRegisterPage"));

    public static final Target CAMPO_CODIGO_POSTAL =
            the("Campo codigo postal")
                    .located(By.name("postal_codeRegisterPage"));

    public static final Target DE_ACUERDO_CONDICIONES =
            the("Check de acuerdo con terminos y condiciones")
                    .located(By.name("i_agree"));

    public static final Target BOTON_REGISTRO =
            the("Boton registro")
                    .located(By.id("register_btnundefined"));

    public static final Target BOTON_NOMBRE_LOGUEADO =
            the("Boton registro")
                    .located(By.className("containMiniTitle"));

    public static final Target MENSAJE_ERROR =
            the("Mensjae error usuario existente")
                    .located(By.xpath("//*[contains(text(),'User name already exists')]"));

}
