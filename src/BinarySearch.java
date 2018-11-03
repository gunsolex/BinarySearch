public class BinarySearch
{
    public static void main(String[] args)
    {
        int [] numsArr = {1,2,3,4,5,6,7,8,9,10};
     
        System.out.println(binarySearchF(numsArr,3));
        
    }


    public static int binarySearchF(int[] nums, int target)
    {
        int mid = 0;
        int left = 0;
        int right = nums.length-1;
        while(left<=right)
        {
            mid = left + (right - left)/2;
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