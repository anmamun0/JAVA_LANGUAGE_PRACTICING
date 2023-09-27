import java.util.Scanner;

public class fast{
    public static void main(String[] args){

        System.out.printf("Enter a Value: ");
        Scanner fast = new Scanner(System.in);
        int fast_value = fast.nextInt();

        System.out.printf("Enter second value : ");
        Scanner second = new Scanner(System.in);
        int second_value = second.nextInt();

        System.out.printf("\n Result : %d + %d = %d", fast_value, second_value, fast_value + second_value);
        System.out.printf("\n Result : %d - %d = %d ",fast_value, second_value, fast_value - second_value );

    }
}
