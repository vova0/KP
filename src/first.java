import java.util.Scanner;

public class first {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите x1");
        int x1= sc.nextInt();
        System.out.println("Введите y1");
        int y1= sc.nextInt();
        System.out.println("Введите x2");
        int x2= sc.nextInt();
        System.out.println("Введите y2");
        int y2= sc.nextInt();
        double otvet=Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("Искомая длина:"+otvet);
    }
}
