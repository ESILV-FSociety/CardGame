Feature: Gnome
  # a gnome draws two cards

  Scenario: activate power of gnome
    Given I have a gnome in my hand
    Then The number of cards in my hand is 1
    When I choose the card gnome and the power is activate
    Then I have 2 cards in my hand

  Scenario: activate power of gnome when the deck is empty
    Given I have a gnome in my hand
    Then The number of cards in my hand is 1
    When I choose the card gnome and the power is activate
    Then I have 0 cards in my hand