import java.util.*;

class SetDemo
{
    public static void main(String A[])
    {
        int[] list1 = {1,5,2,6,5,2,12};
        int[] list2 = {12,4,3,2,4,15};

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        //add items in two different sets
        for(int item : list1)
            set1.add(item);
        for(int item : list2)
            set2.add(item);

        System.out.println("The First set : "+set1);
        System.out.println("The Second set : "+set2);

        // the union of two sets
        Set<Integer> union = new HashSet<Integer>(set1); // copy the set1
        union.addAll(set2); // add items of the set2
        System.out.println("Set union : "+union);

        // the intersection of two sets
        Set<Integer> intersection = new HashSet<Integer>(set1); // copy the set1
        intersection.retainAll(set2);  // remove those items, those are not present in set2
        System.out.println("Set intersection : "+intersection);

        // the intersection of two sets
        Set<Integer> diff = new HashSet<Integer>(set1); // copy the set1
        diff.removeAll(set2);  // remove common elements from two sets
        System.out.println("Set Difference : "+diff);
    }
}