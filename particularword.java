class particularword {
    public static void main(String args[]){
        String str="today is saturday welcome to saturday class";
        String[] word=str.split(" ");
        String c="saturday";
        int n=word.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(word[i].equals(c)){
                System.out.println(i);
                count++;
            }
        }
        if (count==0){
    System.out.println("notfound");
        }
    }
}
