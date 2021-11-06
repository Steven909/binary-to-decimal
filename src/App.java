import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter binary number");
        String binary = scanner.nextLine();

        convertBinaryToDecimal(binary);
    }

    static double convertBinaryToDecimal(String binary) {

        int decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);
        return 0.0;

    }
}

