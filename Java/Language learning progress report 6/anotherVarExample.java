public class Example {
    public void myMethod() {
        int x = 5; // x is a local variable within this method
        if (x > 0) {
            int y = 10; // y is a local variable within this block
            System.out.println(y);
        }
        System.out.println(x);
        // y cannot be accessed here because it was declared in a different block of code
    }
}
