@prod
Feature: Login Sogeti

  @test
  Scenario Outline: Se connecter via le lien mot de passe oublie
    Given je suis sur la page de connexion
    When cliquer sur Lost your password?
    And  Saisir un '<email invalid>'
    And  cliquer sur Reset Password
    Then Un message d’erreur s’affiche 'Invalid username or e-mail'

    Examples:
      | email invalid   |
      | tes@yopmail.com.toto |