package Penis.HW;
/**
 * Penis Wilson
 * CS 2300
 * Lab 06:
 * TwoInts class
 * 9/28/22
 */

public class TwoInts {
    private final int a;
    private final int b;

    public TwoInts(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public TwoInts(int both) {
        this(both, both);
    }

    public TwoInts(){
        this(0);
    }

    public String toString() {
        return "<"+ a + ", " + b + '>';
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public boolean aIsPos(){
        return a > 0;
    }

    public static void main(String[] args) {
        //Step 7 tests
        TwoInts blue = new TwoInts(4, 11);
        System.out.println("blue = " + blue);
        TwoInts green = new TwoInts(14, -1);
        System.out.println("green = " + green);
        TwoInts one = new TwoInts(144);
        System.out.println("one = " + one);
        TwoInts zero = new TwoInts();
        System.out.println("zero = " + zero);

        //Step 8 test
        System.out.println("blue.b is: " + blue.getB());

        //Step 9 test
        if (green.aIsPos()){
            System.out.println("Yep!");
        } else {
            System.out.println("Nope!");
        }

    }
}