class tailrecursion {
    public static void main(String args[]) {
       tailrecursion ob=new tailrecursion();
       int res=ob.fact(5,1);
       System.out.println(res); 
    }
    public static int fact(int n,int num){
        if(n==1){
            return num;
        }
        return fact(n-1,n*num);
    }
}
