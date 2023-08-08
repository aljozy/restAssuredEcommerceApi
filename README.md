```markdown
# Ecommerce API Automation using RestAssured and Cucumber

Welcome to the Ecommerce API Automation project! This project demonstrates the automation of an ecommerce API using RestAssured, a powerful Java library for API testing. The chosen framework for this project is BDD (Behavior-Driven Development) with Cucumber, utilizing Gherkin keywords for clear and expressive test scenarios.

## Project Overview

The goal of this project is to provide end-to-end automation testing for an ecommerce API. The tests are written in a human-readable format using Gherkin syntax, making it easier for both technical and non-technical stakeholders to understand the test scenarios. RestAssured, with its extensive features and capabilities, is used to interact with the API endpoints.

## Key Features

- **RestAssured:** Utilize the RestAssured library to make API requests and validate responses effectively.
- **BDD with Cucumber:** Use the BDD approach to write test scenarios using Cucumber's Gherkin syntax for better collaboration between team members.
- **Logging:** Enable logging of both request and response details to enhance transparency and debugging.
- **TestNG Runner:** Leverage the TestNG framework to organize and execute tests, allowing parallel execution and better test management.
- **Extent Report:** Generate comprehensive and visually appealing test reports using Extent Report to track test execution results.

## Getting Started

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/aljozy/restAssuredEcommerceApi.git
   ```

2. Navigate to the project directory:

   ```bash
   cd restAssuredEcommerceApi
   ```

3. Install necessary dependencies (if any) and set up your testing environment.

4. Execute the tests:

   ```bash
   mvn test
   ```

   This command will run the TestNG test suite and execute the automated tests.

## Test Scenarios

The test scenarios cover various aspects of the ecommerce API, including authentication, product management, cart functionality, checkout process, and more. Each test scenario is written in the Gherkin language and is easy to understand.

## Reporting

After executing the tests, Extent Report will generate a detailed HTML report located in the `target` directory. This report provides insights into test results, including passed, failed, and skipped tests, along with execution times.

## Contributing

Contributions are welcome! If you find any issues or would like to enhance the project, feel free to create a pull request.





