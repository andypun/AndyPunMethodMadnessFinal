package AndyPun;

public class testFile {

    public static void main(String[] args) {
	// write your code here
        System.out.println(APunLib.isPalindrome("racecar"));
        System.out.println(APunLib.isPalindrome("reverse"));

        System.out.println("");

        System.out.println(APunLib.dateStr("02/13/2001"));

        System.out.println("");

        System.out.println(APunLib.sumUpTo(0));
        System.out.println(APunLib.sumUpTo(1));
        System.out.println(APunLib.sumUpTo(2));
        System.out.println(APunLib.sumUpTo(5));

        System.out.println("");

        APunLib.multiplicationTable(2, 5);
        System.out.println("");
        APunLib.multiplicationTable(3, 10);

        System.out.println("");

        System.out.println(APunLib.isFibonnaci(5));
        System.out.println(APunLib.isFibonnaci(10));
        System.out.println(APunLib.isFibonnaci(13));
        System.out.println(APunLib.isFibonnaci(15));
    }
}
