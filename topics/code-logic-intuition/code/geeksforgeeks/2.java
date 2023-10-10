// Q. https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // EDGE: Input is 0
        if(n==0) {
            return false;
        }
        
        String numberToCheckStr = longToBinaryStr(n);
        int inputLength = numberToCheckStr.length();
        
        // Check for 1
        if(numberToCheckStr.charAt(inputLength-1) != '1') {
            return false;
        }
        
        // Check for 0
        for(int index = inputLength-2;index>=0;index--) {
            if(numberToCheckStr.charAt(index) != '0') {
                return false;
            }
        }
        
        return true;
    }
    
    // Convert long to binary
    private static String longToBinaryStr(long input) {
        String output = new String("");
        
        while(input!=0) {
            long rem = input%2;
            output = output + Long.toString(rem);
            input = input/2;
        }
        
        return output;
    }
}