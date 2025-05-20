
# 💼 Wells Fargo Virtual Experience Program – Task 2: Counselor Project

This repository contains my implementation of **Task 2** from the Wells Fargo Software Engineering Virtual Internship. The task involves building a simple backend structure for a financial counselor application using **Java** and **Spring Boot**.

---

## 📌 Project Overview

The application models a system where:

- A **Financial Advisor** manages multiple **Clients**.
- Each **Client** owns a **Portfolio**.
- Each **Portfolio** contains multiple **Securities**.

This structure is built using **Java classes** with proper entity relationships and is organized following standard backend project conventions.

---

## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **Maven**
- **JUnit (for testing)**

---

## 🧩 Project Structure

```

counselor/
├── src/
│   ├── main/
│   │   ├── java/com/wellsfargo/counselor/
│   │   │   ├── entity/           # Contains Client, FinancialAdvisor, Portfolio, Security
│   │   │   ├── CounselorApplication.java
│   │   │   └── Main.java         # Optional runner class
│   │   └── resources/application.properties
│   └── test/...
├── pom.xml
├── mvnw, mvnw\.cmd
└── HELP.md

````

---

## 🚀 Getting Started

### 1. Clone the repo

```bash
git clone https://github.com/shriya-kamat/wells-fargo.git
cd wells-fargo/counselor
````

### 2. Run the application

Open in your favorite IDE (like IntelliJ or VS Code) and run:

```bash
CounselorApplication.java
```

---

## 🧪 Run Tests

Unit test provided in `CounselorApplicationTests.java`:

```bash
./mvnw test
```

---

## 🙋‍♀️ Author

**Shriya Kamat**
🌐 [GitHub](https://github.com/shriya-kamat) | ✉️ [LinkedIn](https://www.linkedin.com/in/shriya-kamat)

---

## ✅ Submission

This project was submitted as part of the Wells Fargo Forage Virtual Experience Program.

```

