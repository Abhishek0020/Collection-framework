import java.util.Scanner;

public class arr_problem {
    public static void main(String[] args) {
        System.out.println("enter the number" );
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[5];
        arr[0]=20;
        arr[1]=30;
        arr[2]=40;
        arr[3]=50;
        arr[4]=60;
        for (int i = 0; i <5; i++) {
           arr[i]= sc.nextInt();

        }
        System.out.println(arr);
    }
}
