package whileloop;
import java.util.*;
public class AmstrongNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int oriNum, rem, res = 0, n = 0;
        oriNum = num;
        while (oriNum != 0) {
            oriNum /= 10;
            ++n;
        }
        oriNum = num;
        while (oriNum != 0) {
            rem = oriNum % 10;
            res += Math.pow(rem, n);
            oriNum /= 10;
        }
        if (res == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
