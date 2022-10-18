package Penis.HW;
import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Initiate variables
        int vow=0, cons=0;
        System.out.println("Enter a string: ");
        String s = in.nextLine();

        //Char array to sequence through
        char[] chars = s.toCharArray();
        for(int i=0; i < s.length(); i++){
            //Switch for vowel check
            switch (chars[i]) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                    vow++;
                    break;
                case ' ':
                    continue;
                default:
                    cons++;
                    break;
            }
        }
        //Output
        System.out.println("The number of vowels is " + vow);
        System.out.println("The number of constanats is " + cons);
    }
}
