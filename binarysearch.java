class binarysearch {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=6;
        System.out.println(binary(arr,target));
    }
    public static int binary(int[] arr,int target){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
}
