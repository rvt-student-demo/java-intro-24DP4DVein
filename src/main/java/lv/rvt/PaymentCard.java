package lv.rvt;

public class PaymentCard {
    
    private double balance;

    public PaymentCard(double openingBalance) {
      
      this.balance = openingBalance;  
        
    }

    @Override
    public String toString(){
        return "Tvoj balanc v MMM: " + balance;
        
    }

    public void eatAffordably() {
    if(balance < 4.6)
        System.out.println("Idi rabotaj dolbojeb");
    else     
        balance = balance - 2.60;
    }
    
    public void eatHeartily() {
        if(balance < 4.6)
        System.out.println("Idi rabotaj dolbojeb");
    else     
        balance = balance - 4.60;
    }

    public void addMoney(double add_money){
    if(add_money < 0)
        System.out.println("Eblan snimat dengi nelza, my chto bankomat chtoli");  
    else  
        if(balance + add_money > 149)
            balance =  150; 
        else
            balance = balance + add_money;
        
    }
}
