import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter a number: ");
        int prime = sc.nextInt();
        int isPrime = 1; 
        
        if (prime <= 1) isPrime = 0;
        for (int i = 2; i <= Math.sqrt(prime); i++) {
            if (prime % i == 0) {
                isPrime = 0;
                break;
            }
        }
        
        if (prime <= 1) {
            System.out.println(prime + " is neither prime nor composite");
        } else if (isPrime == 1) {
            System.out.println(prime + " is a prime number");
        } else {
            System.out.println(prime + " is a composite number");
        }
        
        sc.close();
    }
}

