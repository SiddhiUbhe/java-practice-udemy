class Student
{
    String name;
    int id;
    String major;

    void setName(String stName)  // take the student name as string and assign to name variable
    {
        name = stName;
    }

    void setMajor(String subject)  // take major subject for the student and assign it
    {
        major = subject;        
    }

    void display()                 // display the all information of the student
    {
        System.out.println("The student name : " + name);
        System.out.println("Student id : "+ id);
        System.out.println("Major Subject : " + major);
        System.out.println();
    }
}

class ClassObject
{
    public static void main(String A[])
    {
        Student s1, s2;              // declare two reference variable to point student type object
        s1 = new Student();          // s1 now points to the Student type object 
        s2 = new Student();          // s2 pointing another object of Student type

        // use member variables and methods to use them
        s1.setName("Joy");
        s1.id = 1021;
        s1.setMajor("Computer Science");

        s2.setName("Anirban");
        s2.id = 1251;
        s2.setMajor("Physics");

        // display the student details
        s1.display();
        s2.display();
    }
}