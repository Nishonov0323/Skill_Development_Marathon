package src.day_7;

import java.util.Scanner;

public class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (temp != 0) {
            int q = temp % 10;
            if (num % q == 0) {
                count ++;
            }
            temp /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(new CountTheDigitsThatDivideANumber().countDigits(num));
    }
}
