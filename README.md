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
   git clone https://github.com/svelezpernett98/Test-Automation-Framework.git
   cd Test-Automation-Framework

2. **Import the Project in Your IDE**
  Open your preferred IDE and import the project as a Maven project.

4. **Install Dependencies**
  Run the following Maven command to install project dependencies:
  mvn clean install

### Running Tests

Using Maven
To run all tests (dev = the desired environment. It can be dev or qa):
  bash
  mvn test -Denvironment=dev

### Writing Tests

1. Create a Page Class:
Add a new class in the pageobjectsclasses package for the web page you want to automate. Define WebElements and methods to interact with these elements.

2. Create a Test Class:
Add a new test class in the test_framework_theory package. Use TestNG annotations to define test methods.

### Test Results
Test execution results are generated using takeSnapShot method from TestListener class which takes a screenshot if the test fails by implementing the ITestListener interface, and then saves it into the screenshots folder.
   
