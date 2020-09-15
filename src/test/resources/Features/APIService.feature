Feature: Calculate Service

    @AddService
    Scenario Outline: Validate calculator Add Service
      Given <num1> and <num2> are updated in request xml
      When add service is called
      Then response should match <result>

      Examples:
      |num1| num2 |result|
      |2   |5     |7     |