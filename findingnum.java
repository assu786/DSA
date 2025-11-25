
    import java.util.*;
    class findingnum {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(search(arr, target));
    }

    public static boolean search(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;   
            }
        }
        return false;           
    }
}
