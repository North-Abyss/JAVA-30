import java.util.*;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Number: ");
        int n = 10;// sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    }
}


/*

        //Roatate an array by 1 position to the right
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        System.out.println("Rotated Array: " + Arrays.toString(arr));
        sc.close();


        //count of individual characters
        String unique = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int charCount = 0;
            if (unique.indexOf(c) == -1) {
                unique += c;
            }
            else continue;
            for(int j=0;j<str.length();j++){ 
                if(str.charAt(j) == c) charCount++;
            }
            System.out.println("'" + c + "' = " + charCount);
        }
        ---
        
        ---

        //remove space from the string
        str = str.replaceAll("\\s", "");

        System.out.println("String without spaces: " + str);
        ---
        // Reverse a string

        for(int i=0;i<str.length();i++){
            rev = str.charAt(i) + rev;
        }
        System.out.println("Reversed String: " + rev);

        ---

        String str = sc.nextLine();
        System.out.println("Count : " + str.length());

        ---

    char Built In Functions

    char ch = 'a';

    Example:
    ch.toUpperCase() -> 'A'
    ch.toLowerCase() -> 'a'
    ch.isDigit() -> true if ch is a digit
    ch.isLetter() -> true if ch is a letter
    ch.isWhitespace() -> true if ch is a whitespace character
    ch.isUpperCase() -> true if ch is an uppercase letter
    ch.isLowerCase() -> true if ch is a lowercase letter
    ch.isAlphabetic() -> true if ch is an alphabetic character
    ch.isLetterOrDigit() -> true if ch is a letter or a digit
    ch.isSpaceChar() -> true if ch is a space character
    ch.isISOControl() -> true if ch is an ISO control character
    ch.isDefined() -> true if ch is a defined character in Unicode
    ch.isHighSurrogate() -> true if ch is a high surrogate character
    ch.isLowSurrogate() -> true if ch is a low surrogate character
    ch.isSurrogate() -> true if ch is a surrogate character
    ch.isMirrored() -> true if ch is a mirrored character
    ch.isTitleCase() -> true if ch is a title case character
    ch.isJavaIdentifierStart() -> true if ch can be the first character of a Java identifier
    ch.isJavaIdentifierPart() -> true if ch can be part of a Java identifier
    ch.isUnicodeIdentifierStart() -> true if ch can be the first character of a Unicode identifier
    ch.isUnicodeIdentifierPart() -> true if ch can be part of a Unicode identifier
    ch.isIdentifierIgnorable() -> true if ch is an ignorable character in a Java identifier
    ch.isJavaWhitespace() -> true if ch is a whitespace character according to Java
    ch.isWhitespace() -> true if ch is a whitespace character according to Unicode
    ch.isSpaceChar() -> true if ch is a space character according to Unicode
    ch.isISOControl() -> true if ch is an ISO control character according to Unicode
    ch.isDefined() -> true if ch is a defined character in Unicode
    ch.isMirrored() -> true if ch is a mirrored character according to Unicode
    ch.isTitleCase() -> true if ch is a title case character according to Unicode

*/

