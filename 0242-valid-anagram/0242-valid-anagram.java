class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char k=t.charAt(i);
            arr[c-'a']++;
            arr[k-'a']--;

        }

        for(int i=0;i<26;i++){
            System.out.println(arr[i]);
            if(arr[i]!=0){
                return false;
            }
        }

        return true;
        
    }
}