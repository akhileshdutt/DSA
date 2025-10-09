package question;

import java.util.Scanner;
    public class InfiniteArraySearch {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,7,13,17,20,25,30,31,35,40};
            // int target = 20;
            Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the no. you want to search: ");
            int target = sc.nextInt();
            int k = search(arr, target);
            System.out.println(k);
        }
        
        
        static int search(int[] arr, int target){
            int start = 0;
            int end = 1;
            while (target>arr[end]){
                start = (2*start)+2;
                end = (2*start)+3;
                // System.out.println(x);
                
                
            }
            return Binary(start, end, arr, target);
            
        }
        static int Binary(int start, int end, int[] arr, int target){
                    while(start<=end){
                        int mid = start + (end-start)/2;
                        if(arr[mid]==target){
                                return mid;
                            }
                            if(arr[mid]<target){
                                    start = mid+1;
                                }else{
                                        end = mid-1;
                                    }
                                }
                                return -1;
                            }

    }