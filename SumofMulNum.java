package Day2;

import java.util.Scanner;

public class SumofMulNum {
    public static void main(String[] args) {
        System.out.println("Enter count of numbers");
        Scanner sc=new Scanner(System.in);
        int count = sc.nextInt();
        int num,sum=0;
        for(int i=0;i<count;i++){
            System.out.println("enter a number");
            num=sc.nextInt();
            sum=num+sum;
        }
        System.out.println("sum of all numbers is "+sum);
    }
}
