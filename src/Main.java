import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Sinir sayisini giriniz : ");
        k=sc.nextInt();

        for (int i=1; i<k; i*=2){
            System.out.println("2'nin kuvvetleri : " +i);
        }
        System.out.println("------------------------- ");
        for (int i=1;i<k;i*=4){
            System.out.println("4'un kuvvetleri : " +i);
        }
        System.out.println("------------------------- ");
        for (int i=1;i<k;i*=5){
            System.out.println("5'in kuvvetleri : " +i);
        }
    }
}
