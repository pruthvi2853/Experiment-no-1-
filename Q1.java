import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                          "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty",
                         "sixty", "seventy", "eighty", "ninety"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1 to 100: ");
        int num = sc.nextInt();

        if (num == 100) {
            System.out.println("one hundred");
        } else if (num >= 1 && num < 10) {
            System.out.println(ones[num - 1]);
        } else if (num >= 10 && num < 20) {
            System.out.println(teens[num - 10]);
        } else if (num >= 20 && num < 100) {
            int tenPart = num / 10;
            int onePart = num % 10;
            String result = tens[tenPart];
            if (onePart != 0) {
                result += " " + ones[onePart - 1];
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
