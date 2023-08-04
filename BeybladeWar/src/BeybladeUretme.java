public class BeybladeUretme
{

    public Beyblade beybladeUret (String beybladeTuru)
    {
        if (beybladeTuru.equals("Dragon"))
        {
            return new Dragon("Takao",800,300,"Mavi Ejdarha","Kutsal canavarla konuşma");
        }else if (beybladeTuru.equals("Dranza"))
        {
            return new Dranza("kai",600,400,"Kırmızı anka kuşu");
        }else if (beybladeTuru.equals("Drayga"))
        {
            return new Drayga("Rei",800,250,"Beyaz kaplan");
        }else if ( beybladeTuru.equals("Draciel"))
        {
            return new Draciel("Max",400,1000,"Kara kaplumbağa");
        }else
        {
            return null;
        }
    }

}
