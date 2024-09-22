
# Password Validation System

This Java project implements a simple password validation system. The system checks if a password meets specific requirements such as length and the inclusion of digits. It throws a custom exception (`WeakPasswordException`) when the password does not meet the defined criteria.

## Features

- **Custom Exception Handling**: The `WeakPasswordException` class is used to handle weak password cases.
- **Password Validation**: The password must be exactly 10 characters long and contain at least 2 digits.
- **Interactive Input**: Users are prompted to enter a password and the system checks if it meets the criteria. The process repeats until a valid password is entered.

## Project Structure

- `WeakPasswordException`: Custom exception class for handling weak password cases.
- `Password`: Contains the logic for validating passwords, including length and digit checks.
- `Main`: Entry point of the program.

## Requirements

- Java 8 or higher
- Basic knowledge of Java exception handling

## Usage

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/password-validation-system.git
    ```

2. Navigate to the project directory:
    ```bash
    cd password-validation-system
    ```

3. Compile the Java files:
    ```bash
    javac WeakPasswordException.java Password.java Main.java
    ```

4. Run the program:
    ```bash
    java Main
    ```

5. The program will prompt you to enter a password:
    ```
    Enter your Password:
    ```
    - The password must be exactly 10 characters long.
    - The password must contain at least 2 digits.

6. If the password is weak, a `WeakPasswordException` will be thrown with an appropriate message:
    ```
    WeakPasswordException: Password must be 10 characters.
    WeakPasswordException: Password must include 2 numbers.
    ```

7. Once a valid password is entered, the program will confirm:
    ```
    Your Password is valid: <your_password>
    ```

## Example

```
Enter your Password:
abcde123
WeakPasswordException: Password must be 10 characters.

Enter your Password:
abcdef12345
WeakPasswordException: Password must include 2 numbers.

Enter your Password:
abcdef1234
Your Password is valid: abcdef1234
```

## License

This project is licensed under the MIT License.

## Contributions

Feel free to submit pull requests or report issues. All contributions are welcome!
