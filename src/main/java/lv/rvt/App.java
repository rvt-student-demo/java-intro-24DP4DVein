package lv.rvt;

public class App 
{
    public class Main {
        public static void main(String[] args) {
            // Three Arrays
            int[] valA   = { 13, -22,  82,  17}; 
            int[] valB   = {-12,  24, -79, -13};
            int[] sum    = {  0,   0,   0,   0};

            

            for (int i = 0; i < valA.length; i++){
                sum[i] = valA[i] + valB[i];
            }
            
            System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
        }
    }
}

