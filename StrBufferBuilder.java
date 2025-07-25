class StrBufferBuilder
{
    public static void main(String A[])
    {
        StringBuffer sBuffer = new StringBuffer(); // default capacity is 16
        System.out.println("Capacity of sBuffer : "+ sBuffer.capacity());

        sBuffer = new StringBuffer(50);  // Set the capacity to 50
        System.out.println("Capacity of sBuffer : "+ sBuffer.capacity());

        // String buffer capacity is now 16 + length of given string
        sBuffer = new StringBuffer("My StringBuffer");  
        System.out.println("Capacity of sBuffer : "+ sBuffer.capacity());

        System.out.println("String in sBuffer : " + sBuffer);

        // StringBuilders are used same as StringBuffer
        StringBuilder sBuilder = new StringBuilder("My StringBuilder");
        System.out.println("String in sBuffer : "+ sBuilder);

        // append string after the string buffer and string builder
        sBuffer.append(". Append with StringBuffer.");
        sBuilder.append(". Append with StringBuilder");
        System.out.println("String in sBuffer : "+ sBuffer);
        System.out.println("String in sBuffer : "+ sBuilder);

        sBuffer = new StringBuffer("AABCABBC");
        sBuilder = new StringBuilder("abaabcabac");

        // insert string in between the old strings
        sBuffer.insert(5, "pqrst");    // insert substring at index 5
        sBuilder.insert(3, "XYZ");     // insert substring at index 3
        System.out.println("String in sBuffer : " + sBuffer);
        System.out.println("String in sBuilder : " + sBuilder);

        // reverse the strings
        System.out.println("Reversed StringBuffer : " + sBuffer.reverse());
        System.out.println("Reversed StringBuilder : "+ sBuilder.reverse());

    }
}