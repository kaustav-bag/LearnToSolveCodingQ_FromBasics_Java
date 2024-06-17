package Week3;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.Stack;


public class Understanding_Regex {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (isBracketsValid(input)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

            scanner.close();
        }
        public static boolean isBracketsValid(String input) {
            Stack<Character> stack = new Stack<>();
            char[] chars = input.toCharArray();

            for (char c : chars) {
                if (c == '(' || c == '[' || c == '{' || c == '⟨') {
                    stack.push(c);
                } else if (c == ')' || c == ']' || c == '}' || c == '⟩') {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();
                    if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{') || (c == '⟩' && top != '⟨')) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    }

