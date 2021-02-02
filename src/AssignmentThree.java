import java.util.Scanner;

public class AssignmentThree {
    public static void main(String[] args) {
        System.out.println("Implementation of a program to show if the given number" +
                "is divisible by sum of digits or not.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a non-zero number:");
        int n=sc.nextInt();
        int temp,sum=0;
        temp=n;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("sum of digits is: "+sum);
        if (temp%sum==0) System.out.println(temp+" is divisible by sum of its digits");
        else System.out.println(temp+" is not divisible by sum of its digits");

    }
}
