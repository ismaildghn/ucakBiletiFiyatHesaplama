import java.util.Scanner;

public class ucakBiletiFiyatHesaplama {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double tutar;

        Scanner imp = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi KM cinsinden giriniz : ");
        mesafe = imp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = imp.nextInt();

        System.out.println("Yolculuk tipinizi seçiniz 1: Tek Yön , 2: Gidiş - Dönüş");
        yolculukTipi = imp.nextInt();

        tutar = mesafe * 0.10;

        if ((mesafe > 0) && (yas > 0) && (yolculukTipi == 1) || (yolculukTipi == 2)) {
            if (yas < 12) {
                tutar *= 0.5;
            } else if ((yas <= 24) && (yas >= 12)) {
                tutar *= 0.9;
            } else if (yas > 65) {
                tutar *= 0.7;
            }
            if (yolculukTipi == 2) {
                tutar *= 0.8;
            }
            System.out.println("Toplam Bilet Fiyatı : " + tutar);
        }else {
            System.out.println("Hatalı Veri Giriniz !");
        }
    }
}
