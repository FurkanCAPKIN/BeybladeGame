public class Beyblade
{
    private String isim;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade (String isim, int donusHizi, int saldiriGucu)
    {
        this.isim = isim;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }
    public String getIsim()
    {
        return isim;
    }
    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }
    public int getDonusHizi() {
        return donusHizi;
    }
    public void setSaldiriGucu(int saldiriGucu)
    {
        this.saldiriGucu = saldiriGucu;
    }
    public int getSaldiriGucu()
    {
        return saldiriGucu;
    }

    public void saldir()
    {
        System.out.println(isim+" "+saldiriGucu+" ve "+donusHizi+" ile saldırıyor.");
    }

    public void kutsalCanavarOrtayaCikiyor()
    {
        System.out.println("Bu beybladin kutsal canavari bulunmuyor.");
    }

    public void bilgileriGoster()
    {
        System.out.println("Beybladeci isim :"+isim);
        System.out.println("Saldırı gücü :"+saldiriGucu);
        System.out.println("Dönüş hızı :"+donusHizi);
    }


}
