# NEU Library Borrowing System

### Problem Statement

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers. Currently, the **Student** object has methods like **borrowBook()**, **borrowJournal()** with a parameter of title, which directly depend on specific resource types.

To adhere to the **Dependency Inversion Principle (DIP)** and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

### UML Class Diagram

<!-- Insert your UML diagram here -->

### Solution Description

The solution implements the Dependency Inversion Principle by:

1. Creating an abstraction (interface) called `LibraryResource` that different resource types implement
2. Refactoring the `Student` class to depend on abstractions rather than concrete implementations
3. Using the Strategy Pattern to handle different types of resources
4. Ensuring all SOLID principles are maintained:
   - **Single Responsibility Principle**: Each class has a single responsibility
   - **Open/Closed Principle**: The system is open for extension but closed for modification
   - **Liskov Substitution Principle**: All resource types can be used interchangeably
   - **Interface Segregation Principle**: Interfaces are specific to clients' needs
   - **Dependency Inversion Principle**: High-level modules depend on abstractions, not concrete implementations

### How to Run💨🏃‍♀️‍➡️

To test the implementation, run the `TestProgram` class:

```
javac TestProgram.java
java TestProgram
```

### File Sturcture

```
├── TestProgram.java
└── library/
    ├── LibraryResource.java
    ├── Library.java
    ├── LibraryFacade.java
    ├── Student.java
    └── resources/
        ├── Book.java
        ├── Journal.java
        ├── Thesis.java
        ├── Newspaper.java
        └── AudioBook.java
```

<!-- ## Future Extensions

The system is designed to easily accommodate new resource types:
- Simply create a new class implementing the `LibraryResource` interface
- No changes are needed to the `Student` class or other existing code -->