# QA Automation Framework

A comprehensive test automation framework built with Java, Selenium WebDriver, RestAssured, and TestNG for testing [DemoQA](https://demoqa.com).

## 🛠️ Tech Stack

- **Java 17**
- **Selenium WebDriver 4** — UI test automation
- **TestNG** — Test framework
- **Rest Assured** — API test automation
- **WebDriverManager** — Automatic driver management
- **Maven** — Build and dependency management
- **Allure** — Test reporting

## 📁 Project Structure
src/
├── main/java/com/qaframework/
│   └── pages/
└── test/java/com/qaframework/
├── tests/
│   ├── ui/
│   └── api/
└── utils/
## ✅ Test Cases

### UI Tests
- Valid login test
- Invalid login test

### API Tests
- Get user by ID
- Create new user
- Get book list

## 🚀 How to Run

```bash
mvn test
```