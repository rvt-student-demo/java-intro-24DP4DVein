    package lv.rvt;


    public class App {
        public class Main {
            public static void main(String[] args) {

                //CARD BALANCE
                PaymentCard card = new PaymentCard(10);
                System.out.println("Paul: " + card);
                card.addMoney(-15);
                System.out.println("Paul: " + card);
                

        }
    }
}

