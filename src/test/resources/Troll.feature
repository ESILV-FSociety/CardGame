Feature: Troll:
  # swap the cards in front of you with the cards in front of your opponent

  Scenario: activate power of the troll
    Given I have a troll card in my hand
    When I choose to play the troll card
    Then The card Gnome is added to my kingdom, its power is activate
    And I change my kingdom with the kingdom of my opponent