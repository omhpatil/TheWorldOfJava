package Java8Features.Regex;

public class RegexPasswordValidation {
    public static void main(String[] args) {

        // Password Validation
        String password1 = "Passw0rd!";
        String password2 = "password";
        String password3 = "P@ss123";
        String password4 = "Ompatil@pass07";

        String Regex = ("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");

        System.out.println("Valid Password1:" + password1.matches(Regex));
        System.out.println("Valid Password2:" + password2.matches(Regex));
        System.out.println("Valid Password3:" + password3.matches(Regex));
        System.out.println("Valid Password4:" + password4.matches(Regex));

    }
}
