import java.util.*;
class replacestring {
    public static void main(String args[]){
        replacestring ob=new replacestring();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ob.search(s);

    }public static void search(String s){
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='a'|| s.charAt(i)=='A'){
                System.out.print('*');
            }else System.out.print(s.charAt(i));
           i++;
         }return ;

    }
    }