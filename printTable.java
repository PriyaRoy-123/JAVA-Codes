 import java.util.Scanner;
 class printTable {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no you want to printTable");
        int no=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(no+"*"+i+"="+no*i);
        }
    }
    
}
