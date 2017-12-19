Feature: Dryad:
  #steal a card in front of your opponent and add it in front of you without activating its power.

  Scenario: activate power of the dryad when my opponent has cards in his kingdom
    Given a dryad card in my hand
    When I choose to play the dryad card
    Then the card is added to my kingdom, its power is activate
    And I have 2 more card in my kingdom

  Scenario: activate power of the dryad when my opponent has not cards in his kingdom
    Given a dryad card in my hand
    When I choose to play the dryad card
    Then the card is added to my kingdom, its power is activate
    And I have 1 more card in my kingdom
