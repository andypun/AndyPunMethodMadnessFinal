package AndyPun;

public class APunLib
{
    public static boolean isPalindrome(String str)
    {
        int n = str.length();
        for (int i =0; i < n/2; i++)
        {
            if (str.charAt(i) != str.charAt(n - i -1))
            {
                return false;
            }
        }
        return true;
    }

    public static String dateStr(String str)
    {
        String output = str.substring(3,5) + "-" + str.substring(0,2) + "-" + str.substring(6);
        return output;
    }


}
