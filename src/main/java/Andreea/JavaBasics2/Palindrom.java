package Andreea.JavaBasics2;

public class Palindrom {
    public static void main(String[] args) {
        String aPalindrome = "capac";
        String anotherPalindrome = "capac";

        System.out.println(aPalindrome==anotherPalindrome);
        System.out.println(System.identityHashCode(aPalindrome));
        System.out.println(System.identityHashCode(anotherPalindrome));
        System.out.println(aPalindrome.equals(anotherPalindrome));

        StringBuilder nume = new StringBuilder("Andreea");
        nume.reverse();
        System.out.println(nume);

        System.out.println(isPalindrome("ioana"));
    }

    static boolean isPalindrome(String originalString){
        String reverse = "";
        for(int i = originalString.length()-1; i>=0;i--){
            reverse += originalString.charAt(i);
        }
        if(originalString.equals(reverse)){
            return true;

        }
        return false;
    }

}
