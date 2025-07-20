class ConditionalOperator
{
    public static void main(String A[])
    {
        boolean bool1, bool2, res;
        bool1 = true;
        bool2 = false;

        res = bool1 || bool2;
        System.out.println("The result is : "+res);

        res = bool1 && bool2;
        System.out.println("The result is : "+res);
    }  
}