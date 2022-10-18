package Penis.TestAreas;
import java.util.*;

public class TESTJANKCODEHERE {
    public static void commandOutput(String[] args) throws Exception{
        //To show command line input with String.join(delimiter, arr)
        String cmd = String.join(" ", args);
        System.out.println("input display success");
        //Alternate version with for loop iteration (same result, worse code)
        int i = args.length;
        for (String s : args) {
            if(i > 1)
                System.out.print("");
            else
                System.out.print("");
            i--;
        }
        System.out.println("alternate input display success");
    }

    public static void intsInCommand(String[] args){
        String cmd = String.join(" ", args);

        //Convert to char[]
        char[] ch = cmd.toCharArray();
        System.out.println("char array success");

        //Integer array from command line, using integers from a char[]
        boolean pass = false;
        int[] exes = new int[ch.length];
        //Integer array from command line, using parseable integers
        int num=0, total=0, i=0, j=0;
        for (char c : ch) {
            try {
                num = Integer.parseInt(String.valueOf(c));
                pass = true;
            } catch (Exception e){
                exes[i] += c;
                String add = (c ==' ')? "space ":c+" ";
                i++;
            }
            if(pass){
                total += num;
            }
        }
        System.out.println("The total of the integers in the command line is " + total
                + " and int i was " + i);
        System.out.println("Failed to find integer at these locations: ");
        while (j < exes.length) {
            System.out.print(((char)exes[j]!=' ')? (char)exes[j]+" ": "space ");
            j++;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String cmd = String.join(" ", args);

        //Output command line input
        commandOutput(args);
        //Output the total of all ints in the input, and some extra stuff
        intsInCommand(args);
    }
}