import java.util.Scanner;

public class Char_Position {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Size");
        int size = s.nextInt();
        boolean flag = false;

        char a[] = new char[size];

        System.out.println("Enter the characters");
        for (int i = 0; i < size; i++) {
            a[i] = s.next().charAt(0);
        }

        System.out.println("Enter the character do you find");
        char x = s.next().charAt(0);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                flag = true;
                System.out.println(i);
            }
        }

        if (flag = true) {
            System.out.println("0");
        } else {
            System.out.println();
        }
        s.close();

    }
}
