package Java8Features.StreamAPI.main;

@FunctionalInterface
interface interf {
    public void m1();
}

public class LambdaDemo {

    int x = 10;

    public void m2() {
        int y = 20;		// Local Variables referenced from lambda-expression must be final or effectively final.

        interf i = () -> {
            System.out.println(x);
            System.out.println(y);
        };

        i.m1();

    }

    public static void main(String[] args) {
        LambdaDemo l = new LambdaDemo();
        l.m2();
    }

}