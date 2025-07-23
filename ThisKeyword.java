class ThisKeywordX
{
    private int a, b;

    public ThisKeywordX(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public ThisKeywordX()
    {
        this(0, 0);     // it will call parametized constructor with value 0 and 0
    }

    public void setData(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void display()
    {
        System.out.println("The values of a and b are : " + a + " and " + b);
    }
}

class ThisKeyword
{
    public static void main(String A[])
    {
        ThisKeywordX tobj = new ThisKeywordX();
        tobj.display();
        tobj.setData(23, 46);
        tobj.display();
    }
}