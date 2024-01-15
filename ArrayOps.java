public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(findMissingInt(new int[] {3, 0, 1}));
        System.out.println(secondMaxValue(new int[] {6, 9, 4, 7, 3, 4}));
        System.out.println(containsTheSameElements(new int[]  {2, 2, 3, 7, 8, 3, 2}, new int[] {8, 2, 7, 7, 5}));
        System.out.println(isSorted(new int[] {1, 2, 3}));
            
    }
    
    public static int findMissingInt (int [] nums) {

        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2;
        int numSum = 0;

        for(int i = 0; i < nums.length; i++) {
            numSum += nums[i];
        }
        
        return totalSum - numSum;
    }

    public static int secondMaxValue(int [] max2) {

        int firstMax = max2[0];
        int secondMax = max2[1];

        for (int j = 1; j < max2.length; j++) {

            if (max2[j] > firstMax){
                secondMax = firstMax;
                firstMax = max2[j];
            } else if (max2[j] > secondMax && max2[j] < firstMax) {
                secondMax = max2[j];
            }   
        }
        
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) { 

        for(int i = 0; i < array1.length; i++) {
            boolean Match = false;

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    Match = true;
                    break;
                } 
    
            }
            if (!Match) {
                return false;
            }

        }
    return true;
        
    }

    public static boolean isSorted(int [] array) {
        boolean ascending = true;
        boolean descending = true;

        for(int i = 0; i < array.length - 1; i++) {

            if (array[i] >= array[i + 1]) {
                ascending = false;


            } else if (array[i] <= array[i + 1]) {
                descending = false;

            }

        }
    return ascending || descending;
    }

}
