import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        System.out.print("Sayı giriniz:");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        int avg=0;

        for(int i=0; i<=x;i++)
        {
            if(i%12 == 0)
            {
                avg+=i;

            }
            continue;
        }

        System.out.println("Ortalama: "+ avg);

    }
}