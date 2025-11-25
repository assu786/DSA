class selection {
    public static void bubble(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return ;
    }
    public static void main(String args[]){
        int[] arr={3,6,7,9,5,8,0,1,2,4};
        bubble(arr);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
