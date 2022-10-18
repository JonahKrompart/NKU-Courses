package Penis.HW;

public class RandomPoint {
    //Write a program that generates a random point inside a circle. The circle is centered at (0, 0) with a radius 5. Display the point and its distance to the center.
    public static void main(String[] args) {
        double d, r, x, y;
        r = 5.0;
        x = Math.random() * r;
        y = Math.random() * r;

        //Hypotenuse thingy
        d = (x*x) + (y*y);
        d = Math.sqrt(d);

        System.out.println("The point is (" + x + ", " + y + ") and its distance to the center is " + d);
    }
}
