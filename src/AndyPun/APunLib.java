package AndyPun;

public class APunLib
{
    /**
     * String word to check ( true / false) if it is a palindrome ( same forwards and backwards )
     * @param str the string input to check whether or not it is a palindrome
     * @return true or false
     */
    public static boolean isPalindrome(String str)
    {
        int n = str.length();
        for (int i = 0; i < n / 2; i++)
        {
            if (str.charAt(i) != str.charAt(n - i - 1))
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Converts a date from String in the format (“mm/dd/yyyy”) to the format (“dd – mm - yyyy”)
     * @param str the input date
     * @return the new date
     */
    public static String dateStr(String str)
    {
        String output = str.substring(3, 5) + "-" + str.substring(0, 2) + "-" + str.substring(6);
        return output;
    }

    /**
     * @param n integer input to determine whether or not a value is part of the Fibonacci sequence starting from 0 and 1
     * @return true or false
     */
    public static boolean isFibonnaci(int n)
    {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = a + b;
            if (sum == n)
            {
                return true;
            }
            a = b;
            b = sum;
        }
        return false;
    }

    /**
     * displays the multiplication table of the base to the range
     * @param a the base
     * @param b the range
     */
    public static void multiplicationTable(int a, int b)
    {
        int c = 0;
        for (int i = 0; i < b; i++)
        {
            System.out.println(c = c + a);
        }
        return;
    }

/**
 * @return gives the sum of all number from 0 to input @param n
*/
    public static int sumUpTo(int n)
    {
        int sum = 0;
        for (int i = 0; i < n+1; i++)
        {
           sum = sum + i;
        }
        return sum;
    }
}

