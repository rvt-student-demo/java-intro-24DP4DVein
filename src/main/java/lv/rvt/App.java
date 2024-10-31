package lv.rvt;

public class App 
{
    public class Main {
        public static void main(String[] args) {
          
            int[] mas = new int[3];

            mas[0] = 10;
            mas[1] = 113;
            mas[2] = 123;

            int sum = 0;
            for (int i = 0; i < mas.length; i++){
                System.out.println(mas[i]);
                sum = sum + mas[i];
            }
            System.out.println("Sum: " + sum);

            int[] val = {13, -4, 82, 17};
            int[] twice = new int[4];

            System.out.println();
            System.out.println();
            System.out.println("Orig. mas.: " + " " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

            for (int i = 0; i < val.length; i++){
                twice[i] = val[i] * 2;
            }
            System.out.println("Second mas. : " + " " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);

        }
    }
}

