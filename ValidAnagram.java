class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] char_counts=new int[26];
        for(char c: s.toCharArray()){
            char_counts[c-'a']++;
        }
        for(char c:t.toCharArray()){
            char_counts[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(char_counts[i] != 0){
                return false;
            }
        }
        return true;
    }
}
