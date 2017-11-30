Feature: Troll:
  # swap the cards in front of you with the cards in front of your opponent

  Scenario: activate power of the troll
    Given a troll card in my hand
    When I choose to play the troll card
    Then the card is added to my kingdom
    And The power is activated
