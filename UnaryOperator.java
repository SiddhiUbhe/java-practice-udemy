class UnaryOperator
{
    public static void main(String A[])
    {
        int var1, var2;
        var1 = 50;

        var2 = -var1;
        System.out.println("The var1 = "+ var1 + ", var2 = "+var2);

        var1 = 50;
        var2 = var1++;
        System.out.println("The var1 = "+ var1 + ", var2 = "+var2);

        var1 = 50;
        var2 = ++var1;
        System.out.println("The var1 = "+ var1 + ", var2 = "+var2);

        var1 = 50;
        var2 = var1--;
        System.out.println("The var1 = "+ var1 + ", var2 = "+var2);

        var1 = 50;
        var2 = --var1;
        System.out.println("The var1 = "+ var1 + ", var2 = "+var2);

        boolean bool1, res;
        bool1 = true;

        res = !bool1;
        System.out.println("The bool1 is : "+bool1);
        System.out.println("The result is : "+res);
        
    }
}