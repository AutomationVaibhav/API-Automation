# Rest Assured API Test Automation Framework

This is a test automation framework for REST APIs built using Rest Assured, Java, TestNG, and Maven.

## Features

*   **REST API Testing**: Automates testing of RESTful web services.
*   **TestNG**: Used for test management and execution.
*   **Maven**: For project and dependency management.
*   **Reporting**: Generates detailed test reports.
*   **Logging**: Captures detailed logs for debugging.

## Prerequisites

*   Java Development Kit (JDK) 11 or higher
*   Apache Maven

## Getting Started

1.  **Clone the repository:**

    ```bash
    git clone <repository-url>
    ```

2.  **Navigate to the project directory:**

    ```bash
    cd APIAutomateFramework
    ```

3.  **Install dependencies:**

    ```bash
    mvn install
    ```

## Project Structure

```
APIAutomateFramework/
├── pom.xml
├── suite.xml
├── logs/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └──...
│       └── resources/
└── target/
```

*   `pom.xml`: Contains all the project dependencies and plugins.
*   `suite.xml`: TestNG suite file to run the tests.
*   `logs/`: Contains application and test logs.
*   `src/main/java`: Main application source code.
*   `src/test/java`: Test scripts.
*   `src/test/resources`: Test data and configuration files.
*   `target/`: Contains the compiled code and test reports.

## Design Patterns Used

This framework incorporates several design patterns to ensure the code is clean, maintainable, and scalable.

### Service Object Model (SOM)

The framework uses a Service Object Model, where API services are encapsulated into separate classes (e.g., `AuthService`). This pattern helps in:
- **Separation of Concerns**: Test logic is separated from the API endpoint interaction logic.
- **Reusability**: Service methods can be reused across multiple tests.
- **Maintainability**: Changes to an API endpoint only require updates in one place—the corresponding service class.

### Builder Design Pattern

The Builder pattern is used to construct complex request objects (e.g., `SignUPRequest`). This approach provides:
- **Improved Readability**: Makes test data creation more understandable and fluent.
- **Flexibility**: Allows for the easy creation of request objects with different sets of data.
- **Immutability**: Helps in creating immutable model objects.

## Running the tests

To run the tests, you can use the following Maven command:

```bash
mvn test
```

## Built With

*   [Rest Assured](http://rest-assured.io/) - API Test Automation Library
*   [Java](https://www.java.com/) - Programming Language
*   [TestNG](https://testng.org/) - Testing Framework
*   [Maven](https://maven.apache.org/) - Dependency Management

