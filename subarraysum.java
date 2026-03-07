import java.util.ArrayList;
public class subarraysum {
 public static ArrayList<Integer> sub(int[] arr, int target){
    ArrayList<Integer> ans = new ArrayList<>();
    int sum = 0;
    int start = 0;
    for(int i = 0;i<arr.length;i++){
     sum += arr[i];
     while(sum>target && start<=i){
        sum -= arr[start];
        start++;
     }
     if(sum == target){
        ans.add(start+1);
        ans.add(i+1);
        return ans;
     }
    }
    ans.add(-1);
    return ans;
 }
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int target = 12;
        ArrayList<Integer> res = sub(arr,target);
        System.out.print(res);
    }
}
