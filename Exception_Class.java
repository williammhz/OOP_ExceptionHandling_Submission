package Ex;
/**
 * This assignement was done by William MUHIZI - 25981.
 * In this Java file we have Java programs that simulates specific exceptions, 
 * demonstrate how they occur, and handle them appropriately using try-catch blocks.
 */

import java.io.*;

public class Exception_Class {
    public static void main(String[] args) {
        simulateIOException();
        simulateFileNotFoundException();
        simulateEOFException();
        simulateSQLException();
        simulateClassNotFoundException();
        simulateArithmeticException();
        simulateNullPointerException();
        simulateArrayIndexOutOfBoundsException();
        simulateClassCastException();
        simulateIllegalArgumentException();
        simulateNumberFormatException();
    }

    // 1. Simulate IOException
    public static void simulateIOException() {
        try (BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"))) {
            reader.readLine();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // 2. Simulate FileNotFoundException
    public static void simulateFileNotFoundException() {
        try {
            FileInputStream fis = new FileInputStream("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }

    // 3. Simulate EOFException
    public static void simulateEOFException() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("emptyfile.dat"))) {
            while (true) {
                dis.readUTF();
            }
        } catch (EOFException e) {
            System.out.println("EOFException caught: Reached the end of the file unexpectedly.");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // 4. Simulate SQLException
    public static void simulateSQLException() {
        try {
            // Simulating a database connection attempt without using java.sql directly
            throw new RuntimeException("Simulated database error.");
        } catch (RuntimeException e) {
            System.out.println("SQLException simulation: " + e.getMessage());
        }
    }

    // 5. Simulate ClassNotFoundException
    public static void simulateClassNotFoundException() {
        try {
            Class.forName("non.existent.Class");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }

    // 6. Simulate ArithmeticException
    public static void simulateArithmeticException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    // 7. Simulate NullPointerException
    public static void simulateNullPointerException() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    // 8. Simulate ArrayIndexOutOfBoundsException
    public static void simulateArrayIndexOutOfBoundsException() {
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    // 9. Simulate ClassCastException
    public static void simulateClassCastException() {
        try {
            Object obj = new Integer(42);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }

    // 10. Simulate IllegalArgumentException
    public static void simulateIllegalArgumentException() {
        try {
            Thread thread = new Thread();
            thread.setPriority(15); // Invalid priority
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }

    // 11. Simulate NumberFormatException
    public static void simulateNumberFormatException() {
        try {
            int num = Integer.parseInt("invalidNumber");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}

