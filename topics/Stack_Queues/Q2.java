package Stack_Queues;

import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        // Stack<Integer> stack1 = new Stack<>();
        // Stack<Integer> stack2 = new Stack<>();
        // stack1.push(2);
        // stack1.push(1);
        // stack1.push(5);
        // stack1.push(6);
        // stack1.push(2);
        // stack1.push(3);
        int arr[] = {2,1,5,6,2,3};
        int subs = 0;
        int n = arr.length-1;
        int a=0;
        int b=1;
        int res=0;
        for(int i=0; b<=n; i++){
            if(arr[a]<arr[b]){
                subs = arr[a]-arr[b];
                subs = Math.abs(subs);
                arr[a] = arr[a]-subs;
                res = arr[a]+arr[b];
            }else{
                subs = arr[b]-arr[a];
                subs = Math.abs(subs);
                arr[b] = arr[b]-subs;
                res = arr[a]+arr[b];
            }
            
            a++;
            b++;
        }
        res= Math.abs(res);
        System.out.println(res);

    }

    
}
