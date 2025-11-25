class fibo {
    int fi(int n){
        if(n==0||n==1){
            return n;
        }
        return fi(n-1)+fi(n-2);
    }
    public static void main(String[] args) {
        fibo o=new fibo();
        int res=o.fi(7);
        System.out.println(res);
    }
    
}
