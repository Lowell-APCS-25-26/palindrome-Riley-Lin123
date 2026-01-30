package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        String s1 = "";
        String n = "";
        for (int i = 0; i < s.length(); i++){
            if (s.substring(i,i+1).equals(" ") || !Character.isLetter(s.charAt(i))){
                continue;
            }else{
                n = n + s.substring(i,i+1).toLowerCase();
                s1 = s1 + s.substring(i,i+1).toLowerCase();
            }
        }
        
        if (s1.equals(reverse(n))){
            return true;
        }else return false;
    }
    public String reverse(String s) {
        String backward = "";
       for (int i = s.length(); i > 0; i--){
        backward = backward + s.substring(i-1,i);
       }
       return backward;
        
    }
}
