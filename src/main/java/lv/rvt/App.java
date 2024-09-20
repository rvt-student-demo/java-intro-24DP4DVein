package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Frist number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());

        int sum = firstNum + secondNum;
        int minus = firstNum - secondNum;
        int reiz = firstNum * secondNum;
        double dal = firstNum / secondNum;
        
        System.out.println(firstNum + "+" + secondNum + "=" + sum);
        System.out.println(firstNum + "-" + secondNum + "=" + minus);
        System.out.println(firstNum + "*" + secondNum + "=" + reiz);
        System.out.println(firstNum + "/" + secondNum + "=" + dal);


    }
}
