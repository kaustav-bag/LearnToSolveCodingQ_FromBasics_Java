package Week2;

public class JavaFormatting {

    public static void main(String[] args) {
        System.out.printf("%4s%n","lol");// %-placeholder,4s-Right align char 4 spaces or left side min 4 spaces

        System.out.printf("%-15s%03d\n","Test",107);// - means left align 15 spaces, 03d-min 3 int chars, if< then add 0

    }
}
