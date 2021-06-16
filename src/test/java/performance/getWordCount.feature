Feature: Get word count

  Background: Get word count - initiate base URL
    * url 'http://localhost:8080'
    * header Authorization = call read('file:src/basic-auth.js') { username: 'admin', password: 'password' }

  Scenario Outline: Validate word count
    Given path 'getTopResultsApi'
    And params { count: '<number>' }
    And method get
    Then status 200
    And def actualResponse = response
    And print actualResponse
    Then match actualResponse == {"I":5,"this":3,"my":3,"could":2,"know":2,"play":1,"stupid":1,"die":1,"be":1,"thought":1,"hoped":1,"soul":1,"couch":1,"Is":1,"reptilian":1,"beautiful":1,"and":1,"God":1,"just":1,"on":1,"Space":1,"That":1,"But":1,"always":1,"a":1,"mind":1,"d":1,"learn":1,"like":1,"in":1,"was":1,"friends":1,"really":1,"the":1,"never":1,"Pope":1,"once":1,"to":1,"If":1,"thing":1,"You":1,"sitting":1,"Goodbye":1}

    Examples:
      | number |
      | 44     |