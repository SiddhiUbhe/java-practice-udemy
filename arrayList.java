import java.util.*;

class arrayList
{
    public static void main(String A[])
    {
        ArrayList<String> cityList = new ArrayList<>();       // create an array list for string type object

        //Add items in the array list
        cityList.add("Delhi");
        cityList.add("Kolkata");
        cityList.add("Hyderabad");
        cityList.add("Chennai");

        System.out.println("The size of the array list : " + cityList.size());

        // display the content of the array list
        System.out.println("Cities : " + cityList);
        
        // display the content of the array list one by one
        for(String city : cityList)
        {
            System.out.println(city);
        }

        // insert another city at the index 2 in cityList
        cityList.add(2, "Mumbai");

        System.out.println("Cities : " + cityList);
    }
}