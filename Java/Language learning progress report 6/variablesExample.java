public class Example {
    public void myMethod() {
        int x = 5; // x is a local variable within this method
        System.out.println(x);
    }

    public void anotherMethod() {
        // x cannot be accessed here because it was declared in a different method
    }
}
