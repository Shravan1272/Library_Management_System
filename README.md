📚 LibTrack :
A Console-Based Library Management System
💡 Overview
LibTrack is a console-based Library Management System developed in Core Java. It follows Object-Oriented Programming (OOP) principles to manage books and library members efficiently. This project is designed for academic purposes and helps reinforce key OOP concepts like inheritance, polymorphism, abstraction, and more.

🔧 Features
➕ Add Books and Members (Students or Faculty)

📕 Issue Books to Registered Members

📚 View All Books and Members

🔍 Search Book by Title and Member by Name

✅ Prevents issuing if a book is already issued or member exceeds book limit

🛠️ Technologies Used
✅ Java (Core Concepts)

✅ OOP Principles

✅ Console Input/Output

| Concept               | How It's Used                                                                                  |
| --------------------- | ---------------------------------------------------------------------------------------------- |
| **Classes & Objects** | `Book`, `Member`, `Student`, `Faculty`, and `Library` are modeled as Java classes.             |
| **Inheritance**       | `Student` and `Faculty` inherit from abstract class `Member`.                                  |
| **Abstraction**       | `Member` is declared as an abstract class to enforce common behavior.                          |
| **Polymorphism**      | Members are handled generically using the `Member` reference for both `Student` and `Faculty`. |
| **Method Overriding** | Subclasses override the `toString()` method for meaningful display.                            |
| **Encapsulation**     | Private fields with public getters/setters ensure data protection.                             |                                     |
| **this & super**      | Used to refer to current object and parent class members.                                      |
