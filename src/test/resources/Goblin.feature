Feature: Goblin:
  #switch your hand with you opponent

  Scenario: activate power of the goblin
    Given I have a goblin card in my hand
    When I choose to play the goblin card
    Then The card goblin is added to my kingdom, its power is activate
    And I change my hand with the hand of my opponent
