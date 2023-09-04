class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
        if(even(num)){
            count++;
        }
        }
        return count;
    }

    boolean even(int num){
        int numOfDigits = digit(num);
        return numOfDigits%2 ==0;
    }
    static int digit(int num){
        int count=0;
        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    }
    }
