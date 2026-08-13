class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] arr1= s.toCharArray();
        for (int i =0;i<(arr1.length/2);i++){
            if (arr1[i]!=arr1[arr1.length-1-i]){
                return false;
            }
            
        }
        return true;
        
    }
}
