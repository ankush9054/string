public class recur_b_s {

    static int recur_b(int arr[],int low,int high,int x){
        if(low>high) return -1;

        int mid=(low+high)/2;
        if(arr[mid]==x) return mid;
        else if(arr[mid]>x){
            return recur_b(arr, low, mid-1, x);
        }else{
            return recur_b(arr, mid+1, high, x);
        }
    } 

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};
        System.out.print(recur_b(arr, 0, arr.length-1, 4));
        
    }
    
}
