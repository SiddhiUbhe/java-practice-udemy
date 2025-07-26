class StaticDemo
{
    static int staticVar;
    int var;

    public StaticDemo()
    {
        var = 0;                 // initialize non static variable to 0
    }

    public static void setStaticVar(int x)      // static method can only access static variables
    {
        staticVar = x;
    }

    public void increase()
    {
        staticVar++;                  // increase the value of static variable
        var++;                        // increase non static variable
    }

    public void display()
    {
        System.out.println("The value of static variable : "+ staticVar);
        System.out.println("The value of non-static variable : "+ var);
        System.out.println();
    }
}

class KeywordStatic
{
    public static void main(String A[])
    {
        StaticDemo st1 = new StaticDemo();
        StaticDemo st2 = new StaticDemo();

        // increase the static variable two times using st1 object
        st1.increase();
        st1.increase();
        st1.display();

        // increase the static variable two times using st2 object
        st2.increase();
        st2.increase();
        st2.increase();
        st2.display();

        // static members can also be accessed without any object
        StaticDemo.setStaticVar(50);    // call static method without using any object
        System.out.println("Static variable without object : " + StaticDemo.staticVar);

    }
}