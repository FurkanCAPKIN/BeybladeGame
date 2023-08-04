public class Dragon extends Beyblade
{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String isim, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek)
    {
        super(isim, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCikiyor()
    {
        System.out.println(getIsim()+" "+kutsalCanavar+" ı ortaya çıkarıyor.");
        System.out.println(getIsim()+" ın saldırısı :Hayalet Kasırgası");

    }

    @Override
    public void bilgileriGoster()
    {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi ="+kutsalCanavar);
        System.out.println("Gizli Yetenek :"+gizliYetenek);


    }


}
