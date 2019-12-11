import java.util.Arrays;
import java.util.Scanner;

public class PrimeSieve2 {
    public static boolean[] sieve = new boolean [1000];
    public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
        for (int i=2; i<=999; i++){
           for (int j=i*2; j<=999; j+=i ){//Wilson and I wrote this before told on Tuesday
              sieve[j]=false;
           }
        }
        int [] jesus= collectPrimes();  
        System.out.println();
        System.out.println("Sir, pick a number greater than 1, brother.");
        Scanner keys= new Scanner(System.in);
        int yourVariable=keys.nextInt();
        printPrimeFactors(yourVariable, jesus);
    }
    public static int[] collectPrimes(){
        int count=0; 
        for (int i =0; i<1000; i++){
           if (sieve[i]==true){
              count++;
           }
        }
        int [] prime = new int [count];
        int h=0;
        for (int j=0; j<1000; j++) {
           if (sieve [j]==true) {
              prime[h]=j;
              h++;
              
           }
        }
        return prime;
    }
    public static void printPrimeFactors(int yourVariable, int[]prime){
        System.out.println("Prime factorization of " +yourVariable+ ".");
        if (yourVariable<=1){
            System.out.println("Do you need to go back to elementary school? Because that number isn't greater than 1.");
        }
        for (int i=0; i<yourVariable; i++) {
            int k=0;
            while (yourVariable%prime[i]==0){
                yourVariable=yourVariable/prime[i];
                k++;
            }
            if (k>0){
                System.out.println(prime[i]+": "+k);
            }
        }
    }
}



    
         
                
            