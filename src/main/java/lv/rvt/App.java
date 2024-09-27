package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mark: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
             
        if (firstNum == 0) {
            System.out.println("imsposible!");
        } else if (firstNum <= 49) {
            System.out.println("fail");
        } else if (firstNum <= 59){
            System.out.println("1");
        } else if (firstNum <= 69){
            System.out.println("2");
        } else if (firstNum <= 79){
            System.out.println("3");
        } else if (firstNum <= 89){
            System.out.println("3");
        } else if (firstNum <= 99){
            System.out.println("4");
        } else {
            System.out.println("incredible!");
        }
    }
}