class StringFunc
{
    public static void main(String A[])
    {
        String str1 = "HELLO", str2 = "Hello";

        System.out.println("The length of the string : "+str1 + " is : "+str1.length());

        if(str1.equals(str2))
        {
            System.out.println(str1 + " & " + str2 + " are same.");
        }
        else
        {
            System.out.println(str1 + " & " + str2 + " are not same.");
        }

        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println(str1 + " & " + str2 + " are same (ignoring case)");
        }
        else
        {
            System.out.println(str1 + " & " + str2 + " are not same (ignoring case)");
        }

        System.out.println("The character at position 2 is : "+str1.charAt(2));

        System.out.println("Comparing " + str1 + " & " + str2 + "Distance : " + str1.compareTo(str2));

        str1 = "AABBCABBAA";
        str2 = "JAVA String Functions";

        System.out.println("The string " + str1 + " is starts with (AAB) : " + str1.startsWith("AAB"));
        System.out.println("The string " + str1 + " is ends with (ACA) : " + str1.endsWith("ACA"));

        System.out.println("First index of (BB) in " + str1 + " is : " + str1.indexOf("BB"));
        System.out.println("Last index of (BB) in " + str1 + " is : " + str1.lastIndexOf("BB"));

        // replacing a substring with new substring
        System.out.println("Replacing (ABB) to (xy) of " + str1 + " is : " + str1.replace("ABB", "xy"));

        // get substring from a given string
        System.out.println("Substring of " + str2 + " from 5 to 15 : " + str2.substring(5, 11));
        
        // split the string by using (-) as delimiter
        str1 = "This-is-a-test-string";
        String[] splitArr = str1.split("-");

        System.out.println("The splitted parts are : ");
        for(String sp : splitArr)   // for each element of splitted string set
        {
            System.out.println(sp);
        }

        // Trim the blank spaces from starting and ending of the string
        str2 = "    Lot's Of Spaces     ";
        System.out.println("Before Triming : (" + str2 + ")");
        System.out.println("After Triming : (" + str2.trim() + ")");

        str2 = "    Lot's Of         Spaces     ";
        System.out.println("Before Triming : (" + str2 + ")");
        System.out.println("After Triming : (" + str2.trim() + ")");
    }
}