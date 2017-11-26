Feature: Elf:
  #copy and use the power of one of the card in front of you

  Scenario: activate power of the elf
    Given an elf card in my hand
    When I choose to play the elf card
    Then the card is added to my kingdom
    And The power is activated
