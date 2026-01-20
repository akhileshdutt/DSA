package topicWiseQuestions;

import java.util.Arrays;

public class traversal {
    public static void main(String[] args) {
        int nums[] = {2,3,4,1,3,2,5,0,6,0,4,9,0,4}; 
        // printing(nums);
        // sum(nums);
        // oddev(nums);

        // int k = max(nums);
        // System.out.println(k);

        // int k2 = min(nums);
        // System.out.println(k2);


    }

    public static void printing(int nums[]){
        int n = nums.length-1;
        for(int i=n; i>=0; i--){
            System.out.print(nums[i]+" ");
        }
    }

    public static void sum(int nums[]){
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
    
    public static void oddev(int nums[]){
        int n = nums.length;
        int odd = 0;
        int even = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] % 2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even: "+even);
        System.out.println("odd: "+odd);
    }

    public static int max(int nums[]){
        int n = nums.length-1;
        int max = nums[0];

        for(int i=0; i<n; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    public static int min(int nums[]){
        int n = nums.length-1;
        int min = nums[0];
        for(int i = 0; i<n; i++){
            if(min>nums[i]){
                min = nums[i];
            }
        }
        return min;
    }

    

}
