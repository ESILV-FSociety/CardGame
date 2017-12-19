Feature: Korrigan:
  #draw 2 random cards within your opponent hand

  Scenario: activate power of the korrigan
    Given I have a korrigan card in my hand
    When I choose to play the korrigan card
    Then The card korrigan is added to my kingdom, its power is activate
    And I have 2 more cards in my hand

  Scenario: activate power of korrigan when my opponent has less than 2 cards
    Given I have a korrigan card in my hand
    When I choose to play the korrigan card
    Then The card korrigan is added to my kingdom, its power is activate
    And My opponent has 0 cards in his hand

