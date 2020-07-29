import org.testng.Assert;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
public class FirstClass {
    private char[] charArray;
    @Test
    public void test00001() {
        System.out.println("Hello World");
    }
    @Test
    public void test00002() {
        int myNumber = 5;
        System.out.println(myNumber);
    }
    @Test
    public void test00003() {
        String messageOne = "Who let the dogs out?  ";
        String messageTwo = "Who who who who!";
        String messageFour = "The Big Bad Wolf!";
        String messageThree = messageOne + messageTwo + messageFour;
        System.out.println(messageThree);
    }
    @Test
    public void test00004() {
        int num = 5;
        String message = "I have " + num + " cookies";
        System.out.println(message);
    }
    @Test
    public void test00005() {
        boolean b = true;

        boolean toBe = true;

        b = toBe || !toBe;

        if (b) {
            System.out.println(toBe);
        }
        int children = 0;
        b = true;

        System.out.println("It is true!");
    }
    @Test
    public void test00006() {
        int a = 4;
        int b = 8;
        boolean result;

        if (a == 4) {
            System.out.println("Ohhh! So a is 4!");
        } else {
            System.out.printf("Ohh! this is  not 4!");
        }
        if (result = 3 < a && a < 6) {
            System.out.println("    result is true  ! ");
        }
    }
    public void printAllMembersOfArray(int[] arrayParameter) {
        for (int i = 0; i < arrayParameter.length; i++) {
            int currentElement = arrayParameter[i];
            System.out.println(currentElement);
        }
    }
    public void printAllMembersOfArrayE(int[] arrayParameter) {
        for (int eachMember : arrayParameter) {
            System.out.println(eachMember);
        }
    }
    @Test
    public void test00007() {
        int[] input = {1, 9, 9, 5};
        printAllMembersOfArrayE(input);
    }
    @Test
    public void testPrintEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
    @Test
    public void printHelloAtEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println("hello world");
        }
    }
    //Swap two numbers in an array
    //1. create an input
    //2. create a method with int[] parameter
    //3. new method will also take indexes of L and R elements
    //4. use indexes R and L and respective elements will be swapped with each other
    //5. print out final version of the array
    @Test
    public void test_swapNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int indexL = 0;
        int indexR = 1;

        swap(input, indexL, indexR);
        printAllMembersOfArray(input);
    }
    @Test
    public void test_swap_Exception() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int indexL = 0;
        int indexR = 1;


        checkInputs(input, indexL, indexR);
        checkInputArray(input);
        check(input);
        swap(input, indexL, indexR);
        printAllMembersOfArray(input);
    }
    //TODO: add checks for input array.
    private void checkInputs(int[] input, int indexL, int indexR) {
        if (indexL >= 0 && indexL < input.length && indexR >= 0 && indexR < input.length) {
            System.out.println("INputs are OK");
        } else {
            throw new AssertionError("Inputs are NOT OK: indexL=" + indexL + ", indexR=" + indexR);
        }
    }

    private void swap(int[] input, int indexL, int indexR) {
        int temporaryElement = 0;
        temporaryElement = input[indexL];
        input[indexL] = input[indexR];
        input[indexR] = temporaryElement;
    }
    private void checkInputArray(int[] input) {
        int toFind = 7;
        boolean found = false;

        for (int n : input) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(toFind + " is found.");
        else System.out.println(toFind + " is not found.");
    }

    private void check(int[] input) {
        int toCheckValue = 7;
        int res = Arrays.binarySearch(input, toCheckValue);
        System.out.println("Array: " + Arrays.toString(input));

        boolean test = res > 0;
        System.out.println("Is " + toCheckValue + " present in the array: " + test);
    }

    //TODO: break down into sub-steps (external methods), 'letter' should be a parameter as well
    //
    @Test
    public void testCountLetters() {
        String input = "hello world";
        int result = 0;
        char[] charArray = input.toCharArray();
        char letterParameter = 'l';

        checkLetter(charArray);

        for (char eachChar : charArray) {
            if (eachChar == 'l') result++;
        }
        System.out.println("In inputArray, letter 'l' is identified " + result + " times");
    }

    @Test
    public void testActorCreation() {
        Actor actor01 = new Actor(30, "Ivan", "Ivanov", 186, 80);
        int actor01Age = actor01.getAge();

        System.out.println(actor01Age);

        Assert.assertEquals(actor01Age, 30);
    }

    private void checkLetter(char[] charArray) {
        for ( int i = 0; i < charArray.length; i++) {
            int element = charArray[i];
            System.out.println(element);
        }


    }
}


