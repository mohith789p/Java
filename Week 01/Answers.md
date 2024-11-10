# Exercise – 1:

> **a)** Write a JAVA program to display default value of all primitive data type of JAVA.

## Code

```java
public class DataTypes {
	static byte data_byte;
	static short data_short;
	static int data_int;
	static float data_float;
	static double data_double;
	static long data_long;
	static boolean data_boolean;
	static char data_char;

	public static void main(String[] args) {

		System.out.println("byte: " + data_byte);
		System.out.println("short: " + data_short);
		System.out.println("int: " + data_int);
		System.out.println("float: " + data_float);
		System.out.println("double: " + data_double);
		System.out.println("long: " + data_long);
		System.out.println("boolean: " + data_boolean);
		System.out.println("char: " + data_char);
	}
}

```

## Output

```
byte: 0
short: 0
int: 0
float: 0.0
double: 0.0
long: 0
boolean: false
char:
```

> **b)** Write a java program that display the roots of a quadratic equation ax2+bx=0. Calculate the discriminate D and basing on value of D, describe the nature of root.

## Code

```java
import java.util.Scanner;

public class QuadraticRoots2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // equation is ax2 + bx = 0
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble();

        // Discriminant D = b*b - 4ac (here c = 0)
        double D = b * b;

        // Checking the nature of the roots
        if (D > 0) {
            // ax2 + bx = 0 => ( x = 0) or (ax + b = 0)
            double root1 = -b / a;
            double root2 = 0;
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (D == 0) {
            // repeated root
            double root = 0;
            System.out.println("Roots are real and equal.");
            System.out.println("Root: " + root);
        } else {
            // This case will not happen as D = b^2 (which is always >= 0)
            System.out.println("Error: Discriminant should not be negative.");
        }

        sc.close();
    }
}

```

## Output

```
Enter the coefficient a: 4
Enter the coefficient b: -7
Roots are real and distinct.
Root 1: 1.75
Root 2: 0.0
```
