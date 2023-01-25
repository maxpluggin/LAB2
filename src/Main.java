import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("int array width: ");
        int arrayWidth = scan.nextInt();
        System.out.print("int array height: ");
        int arrayHeight = scan.nextInt();
        myArray(arrayWidth,arrayHeight);


        System.out.print("int i = ");
        int height = scan.nextInt();
        pyramid(height);



        scan.close();
    }
    public static void pyramid (int pyramidHeight){
        for(int i=0; i<pyramidHeight; i++){
            for(int j = 0; j<i;j++) {
                System.out.print("*");        }
            System.out.println();    }
    }

    public static void myArray (int arrayWidth, int arrayHeight) {
        int x = 0;
        int[][] myArray = new int[arrayHeight][arrayWidth];
        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                x = x + 3;
                myArray[i][j] = x;
                System.out.printf("%4d" + " ", myArray[i][j]);
            }
            System.out.println();
        }
    }

}
