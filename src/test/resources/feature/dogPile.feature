@Cucumber
Feature: Busquedas en dogpile

  Scenario: Buscar resultados relevantes
    Given Que Karen entra en dogpile
   When Karen realiza una busqueda de: rock nacional
    Then Karen deberia poder ver resultados que contengan la palabra: rock


  Scenario Outline:  Verificar que los resultados con texto relevante al titulo
    Given Que Jose entra en dogpile
    When Jose realiza una busqueda de: <palabraBuscar>
    Then Jose deberia ver un texto: <texto> is relevante con el titulo: <titulo>
    Examples:
      | Descripcion       | palabraBuscar | texto                               | titulo                     |
      | Resultado de Rock | rock nacional | Argentine Rock Nacional is one of   | Argentine rock - Wikipedia |
      | Resultado de Amor | amor          | amor in Harry Thurston Peck, editor | amor - Wiktionary          |