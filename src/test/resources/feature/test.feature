Feature: Busquedas en dogpile

Scenario: Buscar resultados relevantes
    Given Que el usuario entra en dogpile
    When El usuario realiza una busqueda de: rock nacional
    Then El usuario deberia poder ver resultados que contengan la palabra: rock