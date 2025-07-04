# Java Design Patterns

![Project Status](https://img.shields.io/badge/Status-Active-blue.svg)
[![MIT License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
![Java Version](https://img.shields.io/badge/Java-17+-orange.svg?logo=java)

## 🎯 Objective

This repository provides **practical implementations and examples of the Gang of Four (GoF) Design Patterns in Java**. The goal is to offer a comprehensive resource for developers to understand, learn, and apply these fundamental software engineering principles. Each pattern is presented with **UML diagrams**.

## 🗂️ Project Structure

The project is organized to facilitate easy navigation and understanding of each design pattern.

```plaintext
📂 java-design-patterns-gof/
├── 📂 .idea/
├── 📂 docs/
│   └── 📂 diagrams/      # Contains UML diagrams (PDFs) for each design pattern category and specific pattern
│       ├── 📂 behavioral/    # Behavioral Patterns: Models describing how objects interact and distribute responsibilities flexibly.
│       ├── 📂 creational/    # Creational Patterns: Deal with object creation mechanisms for suitable object instantiation.
│       └── 📂 structural/    # Structural Patterns: Explain how to assemble objects and classes into larger structures efficiently.
├── 📂 src/
│   ├── 📂 main/
│   │   └── 📂 java/
│   │       └── 📂 org/
│   │           └── 📂 example/
│   │               └── 📂 patterns/  # Root package for all design pattern implementations
│   │                   ├── 📂 behavioral/    # Implementations of Behavioral Design Patterns
│   │                   │   ├── chainofresponsability/ # Implementation of the Chain of Responsibility pattern
│   │                   │   ├── command/ # Implementation of the Command pattern
│   │                   │   ├── interpreter/ # Implementation of the Interpreter pattern
│   │                   │   ├── iterator/ # Implementation of the Iterator pattern
│   │                   │   ├── mediator/ # Implementation of the Mediator pattern
│   │                   │   ├── memento/ # Implementation of the Memento pattern
│   │                   │   ├── observer/ # Implementation of the Observer pattern
│   │                   │   ├── state/ # Implementation of the State pattern
│   │                   │   ├── strategy/ # Implementation of the Strategy pattern
│   │                   │   ├── templatemethod/ # Implementation of the Template Method pattern
│   │                   │   └── visitor/ # Implementation of the Visitor pattern
│   │                   ├── 📂 creational/    # Implementations of Creational Design Patterns
│   │                   │   ├── abstractfactory/ # Implementation of the Abstract Factory pattern
│   │                   │   ├── builder/ # Implementation of the Builder pattern
│   │                   │   ├── factorymethod/ # Implementation of the Factory Method pattern
│   │                   │   ├── prototype/ # Implementation of the Prototype pattern
│   │                   │   └── singleton/ # Implementation of the Singleton pattern
│   │                   └── 📂 structural/    # Implementations of Structural Design Patterns
│   │                       ├── adapter/ # Implementation of the Adapter pattern
│   │                       ├── bridge/ # Implementation of the Bridge pattern
│   │                       ├── composite/ # Implementation of the Composite pattern
│   │                       ├── decorator/ # Implementation of the Decorator pattern
│   │                       ├── facade/ # Implementation of the Facade pattern
│   │                       ├── flyweight/ # Implementation of the Flyweight pattern
│   │                       └── proxy/ # Implementation of the Proxy pattern
│   │               Main.java
│   └── 📂 test/
│       └── 📂 java/
│           └── 📂 org/
│               └── 📂 example/
│                   └── 📂 patterns/ # Unit tests for design pattern implementations
│                       ├── 📂 behavioral/    # Unit tests for Behavioral Design Patterns
│                       ├── 📂 creational/    # Unit tests for Creational Design Patterns
│                       └── 📂 structural/    # Unit tests for Structural Design Patterns
````

## 📚 Design Patterns Overview

This section provides a brief overview of each GoF Design Pattern implemented in this repository.

| Pattern Name          | Category    |
| :-------------------- | :---------- |
| **Creational Patterns** |             |
| Abstract Factory      | Creational  |
| Builder               | Creational  |
| Factory Method        | Creational  |
| Prototype             | Creational  |
| Singleton             | Creational  |
| **Structural Patterns** |             |
| Adapter               | Structural  |
| Bridge                | Structural  |
| Composite             | Structural  |
| Decorator             | Structural  |
| Facade                | Structural  |
| Flyweight             | Structural  |
| Proxy                 | Structural  |
| **Behavioral Patterns** |             |
| Chain of Responsibility | Behavioral  |
| Command               | Behavioral  |
| Interpreter           | Behavioral  |
| Iterator              | Behavioral  |
| Mediator              | Behavioral  |
| Memento               | Behavioral  |
| Observer              | Behavioral  |
| State                 | Behavioral  |
| Strategy              | Behavioral  |
| Template Method       | Behavioral  |
| Visitor               | Behavioral  |

## 🛠️ Technologies Used

[![Java](https://img.shields.io/badge/Java-17+-orange?logo=java&logoColor=white)](https://www.java.com/)
[![Maven](https://img.shields.io/badge/Apache_Maven-3.8+-%23C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![JUnit5](https://img.shields.io/badge/JUnit-5-%2325A162?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-2025.1-%23000000?logo=intellijidea&logoColor=white)](https://www.jetbrains.com/idea/)

## ✨ Key Features

  * **Comprehensive GoF Patterns:** Implementations for Creational, Structural, and Behavioral patterns, each with a clear explanation available in the `Design Patterns Overview` section.
  * **Clean Code Examples:** Focus on readability, maintainability, and adherence to modern Java coding standards.
  * **UML Diagrams:** Each pattern includes a corresponding UML diagram (in PDF format) for visual understanding, stored in the `docs/diagrams` folder.
  * **Practical Use Cases:** Examples are designed to illustrate how patterns solve common software design problems.
  * **Unit Tests:** Demonstrates how to test pattern implementations effectively.

## 🚀 How to Run the Project

### Prerequisites

Ensure you have the following tools installed:

* **Java Development Kit (JDK) 17+** (The project is developed with JDK 24, but is compatible with JDK 17 and newer versions.)
* **Apache Maven 3.8+**

### 1️⃣ Clone the repository

Open your terminal or command prompt and execute:

```bash
git clone https://github.com/asergioscosta/java-design-patterns-gof.git
```

### 2️⃣ Navigate to the project directory

Change your current directory to the root of the cloned project:

```bash
cd java-design-patterns-gof
```

### 3️⃣ Open in your IDE

After navigating to the project directory, you can open it in your favorite Java IDE:

  * **IntelliJ IDEA:** Go to `File > Open...` and select the `java-design-patterns-gof`. IntelliJ will automatically detect it as a Maven project.
  * **VS Code:** Go to `File > Open Folder...` and select the `java-design-patterns-gof`. Ensure you have the Java Extension Pack installed.

## 🤝 Contributions

Contributions are highly welcome\! If you have ideas for improvements, new pattern implementations, or find any bugs, feel free to open an [issue](https://github.com/asergioscosta/java-design-patterns-gof/issues) or submit a [pull request](https://github.com/asergioscosta/java-design-patterns-gof/pulls).

## 📄 License

This project is licensed under the MIT License. For more details, see the [LICENSE](https://github.com/asergioscosta/java-design-patterns-gof/blob/main/LICENSE) file in the root of this repository.

## 👨‍💻 Developer

[![Avatar GitHub](https://avatars.githubusercontent.com/u/102989796?v=4&s=150)](https://github.com/asergioscosta)