Feature: Route map

  Scenario: Map Path Test
    Given I am on the openstreetmap
    When I enter 'Радищева, Київ' in From, enter 'Кембридж' in To,  select 'Bicycle OSRM'
    Then I click 'Find' button