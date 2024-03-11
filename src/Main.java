import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AxisSystem axisSystem = new AxisSystem();
        //axis100150(axisSystem);
        //axis200(axisSystem);
        //multipleAxis(axisSystem);
        //giveAxis(axisSystem);
        //chooseAxisParameters(axisSystem);
        //getLine(axisSystem);
        //createLine(axisSystem);
    }

    public static void axis100150(AxisSystem board) {
        board.addSinglePoint(100, 150, "Blue");
    }

    public static void axis200(AxisSystem board) {
        board.addSinglePoint(200, -200, "Black");
    }

    public static void multipleAxis(AxisSystem board) {
        int axisArray[] = {50, 50, 60, 60, 70, 70};
        board.addMultiplePoints(axisArray, "Green");
    }

    public static void giveAxis(AxisSystem board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a X coordinate");
        int x = scanner.nextInt();
        System.out.println("Please enter a Y coordinate");
        int y = scanner.nextInt();
        board.addSinglePoint(x, y, "Yellow");
    }
    public static void chooseAxisParameters (AxisSystem board){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please enter the color you would like to use!");
        String color = scanner.nextLine();
        System.out.println("Please enter the amount of X parameters and Y parameters");

        int amountOfArrays = scanner.nextInt();
        while (amountOfArrays % 2 == 1) {
            int newAmount = scanner.nextInt();
            amountOfArrays = newAmount;
        }
        int[] axis = new int[amountOfArrays];
        for (int i = 0; i < axis.length; i++){
            int randomNum = random.nextInt(-250,250);
            axis[i] = randomNum;
        }
        board.addMultiplePoints(axis, color);
    }
    public static void getLine (AxisSystem board){
        System.out.println("You function is y= 2x+100");
        int[] array = new int[250];
        int x = 50;
        int y = 100;
        int counter = 0;
        while (counter < array.length){
            board.addSinglePoint(x++,y++,"Green");
            counter++;
        }
    }
    public static void createLine (AxisSystem board){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x parameter");
        int x = scanner.nextInt();
        System.out.println("Please enter free number parameter");
        int num = scanner.nextInt();
        x = num / x;
        int y = num;
        int counter = 250;
        for (int i = -250; i < counter; i++){
            board.addSinglePoint(x++, y++,"Black");
        }
    }
}
