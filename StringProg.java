import java.util.Scanner;

class StringProg
{
    public static void main(String A[])
    {
        char[] charString = {'S','t','r','i','n','g'}; // an array of characters

        Scanner sobj = new Scanner(System.in);

        String str = new String(charString);   // make String from the character array

        System.out.println("The value of str is : "+str);

        System.out.println("Enter string : ");
        str = sobj.next();                     // Get the string from the user 
        System.out.println("The value of str is : "+str);

        str = "JAVA Strings";
        System.out.println("The value of str is : "+str);

        str = "String"+" "+"Concatenate";
        System.out.println("The value of str is : "+str);

        sobj.close();
    }
}