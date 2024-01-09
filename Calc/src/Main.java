import add.AddOperation;
import div.DivisionOperation;
import mult.MultiplicationOperation;
import subs.SubstractionOperation;

import java.util.Scanner;

/**
 * @author Alonso Escamilla
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddOperation addOperation = new AddOperation();
        DivisionOperation divisionOperation = new DivisionOperation();
        SubstractionOperation substractionOperation = new SubstractionOperation();
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation();

        Integer option;
        System.out.println("Simple calc");
        System.out.println("Choose which operation you want:");
        System.out.println("1 | Addition");
        System.out.println("2 | Division");
        System.out.println("3 | Substraction");
        System.out.println("4 | Multiplication");
        option = sc.nextInt();
        switch (option){
            case (1):
                System.out.println("Addition operaton");
                System.out.println("Here we can do the addition of two numbers without decimals");
                System.out.println("Insert first number : ");
                Integer x = sc.nextInt();
                System.out.println("Insert second number : ");
                Integer y = sc.nextInt();
                System.out.println(x + " + " + y + " = " + addOperation.calc(x,y));
                break;
            case (2):
                System.out.println("Division operaton");
                System.out.println("Here we can do a division between two numbers, we can put them  with decimals");
                System.out.println("Insert first number : ");
                Float number1 = sc.nextFloat();
                System.out.println("Insert second number : ");
                Float number2 = sc.nextFloat();
                System.out.println(number1 + " / " + number2 + " = : " + divisionOperation.calc(number1,number2));
                break;
            case (3):
                System.out.println("Substraction operaton");
                System.out.println("Here we can do the substraction of two numbers without decimals");
                System.out.println("Insert first number : ");
                x = sc.nextInt();
                System.out.println("Insert second number : ");
                y = sc.nextInt();
                System.out.println(x + " - " + y + " = " + substractionOperation.calc(x,y));
                break;
            case (4):
                System.out.println("Multiplication operaton");
                System.out.println("Here we can do the multiplication of two numbers without decimals");
                System.out.println("Insert first number : ");
                x = sc.nextInt();
                System.out.println("Insert second number : ");
                y = sc.nextInt();
                System.out.println(x + " * " + y + " = : " + multiplicationOperation.calc(x,y));
                break;
            default:
                System.out.println("You must choose one of the options.");
                break;
        }

    }
}
