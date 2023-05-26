import java.util.Scanner;

public class Thirdy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int sum=a;
        while(true){
            int b= sc.nextInt();
            sum=sum+b;
            if (b==0){

                break;
            }
        }
        System.out.println(sum);
    }
}
