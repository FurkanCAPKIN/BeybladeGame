public class Draciel extends Beyblade
{

    private String kutsalCanavar;
    public Draciel(String isim, int donusHizi, int saldiriGucu, String kutsalCanavar)
    {
        super(isim, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;

    }


    @Override
    public void kutsalCanavarOrtayaCikiyor()
    {
        System.out.println(getIsim()+" "+kutsalCanavar+" ı ortaya çıkarıyor.");
        System.out.println(getIsim()+" ın savunması :Kale savunması");

    }

    @Override
    public void bilgileriGoster()
    {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi ="+kutsalCanavar);

    }
}
