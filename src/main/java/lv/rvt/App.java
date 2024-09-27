package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Speed: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        if (firstNum > 120) {
            System.out.println("Speeding ticket!");
        }
        


    }
}
