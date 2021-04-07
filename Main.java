import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please input an unsorted array. Use ' ' to split the numbers.");
        Scanner scanner1=new Scanner(System.in);
        String str=scanner1.nextLine();
        String[] arr=str.split(" ");
        int[] a=new int[arr.length];
        for(int i=0; i<a.length;i++)
        {
            a[i] = Integer.parseInt(arr[i]);
        }
        System.out.println("Please input a target.");
        Scanner scanner2 = new Scanner(System.in);
        int t=scanner2.nextInt();
        TwoSum ts=new TwoSum();
        ts.twoSum(a, t);
    }

}
