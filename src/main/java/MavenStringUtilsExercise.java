import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class MavenStringUtilsExercise {
    static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (StringUtils.isNumeric(input)) {
                System.out.printf("'%s'  is a number.\n", input);
            } else {
                System.out.println(input);
            }

            String flippedCase = StringUtils.swapCase(input);
            System.out.println("Flipped case: " + flippedCase);

            String reversed = StringUtils.reverse(input);
            System.out.println("Reversed: " + reversed);
        }

}


