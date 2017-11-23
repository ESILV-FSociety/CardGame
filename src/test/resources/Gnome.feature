Feature: Gnome
  # a gnome draws two cards

Scenario: activate power of gnome
  Given I have a gnome in my hand
  Then The number of cards in my hand is 1
  When I choose the card gnome
  Then The card mooves to the board
  And The power is activate and I have 2 cards in my hand
