    package lv.rvt;

    import java.util.Scanner;;

    public class App {
        public class Main {
            public static void main(String[] args) {
                Statistics Statistics = new Statistics();
                Scanner scanner = new Scanner(System.in);

                Statistics.addNumber(3);
                Statistics.addNumber(5);
                Statistics.addNumber(1);
                Statistics.addNumber(2);
                Statistics.getCount();
                Statistics.summ();
                Statistics.average();
                
                while (true){
                    int num = scanner.nextInt();

                    if (num == -1){
                        break;
                    }
                    
                    
                }
            }
        }
    }

