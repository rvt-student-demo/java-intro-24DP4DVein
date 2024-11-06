package lv.rvt;

import java.util.Scanner;

public class App 
{
    public class Main 
    {
        public static void main(String[] args) 
        {
            String name = "";
            String names[] = new String[4];
            Scanner reader = new Scanner(System.in);

                while (true) {
                int i = 0;
                String input = reader.nextLine();
                names[i] = input;
                i = i++;
                
                if (input.equals("")) {
                    break;
                }

                for(int j = 0; i > 4; j++)
                {
                    if (name < names[i])
                    {
                        name = names[i];
                    }
                }
                String[] pieces = input.split(",");
                System.out.println("Name: " + pieces[0] + ", age: " + pieces[1]);
            }
        }
    }
}

