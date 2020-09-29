class Solution {
    public int firstUniqChar(String s) {
       int[] char_counts=new int[26];
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           char_counts[c-'a']++;
       }
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(char_counts[c-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
