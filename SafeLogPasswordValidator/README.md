SafeLog Password Validator (Core Java)

Project Description

The  SafeLog Password Validator is a Core Java mini project developed to enforce strong password policies for an employee portal.
It validates user passwords based on corporate security requirements and provides clear feedback for invalid inputs.
 Features

* ✅ Minimum 8 characters validation
* ✅ Checks for at least one uppercase letter
* ✅ Checks for at least one digit (0–9)
* ✅ User-friendly feedback messages
* ✅ Retry mechanism until valid password is entered

Technologies Used

* Java (Core Java)
* VS Code
* Command Line (Terminal)

 Project Structure

```
SafeLogPasswordValidator/
│
├── PasswordValidator.java
└── README.md
```

 How to Run the Project

 Step 1: Compile

```
javac PasswordValidator.java
```
 Step 2: Run

```
java PasswordValidator
```

 Sample Output

```
Enter your password: hello
Password is too short. Minimum 8 characters required.
Please try again.

Enter your password: HelloWorld
Password must contain at least one digit.
Please try again.

Enter your password: Hello123
Password is valid and accepted.
```

 Concepts Used

* String Handling
* Loops (for loop, while loop)
* Conditional Statements (if-else)
* Methods (Modular Programming)
* Character Class Methods

 Future Enhancements

* Add special character validation
* GUI version using Java Swing
* Store password securely using hashing

 Author

Kavibharathi M

