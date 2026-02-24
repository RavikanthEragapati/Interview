

public class FirstOccurrenceInString {

    public static void main (String[] args){
       System.out.println( strStr("hello","ll"));
    }

    public static int strStr(String haystack, String needle) {

        if( needle.length() > haystack.length()) return -1;
        if(needle.length() == haystack.length())
            if(haystack.equals(needle)) return 0;
            else return -1;

        for(int i=0;i<(haystack.length() - needle.length());i++)
        {
            if(haystack.substring(i, needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}