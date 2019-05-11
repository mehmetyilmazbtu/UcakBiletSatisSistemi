/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucakbiletsatissistemi;

/**
 *
 * @author Mehmet Yılmaz
 */
public class Yabancı_Müşteri extends Müşteri {
//Yabancı_Müşteri sınıfı, Müşteri sınıfından kalıtımla türetildi.
//Değişken tanımlandı.
    private String uyruk;
//Constructorlar oluşturuldu
    public Yabancı_Müşteri() {
        super();

    }

    public Yabancı_Müşteri(String uyruk, String Tc_Kimlik_No, String Ad, String Soyad, String Cinsiyet, String Doğum_Tarihi) {
        super(Tc_Kimlik_No, Ad, Soyad, Cinsiyet, Doğum_Tarihi);
        this.uyruk = uyruk;
    }
//Getter ve Setter'lar hazırlandı.
    public String getUyruk() {
        return uyruk;
    }

    public void setUyruk(String uyruk) {
        this.uyruk = uyruk;
    }

    @Override
    public void setTc_Kimlik_No(String Yabancı_Kimlik_No) {
        super.setTc_Kimlik_No(Yabancı_Kimlik_No); //To change body of generated methods, choose Tools | Templates.
    }

}
