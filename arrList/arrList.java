import java.util.Scanner;
import java.util.ArrayList;

class arrList{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc  = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if(num==-1)
                break;
            al.add(num);
        }
        System.out.println(al);
        System.out.print("Enter the element to find :");
        int f = sc.nextInt();
        for(int i=0;i<al.size();i++){
            if(al.get(i)==f) //basically get() provides the value of specified position on the ArrayList
            { 
                al.remove(i);//remove() removes the element from specified position and move elements towards left
            }
        }
        System.out.println(al);
    }
}
