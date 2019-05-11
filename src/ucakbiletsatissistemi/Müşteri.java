
package ucakbiletsatissistemi;

/**
 *
 * @author Mehmet Yılmaz
 */
public class Müşteri {
// Değişkenler tanımlandı.
    private String Tc_Kimlik_No;
    private String Ad;
    private String Soyad;
    private String Cinsiyet;
    private String Doğum_Tarihi;
// Constructor'lar oluşturuldu.
    public Müşteri() {

    }

    public Müşteri(String Tc_Kimlik_No, String Ad, String Soyad, String Cinsiyet, String Doğum_Tarihi) {
        this.Tc_Kimlik_No = Tc_Kimlik_No;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Cinsiyet = Cinsiyet;
        this.Doğum_Tarihi = Doğum_Tarihi;
    }
// Getter ve Setter'lar hazırlandı.
    public String getTc_Kimlik_No() {
        return Tc_Kimlik_No;
    }

    public void setTc_Kimlik_No(String Tc_Kimlik_No) {
        this.Tc_Kimlik_No = Tc_Kimlik_No;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public String getCinsiyet() {
        return Cinsiyet;
    }

    public void setCinsiyet(String Cinsiyet) {
        this.Cinsiyet = Cinsiyet;
    }

    public String getDoğum_Tarihi() {
        return Doğum_Tarihi;
    }

    public void setDoğum_Tarihi(String Doğum_Tarihi) {
        this.Doğum_Tarihi = Doğum_Tarihi;
    }

}
