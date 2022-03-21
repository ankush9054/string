public class binary_s {

    static int b_s(int arr[],int x){
        int low =0;
        int high = arr.length-1;
        

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]>x){
                low = mid-1;
            }else{
                low=mid+1; 
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.print(b_s(arr, 5));
        
    }
    
}
