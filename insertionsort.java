 class insertionsort {
    public static void insert(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=arr[i];
            int j=i-1;
            while(j>=0&&min<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=min;
        }
    }
    public static void main(String args[]){
        int arr[]={6,5,7,4,8,3,9,2,1};
        insert(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
