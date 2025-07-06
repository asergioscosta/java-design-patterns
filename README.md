# Java Design Patterns  
*A comprehensive repository for exploring and learning GoF (Gang of Four) Design Patterns in Java.*

![Project Status](https://img.shields.io/badge/Status-Active-blue.svg)
[![MIT License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
![Java Version](https://img.shields.io/badge/Java-17+-orange.svg?logo=java)

---

## Table of Contents  
1. [About the Project](#about-the-project)  
2. [Key Features](#key-features)  
3. [Technologies Used](#technologies-used)  
4. [Installation](#installation)  
5. [Project Structure](#project-structure)  
6. [Design Patterns Overview](#design-patterns-overview)  
7. [Contributing](#contributing)  
8. [License](#license)  
9. [Author](#author)  

---

## About the Project  
This repository provides **practical implementations and examples of the Gang of Four (GoF) Design Patterns in Java**.  
It is intended as a reference and learning resource for software developers interested in mastering design patterns.

### Why this project?  
- To offer clear and real-world implementations of each GoF pattern.  
- To demonstrate usage through UML diagrams and unit tests.  
- To serve as a starting point for developers and students learning software architecture.  

---

## Key Features  
- **Comprehensive GoF Patterns:** Includes Creational, Structural, and Behavioral design patterns.  
- **Clean Code Examples:** Follows modern Java best practices for clarity and maintainability.  
- **UML Diagrams:** PDF diagrams available for all patterns to aid visual learning.  
- **Practical Use Cases:** Realistic examples that demonstrate where and how each pattern can be applied.  
- **Unit Tests:** Each implementation is covered by tests to illustrate expected behavior.  

---

## Technologies Used  
[![Java](https://img.shields.io/badge/Java-17+-orange?logo=java&logoColor=white)](https://www.java.com/)
[![Maven](https://img.shields.io/badge/Apache_Maven-3.8+-%23C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![JUnit5](https://img.shields.io/badge/JUnit-5-%2325A162?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-2025.1-%23000000?logo=intellijidea&logoColor=white)](https://www.jetbrains.com/idea/)

---

## Installation  

### Prerequisites  
Ensure you have the following tools installed:

* **Java Development Kit (JDK) 17+** (The project is developed with JDK 24, but is compatible with JDK 17 and newer versions.)
* **Apache Maven 3.8+**

### Steps  
1️⃣ Clone the repository

Open your terminal or command prompt and execute:

```bash
git clone https://github.com/asergioscosta/java-design-patterns-gof.git
```

2️⃣ Navigate to the project directory

Change your current directory to the root of the cloned project:

```bash
cd java-design-patterns-gof
```

3️⃣ Open in your IDE

After navigating to the project directory, you can open it in your favorite Java IDE:

  * **IntelliJ IDEA:** Go to `File > Open...` and select the `java-design-patterns-gof`. IntelliJ will automatically detect it as a Maven project.
  * **VS Code:** Go to `File > Open Folder...` and select the `java-design-patterns-gof`. Ensure you have the Java Extension Pack installed. 

---

## Project Structure

```plaintext
java-design-patterns-gof/  
├── .idea/  
├── docs/  
│   └── diagrams/               # UML diagrams (PDF)  
│       ├── behavioral/  
│       ├── creational/  
│       └── structural/  
├── src/  
│   ├── main/java/org/example/patterns/  
│   │   ├── behavioral/         # Behavioral patterns  
│   │   ├── creational/         # Creational patterns  
│   │   └── structural/         # Structural patterns  
│   └── test/java/org/example/patterns/  
│       ├── behavioral/  
│       ├── creational/  
│       └── structural/  
├── Main.java  
├── pom.xml  
└── README.md  
```

---

## Design Patterns Overview

| Pattern Name            | Category   |
| ----------------------- | ---------- |
| **Creational Patterns** |            |
| Abstract Factory        | Creational |
| Builder                 | Creational |
| Factory Method          | Creational |
| Prototype               | Creational |
| Singleton               | Creational |
| **Structural Patterns** |            |
| Adapter                 | Structural |
| Bridge                  | Structural |
| Composite               | Structural |
| Decorator               | Structural |
| Facade                  | Structural |
| Flyweight               | Structural |
| Proxy                   | Structural |
| **Behavioral Patterns** |            |
| Chain of Responsibility | Behavioral |
| Command                 | Behavioral |
| Interpreter             | Behavioral |
| Iterator                | Behavioral |
| Mediator                | Behavioral |
| Memento                 | Behavioral |
| Observer                | Behavioral |
| State                   | Behavioral |
| Strategy                | Behavioral |
| Template Method         | Behavioral |
| Visitor                 | Behavioral |

---

## Contributing

Contributions are highly welcome\! If you have ideas for improvements, new pattern implementations, or find any bugs, feel free to open an [issue](https://github.com/asergioscosta/java-design-patterns-gof/issues) or submit a [pull request](https://github.com/asergioscosta/java-design-patterns-gof/pulls).

---

## License

This project is licensed under the MIT License. See the [LICENSE](https://github.com/asergioscosta/java-design-patterns-gof/blob/main/LICENSE) file for more details.

---

## Author

**Augusto Sérgio** - *Creator and Maintainer*

[![Avatar GitHub](https://avatars.githubusercontent.com/u/102989796?v=4&s=150)](https://github.com/asergioscosta)<br>
[GitHub Profile](https://github.com/asergioscosta) | [LinkedIn](https://linkedin.com/in/asergioscosta)