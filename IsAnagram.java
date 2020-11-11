class Solution {
    public boolean isAnagram(String s, String t) {
        
        //if the length of s and the length of t are not the same, then no anagram exists. 
        if(s.length() != t.length()){
            return false;
        }
        
        //Create a char array of size 26 for each letter of the alphabet
        int[] char_counts=new int[26];
        
        //We are looping through the string
        for(int i=0;i<s.length();i++){
            
            //We get the index by subtracting a from  the current character.
            char_counts[s.charAt(i)-'a']++;
            char_counts[t.charAt(i)-'a']--;
        }
        
        for(int count:char_counts){
            if(count != 0){
                return false;
            }
        }
        
        return true;
        
        
    }
}
