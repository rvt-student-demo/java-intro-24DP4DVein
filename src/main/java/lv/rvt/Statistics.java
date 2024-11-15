package lv.rvt;

public class Statistics {
    private int count;
    private int summ;
    private int summ1;
    public int number;
    public double average;
    public int personInput;

    public Statistics() {
        
        
    }
    public void addNumber(int number){
        count = count + 1;
        summ = summ + number;
    }

    public void getCount(){
        System.out.println("Count: " + count);
    }

    public void summ(){
        System.out.println("Summ: " + summ);
    }

    public void average(){
        average = summ / count;
        System.out.println("Average: " + average);
    }

    public void personInput(){
        summ1 = summ1 + personInput;
    }
}
