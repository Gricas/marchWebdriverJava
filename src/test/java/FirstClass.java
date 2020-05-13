import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

public class FirstClass {

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
        String messageOne = new String("Who let the dogs out?  ");

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

        } if ( result = 3 < a && a < 6 ){

        System.out.println("    result is true  , is the idea! ");

        }

    }

    @Test
    public void test00007() {
        int[] arrayOfIntegers = {1, 9, 9, 5};

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int currentElement = arrayOfIntegers[i];
            System.out.println(currentElement);
            }
    }
}