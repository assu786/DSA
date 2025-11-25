class Recursion {
    void sum(int n) {
        if(n > 10) {
            return;   
        }
        System.out.println(n);
        sum(n + 1); 
    }
public static void main(String args[]) {
        Recursion ob = new Recursion();
        ob.sum(1); 
        System.out.println("Start!");
    }
}

