@MasterData
Feature: Master Data
  As an user
  I want to open master data
  So that I can access master data

  @OpenPageMasterData
  Scenario: Open page master data
    Given Logged in
    When I click master data
    Then Success to open page master data

  @AddMasterData
  Scenario: Add Master Data
    Given Logged in
    When I click master data
    And I click add data
    And I input tid "Example TID"
    And I input regional office kanwil "Jakarta"
    And I input kc supervisi "Jakarta"
    And I input branch code "15133"
    And I input lokasi "Sudirman"
    And I input address "Sudirman 1"
    And I input latitude "-6.2719350307388115"
    And I input longitude "106.8198480755785"
    And I click save
    Then Success to add master data