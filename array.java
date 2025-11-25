class array{
    static void print(int[] a, int i){
        if(i == a.length) return; 
        System.out.println(a[i]);   
        print(a, i+1);              
    }
    public static void main(String[] args){
        int[] a = {10,20,30,40,50};
        print(a, 0);
    }
}
