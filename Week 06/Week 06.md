# Exercise - 6

> ## a) Write a JAVA program that describes exception handling mechanism.

## Code

```java
public class ArrayException {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("The number at index 4 is: " + numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception: " + e.getMessage());
        }
    }
}

```

## Output

```text
Exception: Index 4 out of bounds for length 3
```

> ## b) Write a JAVA program Illustrating Multiple catch clauses.

## Code

```java
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = { 10, 20, 30 };
            int result = numbers[8] / 0;
            System.out.println("The result is: " + result);

            System.out.println("The number at index 5 is: " + numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```

## Output

```text
Exception: Index 8 out of bounds for length 3
```

> ## c) Write a JAVA program for creation of Java Built-in Exceptions.

## Code

```java
public class BuiltInExceptions {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
```

## Output

```text
ArithmeticException caught: / by zero
```

> ## d) Write a JAVA program for creation of User Defined Exception.

## Code

```java
// Custom Exception Class
class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        int age = 10;
        try {
            if (age < 18) {
                // Throw custom exception
                throw new AgeException("Age is below 18, not eligible to vote.");
            } else {
                System.out.println("Eligible to vote.");
            }
        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}
```

## Output

```text
AgeException: Age is below 18, not eligible to vote.
```
