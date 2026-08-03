//anagram

public class Test{

    public static void main(String[] args){
        System.out.println(Anagram("LOL","OLL"));
        //System.out.println(Panagram("The quick brown fox jumps over the lazy dog"));
    }

    public static String Anagram(String s1,String s2){

        if(s1.length()!=s2.length()) return "Not Anagram";
        
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        
        if(java.util.Arrays.equals(arr1,arr2)) return "Anagram";

        else return "Not Anagram";
    }
    
    /*
    public static String Panagram(String sentence){

        if(s1.length()!=s2.length()) return "Not Panagram";
        
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        
        if(java.util.Arrays.equals(arr1,arr2)) return "Panagram";

        else return "Not Panagram";
    }
    */
}

class Movie{
    private String title;
    
}