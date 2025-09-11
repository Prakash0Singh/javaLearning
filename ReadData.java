import java.util.*;

class ReadData {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Getting UserName from input ----
        String name;

        System.out.println("May I know your name :- ");
        name = s.nextLine();

        System.out.println("Welcom " + name);

        // Getting 2 input value for addition ---
        int a, b, c;
        System.out.println("Enter two numbers Addition : ");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("Sum = " + c);

    }

}