package pl.uhu87.algorithms;

public class twoSums {
    

    public static void main(String[] args) {
        
        int [] testArray = {2,3,4,5,6,7};
        int testInt = 10;

        

        System.out.println(twoSum(testArray, testInt)[0] + ", " + twoSum(testArray, testInt)[1]);

    }
    
      
        public static int[] twoSum(int[] nums, int target) {
            
            int[] result = new int [2];

            for (int i = 0; i < nums.length; i++) {
                for (int j = 1; j < nums.length; j++) {

                    if(nums[i]+nums[j]==target && i!=j){
                        result[0]=i;
                        result[1]=j;
                    }
                }
            }            
            
            return result;
        }


}
