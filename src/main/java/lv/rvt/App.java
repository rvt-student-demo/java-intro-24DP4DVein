package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        int sum = 0;
        int sk = 0;
        while(true){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Give a number: ");

            int Num = Integer.valueOf(scanner.nextLine());

            if (Num == 0) {
                System.out.println("Number of numbers:"+ sk);
                System.out.println("Sum of the numbers:"+ sum);
                break;
            } else {
                sk = sk + 1;
                sum = sum + Num;
            }
        }
    }
}
