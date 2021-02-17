# QualityLab1

## 1.    What is the output of each method in the console?
  Both test output the amount of test executed, ignored, or failed. In this case, 3 tested and one ignored.
## 2.    What is the difference between the setup and init methods?
  setup executes before any test, while init executes once, previous to the test, for each test in the class.
## 3.    Give an example of when you can use init and tearDown methods
  init could be used as a setup and verification of specific data input into the test, whereas teardown can be used to verify the status of each test.
## 4.    What is @Disabled used for?
  To ignore tests. This means it can potentially be used to ignore faulty, unused, incomplete or unimplemented tests.
## 5.    What is the difference and pros/cons of using Maven Test and Junit Test options?
  Maven has a more strict system for running tests, but is slower. The slower process of maven tests vs junit tests might represent vital differences for different situations.
