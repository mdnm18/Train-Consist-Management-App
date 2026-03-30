# 🚆 Train Consist Management System

📌 Overview

This project demonstrates the step-by-step development of a Train Consist Management System using Java.
It focuses on building strong fundamentals in:
	•	Object-Oriented Programming (OOP)
	•	Java Collections Framework
	•	Real-world data modeling
	•	System design thinking

Each Use Case (UC1–UC7) introduces a new concept and builds upon the previous one.

⸻

🚀 System Evolution (UC1 → UC7)

⸻

🟢 UC1 – Application Initialization

Goal

Initialize the application and display the initial train state.

Key Concepts
	•	Class and main() method
	•	Static keyword
	•	ArrayList initialization
	•	Console output

Outcome
	•	Application starts
	•	Empty train consist created
	•	Initial bogie count displayed

⸻

🟡 UC2 – Dynamic Bogie Management (ArrayList)

Goal

Add and remove passenger bogies dynamically.

Key Concepts
	•	ArrayList
	•	add(), remove(), contains()
	•	CRUD operations
	•	Order preservation

Outcome
	•	Bogies added: Sleeper, AC Chair, First Class
	•	One bogie removed
	•	Final list displayed

⸻

🔵 UC3 – Unique Bogie IDs (HashSet)

Goal

Prevent duplicate bogie IDs.

Key Concepts
	•	HashSet
	•	Set interface
	•	Automatic deduplication
	•	Unordered storage

Outcome
	•	Duplicate bogies ignored automatically
	•	Only unique IDs retained

⸻

🟣 UC4 – Train Structure (LinkedList)

Goal

Model real-world train chaining behavior.

Key Concepts
	•	LinkedList
	•	Node-based structure
	•	addFirst(), addLast()
	•	removeFirst(), removeLast()

Outcome
	•	Bogies connected like a real train
	•	Efficient insertion/removal

⸻

🟠 UC5 – Ordered Uniqueness (LinkedHashSet)

Goal

Maintain insertion order while ensuring uniqueness.

Key Concepts
	•	LinkedHashSet
	•	Ordered Set
	•	Automatic duplicate prevention

Outcome
	•	No duplicate bogies
	•	Order preserved as inserted

⸻

🔴 UC6 – Bogie-Capacity Mapping (HashMap)

Goal

Associate bogies with seating/load capacity.

Key Concepts
	•	HashMap
	•	Key–value pairs
	•	put(), get()
	•	entrySet() iteration

Outcome
	•	Example:

Sleeper → 72
AC Chair → 60


	•	Fast lookup of capacity

⸻

⚫ UC7 – Sorting Bogies (Comparator)

Goal

Sort bogies based on capacity.

Key Concepts
	•	Custom class (Bogie)
	•	Comparator
	•	Lambda expressions
	•	sort() method

Outcome
	•	Bogies sorted in ascending order of capacity
	•	Separation of data and logic

⸻

🧠 Core Concepts Learned

✅ Java Collections
	•	ArrayList → dynamic list
	•	HashSet → uniqueness
	•	LinkedList → chaining
	•	LinkedHashSet → ordered uniqueness
	•	HashMap → key–value mapping

⸻

✅ Object-Oriented Programming
	•	Custom classes (Bogie)
	•	Encapsulation
	•	Separation of concerns

⸻

✅ Data Handling Patterns
	•	CRUD operations
	•	Validation using contains()
	•	Deduplication using Set
	•	Mapping using Map

⸻

✅ Algorithmic Thinking
	•	Sorting using Comparator
	•	Efficient insert/delete strategies
	•	Choosing the right data structure

⸻

🏗️ System Architecture (Conceptual)

User
 ↓
Train App (Main)
 ↓
Collections Layer
 ├── ArrayList (Bogies)
 ├── HashSet (Unique IDs)
 ├── LinkedList (Train Structure)
 ├── LinkedHashSet (Ordered Unique Bogies)
 └── HashMap (Capacity Mapping)
 ↓
Comparator (Sorting Logic)


⸻

🔑 Key Takeaways
	•	Different problems require different data structures
	•	Choosing the right collection improves efficiency and clarity
	•	Real-world systems combine multiple structures together
	•	Clean separation of logic leads to scalable design

⸻

🎯 What You Achieved

By completing UC1–UC7, you have:
	•	Built a modular train management system
	•	Learned core Java collections deeply
	•	Understood real-world data modeling
	•	Developed system design thinking

⸻

🚀 Future Enhancements
	•	Train route mapping (Station → Time using HashMap)
	•	Undo operations using Stack
	•	Train scheduling using Queue
	•	GUI or Web interface
	•	Database integration (MySQL / MongoDB)

⸻

👨‍💻 Author

Md Nayaj Mondal
B.Tech CSE Student
SRM Institute of Science and Technology
