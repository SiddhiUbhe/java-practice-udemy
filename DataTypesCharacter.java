class DataTypesCharacter
{
    public static void main(String A[])
    {
        char myChar;  // Character type data, size 2-bytes

        myChar = 'A';
        System.out.println("The value of myChar : "+myChar);

        myChar = 70;  // ASCII value of a character F
        System.out.println("The value of myChar : "+myChar);

        myChar = '\u0041';  // unicode Hexadecimal value for integer (From 0000 to FFFFF)
        System.out.println("The value of myChar : "+myChar);      
    }
}