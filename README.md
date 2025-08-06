# 📚 LibTrack  
*A Console-Based Library Management System*

---

## 💡 Overview

**LibTrack** is a **console-based Library Management System** developed using **Core Java**.  
It follows fundamental **Object-Oriented Programming (OOP)** principles to manage books and members efficiently.  

This academic project strengthens understanding of key OOP concepts like **inheritance**, **polymorphism**, **abstraction**, **encapsulation**, and more.

---

## 🔧 Features

- ➕ Add Books and Members (Students or Faculty)
- 📕 Issue Books to Registered Members
- 📚 View All Books and Members
- 🔍 Search Book by Title and Member by Name
- ✅ Prevent issuing if the book is already issued or if the member exceeds book limit

---

## 🛠️ Technologies Used

- ✅ Core **Java**
- ✅ **OOP Principles**
- ✅ **Console Input/Output**

---

## 🧠 OOP Concepts Used

| Concept               | How It's Used                                                                                  |
|-----------------------|-----------------------------------------------------------------------------------------------|
| **Classes & Objects** | `Book`, `Member`, `Student`, `Faculty`, and `Library` are modeled as Java classes.            |
| **Inheritance**       | `Student` and `Faculty` inherit from abstract class `Member`.                                 |
| **Abstraction**       | `Member` is declared as an abstract class to enforce common behavior.                         |
| **Polymorphism**      | Members are handled generically using the `Member` reference for both `Student` and `Faculty`.|
| **Method Overriding** | Subclasses override the `toString()` method for meaningful display.                           |
| **Encapsulation**     | Private fields with public getters/setters ensure data protection.                            |
| **this & super**      | Used to refer to the current object and parent class members.                                 |

---

## 📁 Project Structure
LibTrack/
│
├── Book.java           // Represents a book with ID, title, and availability status
│
├── Member.java         // Abstract class representing a general library member
│                       // Contains shared fields and methods for Student and Faculty
│
├── Student.java        // Inherits from Member
│                       // Represents a student member (can issue up to 2 books)
│
├── Faculty.java        // Inherits from Member
│                       // Represents a faculty member (can issue up to 5 books)
│
├── Library.java        // Core class managing books and members
│                       // Handles add/search/issue logic and maintains lists
│
└── LibraryApp.java     // Console-based main class
                        // Provides the interactive menu and calls Library methods
