public class BinarySearch
{
    public static void main(String[] args)
    {
        int [] numsArr = {1,2,3,4,5,6,7,8,9,10};
     
        System.out.println(binarySearchF(numsArr,9));
        
    }


    public static int binarySearchF(int[] nums, int target)
    {
        int mid = 0;
        int left = 0;
        int right = nums.length-1;
        while(left<=right)
        {
            //mid = (left + right)/2; Not advisable because of overflow
            mid = left + (right-left)/2; //prevents overflow
            //mid = (left + right) >>> 1; //prevents overflow as well 
            //Explained here 
            //https://stackoverflow.com/questions/19058859/what-does-mean-in-java
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(target<nums[mid])
            {
               right = mid - 1;
            }
            else if(target>nums[mid])
            {
               left = mid + 1;
            }
        }
        return -1;
    }
}