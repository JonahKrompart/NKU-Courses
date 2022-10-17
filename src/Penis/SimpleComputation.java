package Penis;
/*
    Write a program that computes the discriminant for
    the equation 3x^2 + 4x + 5 = 0.
    ax^2 + bx + c = 0 -> b^2 – 4ac
 */
public class SimpleComputation {
    public static void main(String[] args) {
        // 3x^2 + 4x + 5 = 0
        int a, b, c;
        a = 3; b = 4; c = 5;
        double disc = Math.pow(b, 2) - (4 * a * c);
        System.out.print(disc);

        //output: -44
    }
}
