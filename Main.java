import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, fizik, kimya, tar, muz, tur;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:  ");
        math = input.nextInt();

        System.out.print("Fizik Notunuz:  ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz:  ");
        kimya = input.nextInt();

        System.out.print("Tarih Notunuz:  ");
        tar = input.nextInt();

        System.out.print("Müzik Notunuz:  ");
        muz = input.nextInt();

        System.out.print("Türkçe Notunuz:  ");
        tur = input.nextInt();


        int toplam = (math + fizik + kimya + tar + muz + tur);
        int sonuc = toplam / 6;
        System.out.println("Ortalamanız: " + sonuc);

        String sonuc1 = (sonuc > 60) ? "Geçti!" : "Kaldı!";
        System.out.println("Sonuç: " + sonuc1);





    }
}
