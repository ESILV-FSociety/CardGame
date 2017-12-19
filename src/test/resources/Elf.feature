Feature: Elf:
  #copy and use the power of one of the card in front of you

  Scenario: activate power of the elf, when I have one or more cards in my kingdom
    Given I have an elf card in my hand
    When I choose to play the elf card
    Then The card is added to my kingdom, its power is activate
    And play the power of one card on my kingdom

  Scenario: activate power of the elf, when I have 0 card in my kingdom
    Given I have an elf card in my hand
    When I choose to play the elf card
    Then The card is added to my kingdom, its power is activate

  Scenario: activate power of the elf, when I have 1 card Elf in my kingdom
    Given I have an elf card in my hand
    When I choose to play the elf card
    Then The card is added to my kingdom, its power is activate
