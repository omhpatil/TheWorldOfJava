package Java8Features.Regex;

public class RegexEmailValidation {
    public static void main(String[] args) {

        // Email Validation
        String email = "patilom887@gmail.com";

        String Regex = ("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        System.out.println("Valid Email: " + email.matches(Regex));


    }
}

