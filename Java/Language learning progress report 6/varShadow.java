public class Example {
    int x = 5; // x is a variable in the higher scope

    public void myMethod() {
        int x = 10; // this x shadows the higher scope x within this method
        System.out.println(x);
    }

    public void anotherMethod() {
        System.out.println(x); // this will access the higher scope x
    }
}
