Feature: Korrigan:
  #draw 2 random cards within your opponent hand

  Scenario: activate power of the elf
    Given a korrigan card in my hand
    When I choose to play the korrigan card
    Then the card is added to my kingdom
    And The power is activated
