# Test Automation Framework

This is a Java-based test automation framework using Selenium WebDriver, designed with the Page Object Model (POM) pattern. The project is managed with Maven, making it easy to handle dependencies and build processes.

## Table of Contents

- [Project Overview](#project-overview)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Running Tests](#running-tests)
- [Writing Tests](#writing-tests)
- [Test results](#Test-results)

## Project Overview

The purpose of this framework is to provide a robust and scalable test automation solution for web applications. By using the Page Object Model, we separate the test scripts from the page elements, promoting reusability and maintainability.

## Technology Stack

- **Java**: Programming language for writing test scripts.
- **Selenium WebDriver**: For interacting with web browsers.
- **TestNG**: Testing framework to run and organize test cases.
- **Maven**: Build automation tool for project management.

## Project Structure
![image](https://github.com/user-attachments/assets/0ce7c918-30b7-4657-b279-be06cdd59147)

project-root
│
├── screenshots
├── src
│ ├── main
│ │ └── java
│ │ ├── com.epam.training.student_santiago_velez.framework_theory
│ │ ├── base
│ │ │ ├── BaseClass.java
│ │ │ └── Hooks.java
│ │ ├── model
│ │ │ └── ComputeEngine.java
│ │ ├── pageobjectsclasses
│ │ │ ├── ComputeEnginePage.java
│ │ │ ├── CostEstimateSummaryPage.java
│ │ │ └── GoogleCloudCalculatorPage.java
│ │ ├── service
│ │ │ ├── ComputeEngineCreator.java
│ │ │ └── TestDataReader.java
│ │ ├── util
│ │ │ ├── StringUtils.java
│ │ │ └── TestListener.java
│ │ └── resources
│ │ │ ├── dev.properties
│ │ │ └── qa.properties
│ └── test
│ └── java
│ ├── com.epam.training.student_santiago_velez.test_framework_theory
│ │ └── AppTest.java
│
├── pom.xml
├── testng-all.xml
└── testng-smoke.xml

- **base**: Contains base classes for common operations like WebDriver initialization, waits setup, and other common actions perfomred by the WebDriver. Additionally the Hooks class contains the @BeforeSuite, and @AfterSuite methods for calling the driver setup, and driver cleanup.
- **model**: Contains model classes for the elements that the developer might want to interact with as a model for easier code readibility, and multi-environment support.
- **pageobjectsclasses**: Contains page classes where each class represents a web page and its elements.
- **service**: Contains service classes for creation of instances of the model classes, and reading environment data from the .properties files.
- **util**: Contains utility classes for common operations like Strings manipulation, or ItestListener implementation.
- **resources**: Contains .properties files which contain environment related data for model classes instances initialization.
- **test_framework_theory**: Contains test classes where each class represents test cases.

## Setup and Installation

### Prerequisites

- Java JDK 8 or above
- Maven 3.6 or above
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/yourproject.git
   cd yourproject

2. Import the Project in Your IDE
  Open your preferred IDE and import the project as a Maven project.

3. Configure WebDriver
  Ensure that the appropriate WebDriver (e.g., ChromeDriver) is installed and its path is set in your system PATH variable, or specify the path in WebDriverManager class.

4. Install Dependencies
  Run the following Maven command to install project dependencies:
  mvn clean install

###Running Tests

Using Maven
To run all tests:
  bash
  mvn test -Denvironment=dev

Using TestNG XML
You can run tests using a TestNG XML file for more control over which tests are executed:
  bash
  mvn clean test -DsuiteXmlFile=testng.xml

### Writing Tests

1. Create a Page Class
  Add a new class in the pages package for the web page you want to automate. Define WebElements and methods to interact with these elements.

2. Create a Test Class
  Add a new test class in the tests package. Use TestNG annotations to define test methods.

### Test results

Test execution results are generated using takeSnapShot method from TestListener class which takes a screenshot if the test fails.
   
