public class secondlargest {
    public static int sec(int[] arr){
        int firstmax = -1;
        int secmax = -1;
        for(int i = 0;i<arr.length;i++){
            if(firstmax<arr[i]){
               secmax = firstmax;
               firstmax = arr[i]; 
            }
            else if(arr[i] > secmax && arr[i] != firstmax){
                secmax = arr[i];
            }
        }
        return secmax;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,10};
        int ans = sec(arr);
        System.out.print(ans);
    }
}
