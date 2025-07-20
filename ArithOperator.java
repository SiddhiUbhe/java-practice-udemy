import java.util.Scanner;

public class ArithOperator
{
    public static void main(String A[])
    {
        int a, b, result;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value of a and b : ");

        a = sobj.nextInt();
        b = sobj.nextInt();

        result = a + b;
        System.out.println("Result after addition : "+result);

        result = a - b;
        System.out.println("Result after substraction : "+result);

        result = a * b;
        System.out.println("Result after multiplication : "+result);

        result = a / b;
        System.out.println("Result after division : "+result);

        result = a % b;
        System.out.println("Remainder : "+result);

        sobj.close();
    }
}