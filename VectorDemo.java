import java.util.Vector;

class VectorDemo
{
    public static void main(String A[])
    {
        Vector<Integer> numVector = new Vector <>();  // create a vector for Integer type object

        numVector.add(10);
        numVector.add(20);
        numVector.add(30);
        numVector.add(40);
        numVector.add(50);

        System.out.println("The size of the vector : "+numVector.size());

        System.out.println("Numbers : "+numVector);

        for(Integer num : numVector)
        {
            System.out.println(num);
        }

        numVector.add(3, 100);

        System.out.println("Numbers : "+numVector);
    }
}