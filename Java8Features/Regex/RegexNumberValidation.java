package Java8Features.Regex;

public class RegexNumberValidation {
    public static void main(String[] args) {

        // Phone Number Validation
        String phoneNumber1 = "1234567890";  // will print false because of 9 numbers only
        String phoneNumber2 = "123-456-7890";

        String Regex = ("^\\d{3}-?\\d{3}-?\\d{4}$");

        System.out.println("Valid Phone Number1: " + phoneNumber1.matches(Regex));
        System.out.println("Valid Phone Number2: " + phoneNumber2.matches(Regex));

    }
}
