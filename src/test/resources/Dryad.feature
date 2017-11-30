Feature: Dryad:
  #steal a card in front of your opponent and add it in front of you without activating its power.

  Scenario: activate power of the dryad
    Given a dryad card in my hand
    When I choose to play the dryad card
    Then the card is added to my kingdom
    And The power is activated
