import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter a minimum value: ");
        int min = Integer.parseInt(console.nextLine());

        System.out.println("Enter a maximum value: ");
        int max = Integer.parseInt(console.nextLine());

        System.out.println("Enter a real value: ");
        int real = Integer.parseInt(console.nextLine());

        if ((min < real) && (real < max)) {
            System.out.println("Number is between minimum and maximum.");
        } else {
            System.out.println("Number is out of range of min/max.");
        }
    }
}
