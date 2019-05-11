
package ucakbiletsatissistemi;

/**
 *
 * @author Mehmet Yılmaz
 */
public class Bilet {
// Değişkenler tanımlandı.
    private String Ülke;
    private String Şehir;
    private String Gidiş_Tarihi;
    private int Peron_No;
    private int Bilet_Ücreti;
// Constructorlar kuruldu.
    public Bilet() {

    }

    public Bilet(String Ülke, String Şehir, String Gidiş_Tarihi, int Peron_No) {
        this.Ülke = Ülke;
        this.Şehir = Şehir;
        this.Gidiş_Tarihi = Gidiş_Tarihi;

        this.Peron_No = Peron_No;
    }
// Getter ve Setter'lar hazırlandı
    public String getÜlke() {
        return Ülke;
    }

    public void setÜlke(String Ülke) {
        this.Ülke = Ülke;
    }

    public String getŞehir() {
        return Şehir;
    }

    public void setŞehir(String Şehir) {
        this.Şehir = Şehir;
    }

    public String getGidiş_Tarihi() {
        return Gidiş_Tarihi;
    }

    public void setGidiş_Tarihi(String Gidiş_Tarihi) {
        this.Gidiş_Tarihi = Gidiş_Tarihi;
    }

    public int getPeron_No() {
        return Peron_No;
    }

    public void setPeron_No(int Peron_No) {
        this.Peron_No = Peron_No;
    }

    public int getBilet_Ücreti() {
        return Bilet_Ücreti;
    }

    public void setBilet_Ücreti(int Bilet_Ücreti) {
        this.Bilet_Ücreti = Bilet_Ücreti;
    }

}
