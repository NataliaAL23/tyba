package com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/registro_usuario.feature",
        glue = "com.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AdvantageRegistroUsuarioRunner {
}

