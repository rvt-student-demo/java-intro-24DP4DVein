package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gift: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
             
        if (firstNum < 5000){
            System.out.println("Nothing");
        } else if (firstNum < 25000){
            System.out.println(100+(firstNum-5000)*0.08);
        } else if (firstNum < 55000){
            System.out.println(1700+(firstNum-25000)*0.10);
        } else if (firstNum < 200000){
            System.out.println(4700+(firstNum-55000)*0.12);
        } else if (firstNum < 1000000){
            System.out.println(22000+(firstNum-55000)*0.15);    
        } else {
            System.out.println(142100+(firstNum-1000000)*0.17);
        }

    }
}
