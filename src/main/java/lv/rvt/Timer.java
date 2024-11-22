package lv.rvt;

public class Timer {
    
    private int value;
    private int limit;

    public void Clock(int initialIimit) {

        this.limit = initialIimit;
        this.value = 0;

    }
    
    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
        
    }
    
}
