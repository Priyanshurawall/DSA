class Solution {
    private static boolean checkPlaindrome(String nums){
        int left=0;
        int right=nums.length()-1;
        while(left<right){
            if(nums.charAt(left) != nums.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        
        }
        String nums=x + "";
        return checkPlaindrome(nums);

    }
}