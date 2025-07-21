import java.util.Scanner;

class SwitchCase
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char character = sobj.next().charAt(0);

        switch(character)
        {
            case 'A':
                System.out.println("You have typed letter A.");
                break;
            case 'B':
                System.out.println("You have typed letter B.");
                break;
            case 'C':
                System.out.println("You have typed letter C.");
                break;
            case 'D':
                System.out.println("You have typed letter D.");
                break;
            default:
                System.out.println("You have typed letter other than (A, B, C, D).");
                break;
        }
        sobj.close();
        System.out.println("End of the program...");
    }
}