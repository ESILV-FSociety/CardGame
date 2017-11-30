Feature: Goblin:
  #switch your hand with you opponent

  Scenario: activate power of the goblin
    Given a goblin card in my hand
    When I choose to play the goblin card
    Then the card is added to my kingdom
    And The power is activated
