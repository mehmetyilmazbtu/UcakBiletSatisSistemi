
package ucakbiletsatissistemi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Mehmet Yılmaz
 */
public class UcakBiletSatisSistemi {

//Projenin Main kısmı
    public static void main(String[] args) throws FileNotFoundException {
//Bilet sınıfından nesneler oluşturuldu.
        Bilet Bilet1 = new Bilet("Türkiye", "Ankara", "19/06/2019", 78);
        Bilet Bilet2 = new Bilet("Almanya", "Berlin", "19/06/2019", 82);
        Bilet Bilet3 = new Bilet("İtalya", "Roma", "19/06/2019", 65);
        Bilet Bilet4 = new Bilet("Japonya", "Tokyo", "19/06/2019", 59);
//Müşteriden gerekli bilgiler alınması için 'temp' adında geçici bir scanner oluşturuldu.        
        System.out.println("Tc vatandaşıysanız 1 i değilseniz 2 yi tuşlayınız.");
        Scanner temp = new Scanner(System.in);
        int seçim = temp.nextInt();
//Switch-Case sistemi ve PrintWriter komutuyla alınan bilgiler, 'Biletiniz.txt' dosyasına kaydedildi.
//Olası bir karışıklığı engellemek için her aşamadaki 'Biletiniz.txt' dosyasının adlandırılması farklı yapılmıştır.(Örneğin 'Biletiniz2.txt' gibi.)
        switch (seçim) {
            case 1:
                System.out.println("Lütfen bilgilerinizi giriniz. ");
                String w = temp.nextLine();
                System.out.println("Ad");
                String b = temp.nextLine();
                System.out.println("Soyad");
                String c = temp.nextLine();
                System.out.println("Cinsiyet");
                String d = temp.nextLine();
                System.out.println("Doğum Tarihi");
                String e = temp.nextLine();
                System.out.println("Tc kimlik no:");
                String a = temp.nextLine();

                Müşteri Müşteri1 = new Müşteri(a, b, c, d, e);
                System.out.println("Lütfen biletinizi seçiniz:");
                System.out.println("1.Ankara");
                System.out.println("2.Berlin");
                System.out.println("3.Roma");
                System.out.println("4.Tokyo");
                int seçim2 = temp.nextInt();
                switch (seçim2) {
                    case 1:
                        System.out.println("Biletiniz yazdırılıyor.");
                        System.out.println("Biletiniz yazdırıldı lütfen 'Biletiniz.txt' adlı dosyayı kontrol ediniz.");
                        File file = new File("Biletiniz.txt");
                        if (file.exists()) {
                            System.out.println("Dosya zaten var");
                            System.exit(0);
                        }

                        PrintWriter output = new PrintWriter(file);

                        output.println("Ad Soyad:" + Müşteri1.getAd() + " " + Müşteri1.getSoyad());
                        output.println("Cinsiyet: " + Müşteri1.getCinsiyet());
                        output.println("Doğum Tarihi:" + Müşteri1.getDoğum_Tarihi());
                        output.println("Tc Kimlik No: " + Müşteri1.getTc_Kimlik_No());
                        output.println("Bilet Bilgileri:");
                        output.println(Bilet1.getÜlke() + " " + Bilet1.getŞehir() + " " + Bilet1.getGidiş_Tarihi());
                        output.println("Peron No: " + Bilet1.getPeron_No());

                        output.close();

                        break;

                    case 2:
                        System.out.println("Biletiniz yazdırılıyor.");
                        System.out.println("Biletiniz yazdırıldı lütfen 'Biletiniz.txt' adlı dosyayı kontrol ediniz.");
                        File file1 = new File("Biletiniz1.txt");
                        if (file1.exists()) {
                            System.out.println("Dosya zaten var");
                            System.exit(0);
                        }

                        PrintWriter output1 = new PrintWriter(file1);

                        output1.println("Ad Soyad:" + Müşteri1.getAd() + " " + Müşteri1.getSoyad());
                        output1.println("Cinsiyet: " + Müşteri1.getCinsiyet());
                        output1.println("Doğum Tarihi:" + Müşteri1.getDoğum_Tarihi());
                        output1.println("Tc Kimlik No: " + Müşteri1.getTc_Kimlik_No());
                        output1.println("Bilet Bilgileri:");
                        output1.println(Bilet2.getÜlke() + " " + Bilet2.getŞehir() + " " + Bilet2.getGidiş_Tarihi());
                        output1.println("Peron No: " + Bilet2.getPeron_No());

                        output1.close();
                        break;
                    case 3:
                        System.out.println("Biletiniz yazdırılıyor");
                        System.out.println("Biletiniz yazdırıldı lütfen 'Biletiniz.txt' adlı dosyayı kontrol ediniz.");
                        File file2 = new File("Biletiniz2.txt");
                        if (file2.exists()) {
                            System.out.println("Dosya zaten var");
                            System.exit(0);
                        }

                        PrintWriter output2 = new PrintWriter(file2);

                        output2.println("Ad Soyad:" + Müşteri1.getAd() + " " + Müşteri1.getSoyad());
                        output2.println("Cinsiyet: " + Müşteri1.getCinsiyet());
                        output2.println("Doğum Tarihi:" + Müşteri1.getDoğum_Tarihi());
                        output2.println("Tc Kimlik No: " + Müşteri1.getTc_Kimlik_No());
                        output2.println("Bilet Bilgileri:");
                        output2.println(Bilet3.getÜlke() + " " + Bilet3.getŞehir() + " " + Bilet3.getGidiş_Tarihi());
                        output2.println("Peron No: " + Bilet3.getPeron_No());

                        output2.close();
                        break;
                    case 4:
                        System.out.println("Biletiniz yazdırılıyor.");
                        System.out.println("Biletiniz yazdırıldı lütfen 'Biletiniz.txt' adlı dosyayı kontrol ediniz.");
                        File file3 = new File("Biletiniz3.txt");
                        if (file3.exists()) {
                            System.out.println("Dosya zaten var");
                            System.exit(0);
                        }

                        PrintWriter output3 = new PrintWriter(file3);

                        output3.println("Ad Soyad:" + Müşteri1.getAd() + " " + Müşteri1.getSoyad());
                        output3.println("Cinsiyet: " + Müşteri1.getCinsiyet());
                        output3.println("Doğum Tarihi:" + Müşteri1.getDoğum_Tarihi());
                        output3.println("Tc Kimlik No: " + Müşteri1.getTc_Kimlik_No());
                        output3.println("Bilet Bilgileri:");
                        output3.println(Bilet4.getÜlke() + " " + Bilet4.getŞehir() + " " + Bilet4.getGidiş_Tarihi());
                        output3.println("Peron No: " + Bilet4.getPeron_No());

                        output3.close();
                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız.");
                        break;
                }

                break;
            case 2:
                System.out.println("Lütfen bilgilerinizi giriniz. ");
                String q = temp.nextLine();
                System.out.println("Uyruk:");
                String p = temp.nextLine();
                System.out.println("Ad");
                String f = temp.nextLine();
                System.out.println("Soyad");
                String g = temp.nextLine();
                System.out.println("Cinsiyet");
                String h = temp.nextLine();
                System.out.println("Doğum Tarihi");
                String i = temp.nextLine();
                System.out.println("Tc kimlik no:");
                String j = temp.nextLine();

                Yabancı_Müşteri Müşteri2 = new Yabancı_Müşteri(p, j, f, g, h, i);
                System.out.println("Lütfen biletinizi seçiniz:");
                System.out.println("1.Ankara");
                System.out.println("2.Berlin");
                System.out.println("3.Roma");
                System.out.println("4.Tokyo");
                int seçim3 = temp.nextInt();
                switch (seçim3) {
                    case 1:
                        System.out.println("Biletiniz yazdırılıyor.");
                        System.out.println("Biletiniz yazdırıldı lütfen 'Biletiniz.txt' adlı dosyayı kontrol ediniz.");
                        File file = new File("Biletiniz4.txt");
                        if (file.exists()) {
                            System.out.println("Dosya zaten var");
                            System.exit(0);
                        }

                        PrintWriter output = new PrintWriter(file);

                        output.println("Ad Soyad:" + Müşteri2.getAd() + " " + Müşteri2.getSoyad());
                        output.println("Cinsiyet: " + Müşteri2.getCinsiyet());
                        output.println("Doğum Tarihi:" + Müşteri2.getDoğum_Tarihi());
                        output.println("Kimlik No: " + Müşteri2.getTc_Kimlik_No());
                        output.println("Uyruk: " + Müşteri2.getUyruk());
                        output.println("Bilet Bilgileri:");
                        output.println(Bilet1.getÜlke() + " " + Bilet1.getŞehir() + " " + Bilet1.getGidiş_Tarihi());
                        output.println("Peron No: " + Bilet1.getPeron_No());

                        output.close();

                        break;

                    case 2:
                        System.out.println("Biletiniz yazdırılıyor.");
                        System.out.println("Biletiniz yazdırıldı lütfen 'Biletiniz.txt' adlı dosyayı kontrol ediniz.");
                        File file1 = new File("Biletiniz5.txt");
                        if (file1.exists()) {
                            System.out.println("Dosya zaten var");
                            System.exit(0);
                        }

                        PrintWriter output1 = new PrintWriter(file1);

                        output1.println("Ad Soyad:" + Müşteri2.getAd() + " " + Müşteri2.getSoyad());
                        output1.println("Cinsiyet: " + Müşteri2.getCinsiyet());
                        output1.println("Doğum Tarihi:" + Müşteri2.getDoğum_Tarihi());
                        output1.println("Uyruk: " + Müşteri2.getUyruk());
                        output1.println("Kimlik No: " + Müşteri2.getTc_Kimlik_No());
                        output1.println("Bilet Bilgileri:");
                        output1.println(Bilet2.getÜlke() + " " + Bilet2.getŞehir() + " " + Bilet2.getGidiş_Tarihi());
                        output1.println("Peron No: " + Bilet2.getPeron_No());

                        output1.close();
                        break;
                    case 3:
                        System.out.println("Biletiniz yazdırılıyor");
                        System.out.println("Biletiniz yazdırıldı lütfen 'Biletiniz.txt' adlı dosyayı kontrol ediniz.");
                        File file2 = new File("Biletiniz6.txt");
                        if (file2.exists()) {
                            System.out.println("Dosya zaten var");
                            System.exit(0);
                        }

                        PrintWriter output2 = new PrintWriter(file2);

                        output2.println("Ad Soyad:" + Müşteri2.getAd() + " " + Müşteri2.getSoyad());
                        output2.println("Cinsiyet: " + Müşteri2.getCinsiyet());
                        output2.println("Doğum Tarihi:" + Müşteri2.getDoğum_Tarihi());
                        output2.println("Uyruk: " + Müşteri2.getUyruk());
                        output2.println("Kimlik No: " + Müşteri2.getTc_Kimlik_No());
                        output2.println("Bilet Bilgileri:");
                        output2.println(Bilet3.getÜlke() + " " + Bilet3.getŞehir() + " " + Bilet3.getGidiş_Tarihi());
                        output2.println("Peron No: " + Bilet3.getPeron_No());

                        output2.close();
                        break;
                    case 4:
                        System.out.println("Biletiniz yazdırılıyor.");
                        System.out.println("Biletiniz yazdırıldı lütfen 'Biletiniz.txt' adlı dosyayı kontrol ediniz.");
                        File file3 = new File("Biletiniz7.txt");
                        if (file3.exists()) {
                            System.out.println("Dosya zaten var");
                            System.exit(0);
                        }

                        PrintWriter output3 = new PrintWriter(file3);

                        output3.println("Ad Soyad:" + Müşteri2.getAd() + " " + Müşteri2.getSoyad());
                        output3.println("Cinsiyet: " + Müşteri2.getCinsiyet());
                        output3.println("Doğum Tarihi:" + Müşteri2.getDoğum_Tarihi());
                        output3.println("Uyruk: " + Müşteri2.getUyruk());
                        output3.println("Kimlik No: " + Müşteri2.getTc_Kimlik_No());
                        output3.println("Bilet Bilgileri:");
                        output3.println(Bilet4.getÜlke() + " " + Bilet4.getŞehir() + " " + Bilet4.getGidiş_Tarihi());
                        output3.println("Peron No: " + Bilet4.getPeron_No());

                        output3.close();
                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız.");
                        break;
                }

                break;
            default:
                System.out.println("Yanlış rakam tuşladınız yeniden deneyin.");
        }

    }

    // TODO code application logic here
}
