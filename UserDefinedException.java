class BelowAgeException extends Exception
{
    BelowAgeException()
    {
        super("Age is under 18");   // message for the exception
    }

}

class Application
{
    private String name;
    private String course;
    private int age;

    public Application(String name, String course)     // Set name and course to given values
    {
        this.name = name;
        this.course = course;
        age = 18;        
    }

    public Application()           // Set name and course to empty string
    {
        this("","");
    }

    public void setAge(int age) throws BelowAgeException
    {
        if(age < 18)
        {
            throw new BelowAgeException();
        }
        else
        {
            this.age = age;
        }
    }

    public void displayDetails()
    {
        System.out.println("The name of the student : "+name);
        System.out.println("Applied for "+course);
        System.out.println("Applicant's Age : "+age);
        System.out.println();
    }
}

class UserDefinedException
{
    public static void main(String A[])
    {
        Application application1 = new Application("Jhon", "JAVA Programming");
        Application application2 = new Application("Utpal", "Operating System");

        application1.displayDetails();

        try
        {
            application2.setAge(17);         // this keyword may throw exception
        }
        catch(BelowAgeException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
    
}