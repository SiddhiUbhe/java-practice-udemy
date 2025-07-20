class BitwiseOperator
{
    public static void main(String A[])
    {
        byte val1 = 12;        // 0000 1100
        byte val2 = 10;        // 0000 1010
        byte res;

        // 12 = 8 + 4 = 0000 1100 => 1111 0011 => -(0000 1100 + 1) = - (12 + 1) = - 13
        res = (byte) ~val1;  // bitwise complement val1
        System.out.println("The result : "+res);

        res = (byte) (val1 & val2);  // bitwise AND operation
        System.out.println("The result : "+res);

        res = (byte) (val1 | val2);  // bitwise OR operation
        System.out.println("The result : "+res);

        res = (byte) (val1 ^ val2);  // bitwise XOR operation
        System.out.println("The result : "+res);

        // 0000 1100 << 2 = 0011 0000 = 32 + 16 = 48
        res = (byte) (val1 << 2);  // Shift 2 bites to the left
        System.out.println("The result : "+res);

        // 0000 1100 >> 2 = 0000 0011 = 0 + 3 = 3
        res = (byte) (val1 >> 2);  // Shift 2 bites to the right
        System.out.println("The result : "+res);

    }
}