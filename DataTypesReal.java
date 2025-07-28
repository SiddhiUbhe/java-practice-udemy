class DataTypesReal
{
    public static void main(String A[])
    {
        float myFloat;         // floating type data, size 4-bytes

        myFloat = 50.26F;      
        System.out.println("The value of myFloat : "+myFloat);

        myFloat = (float)50/3;  // Type casting to change integer to float
        System.out.println("The value of myFloat : "+myFloat);

        double myDouble;     // Also floating type data, size is 8-bytes
        myDouble = -0.2356;  // We can use D or d to represent double
        System.out.println("The value of myDouble : "+myDouble);

        myDouble = 22D/7;    // converting 22 as double
        System.out.println("The value of myDouble : "+myDouble);

    }
}