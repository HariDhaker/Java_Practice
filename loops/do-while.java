import java.util.Scanner;

class doWhile{
    public static void main(String args[])
    {
        int i=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<n);
    }
}
