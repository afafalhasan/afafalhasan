import java.util.Scanner;

public class HexDigit2Dec {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit : ");
        String hexString = input.nextLine();

        if (hexString.length() != 1){
            System.out.println ("you must enter exactly one character ");
            System.exit(1);

            char ch = hexString.charAt(0);


        }
    }
}
