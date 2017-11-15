import java.util.Scanner;
 
public class H6 {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer:");
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        long m=n;
        int flag = 0;
        String[] str = new String[50];
        for (long i = 2; i <= n; i++) {
            if (n % i == 0) {
                str[flag] = Long.toString(i);
                flag++;
                n = n / i;
                i--;
            }
        }
        if (flag < 2)
            System.out.println(m + "is a prime number");
        else {
            System.out.print(m + "=" + str[0]);
            for (int k = 1; k < flag; k++) {
                System.out.print("*" + str[k]);
            }
            System.out.println("\n"+m+"all"+flag+"prime numbers.");
        }
        sc.close();
    }
}