# Java Questions:

### 1. Name some OOP concepts:
- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

### 2. Java 8 Release date?
- Java 8 has been released March 2014
- Biggest release after annotations and generics

### 3. Java 8 changes :
- Interface changes with default and static methods.
- Functional interfaces and Lambda Expressions
- Java stream API for collections
- Java Date Time API.

### 4. What for are default methods ?
- Help extending interfaces without fear of breaking their implementations
- Has bridge down between interfaces and abstract classes
- Interface default methods help us avoid utility classes.
- Interf def. methods help us removing base implementation classes.
- Main reason for introducing them to enhance Collections API.

## Static interface methods:
- Static methods cannot be overriden in implementation classes.
- Help us in avoiding undesired results in case of poor implementation in impl classes.
- Static method is a part of interface, we can't use it for implementation class objects.
- Static method are good for providing utility methods such as null check, collection sorting.
- Static methods provide security by not allowing imp. classes to override them

## Functional Interface:
- An interface with exactly one abstract method is known as Functional Interface.