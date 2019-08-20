$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/dogPile.feature");
formatter.feature({
  "name": "Busquedas en dogpile",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Cucumber"
    }
  ]
});
formatter.scenario({
  "name": "Buscar resultados relevantes",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Cucumber"
    }
  ]
});
formatter.step({
  "name": "Que el usuario entra en dogpile",
  "keyword": "Given "
});
formatter.match({
  "location": "UsuarioDogPile.que_el_usuario_entra_en_dogpile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El usuario realiza una busqueda de: rock nacional",
  "keyword": "When "
});
formatter.match({
  "location": "UsuarioDogPile.el_usuario_realiza_una_busqueda_de_rock_nacional(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El usuario deberia poder ver resultados que contengan la palabra: rock",
  "keyword": "Then "
});
formatter.match({
  "location": "UsuarioDogPile.el_usuario_deberia_poder_ver_resultados_que_contengan_la_palabra_rock(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verificar que los resultados con texto relevante al titulo",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Que el usuario entra en dogpile",
  "keyword": "Given "
});
formatter.step({
  "name": "El usuario realiza una busqueda de: \u003cpalabraBuscar\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "El usuario deberia ver un texto: \u003ctexto\u003e is relevante con el titulo: \u003ctitulo\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "palabraBuscar",
        "texto",
        "titulo"
      ]
    },
    {
      "cells": [
        "rock nacional",
        "Argentine Rock Nacional is one of",
        "Argentine rock - Wikipedia"
      ]
    },
    {
      "cells": [
        "amor",
        "amor in Harry Thurston Peck, editor",
        "amor - Wiktionary"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verificar que los resultados con texto relevante al titulo",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Cucumber"
    }
  ]
});
formatter.step({
  "name": "Que el usuario entra en dogpile",
  "keyword": "Given "
});
formatter.match({
  "location": "UsuarioDogPile.que_el_usuario_entra_en_dogpile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El usuario realiza una busqueda de: rock nacional",
  "keyword": "When "
});
formatter.match({
  "location": "UsuarioDogPile.el_usuario_realiza_una_busqueda_de_rock_nacional(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El usuario deberia ver un texto: Argentine Rock Nacional is one of is relevante con el titulo: Argentine rock - Wikipedia",
  "keyword": "Then "
});
formatter.match({
  "location": "UsuarioDogPile.el_usuario_deberia_ver_un_texto_Rock_de_Argentina_Wikipedia_is_relevante_con_el_titulo_El_rock_and_roll_surgió(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verificar que los resultados con texto relevante al titulo",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Cucumber"
    }
  ]
});
formatter.step({
  "name": "Que el usuario entra en dogpile",
  "keyword": "Given "
});
formatter.match({
  "location": "UsuarioDogPile.que_el_usuario_entra_en_dogpile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El usuario realiza una busqueda de: amor",
  "keyword": "When "
});
formatter.match({
  "location": "UsuarioDogPile.el_usuario_realiza_una_busqueda_de_rock_nacional(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El usuario deberia ver un texto: amor in Harry Thurston Peck, editor is relevante con el titulo: amor - Wiktionary",
  "keyword": "Then "
});
formatter.match({
  "location": "UsuarioDogPile.el_usuario_deberia_ver_un_texto_Rock_de_Argentina_Wikipedia_is_relevante_con_el_titulo_El_rock_and_roll_surgió(String,String)"
});
formatter.result({
  "status": "passed"
});
});