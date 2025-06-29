import java.util.Scanner;

public class evenodd {

    int value;
    boolean output;
    public static void main(String[] args) {
        evenodd p1 = new evenodd();
        p1.value = p1.readValueFromUser();
        p1.output=p1.valueIsEvenOROdd();
        System.out.println(p1.output);
    }

    int readValueFromUser() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Value : ");
        value = sc.nextInt();

        sc.close();
        return value;
    }

    boolean valueIsEvenOROdd() {
        if (value % 2 == 0)
            return true;
        return false;

    }

}