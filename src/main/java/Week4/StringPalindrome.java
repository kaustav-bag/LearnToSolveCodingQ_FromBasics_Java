package Week4;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        //char[] ch=s.toCharArray();
        int i=0;
        while(i<s.length()){
            if(Character.isLetter(s.charAt(i))) sb.append(s.charAt(i));
            i++;
        }
        System.out.println(sb.toString());
        StringBuilder sb2=new StringBuilder(sb);
        String rev=sb.reverse().toString();
        System.out.println(rev);
        String sentence=sb.toString();
        if(rev.equals(sb2.toString())){
            System.out.println("Palindrome");
        }
    }



}
