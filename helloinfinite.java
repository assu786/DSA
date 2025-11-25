class InfiniteHello {
    void printHello() {
        System.out.println("Hello");
        printHello();  
    }

    public static void main(String[] args) {
        InfiniteHello ob = new InfiniteHello();
        ob.printHello();
    }
}
