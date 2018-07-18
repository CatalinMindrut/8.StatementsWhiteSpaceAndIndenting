package com.Catalin;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        /** "myVariable = 50" is an expression and the entire line, including the data type and semicolon is a STATEMENT.
         * The above example is an assignment statement, we are assigning the value 50 to the myVariable variable.
         * Other statement examples:
         */
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        /** A semicolon is needed to complete a statement but there are exceptions to this rule.
         * Statements do not need to be only on one line.
         */
        System.out.println("This is" +
                            "another" +
                            "still more.");
        /** It is often a good idea to break up code so it is easier to read. Java does not care if the code is on one
         * line or multiple lines, provided that you do not try to end the line with a semicolon.
         */
        int anotherVariable = 50;myVariable--;System.out.println("On one line");
        /**You can also have multiple statements on one line but this is confusing and the code is harder to read.
         */

        /** White space is the space in-between operators, expressions, etc.
         */
        int    whiteSpace
                =
        50
                ;
        /** Java will delete the spaces internally so the above statement will be interpreted as "int whiteSpace=50;
         * Again, using spaces will improve the readability of your code.
         */

int mySecondVariable = 50;
mySecondVariable++;
mySecondVariable--;
System.out.println("Indentation example");
System.out.println("This is" +
"another" +
"still more");

/** Not using indentation will, again, make your code harder to read.
 * Indenting will make it more readable and things start to stick out a little more.
 * IntelliJ will automatically indent code lines.
 * If you mess up the code indenting you can use an IntelliJ option: Code>Reformat Code...
 */
    }
}
