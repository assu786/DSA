class factorial{
    int sum(int n){
        if (n==0)return 1;
            return n*sum(n-1);
        }
        public static void main(String args[]){
            product ob=new product();
            int res=ob.sum(5);
            System.out.println(res);
        }
    }
