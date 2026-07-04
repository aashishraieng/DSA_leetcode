class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ans="";
        String[] array=s.split(" ");
        int sp=0;
        for(int i=array.length-1;i>=0;i--){
            if(array[i]!="" ){
                ans+=array[i];
                ans+=" ";
                sp=0;
            }
        }
        ans=ans.trim();

        return ans;

        
        
    }
}