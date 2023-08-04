import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //kullanıcıdan değer almak için Scanner sınıfından input isimli bir nesne oluşturduk.

        System.out.println("Beyblade Oyununa Hoşgeldiniz !!!");
        System.out.println("\nOyundan çıkmak isterseniz q basın");

        while (true)
        {
            System.out.print("\nÜretmek istidiğiniz beyblade ismini giriniz :");
            String uretilecekBeyblade = input.nextLine();

            if ( uretilecekBeyblade.equals("q"))
            {
                //q ya basıldığında break yardımıyla sonsuz döngü kırılıyor ve programımız bitiyor.
                System.out.println("\nOyundan çıkılıyor...");
                break;
            }else
            {
                System.out.println("\nBeyblade'niz Üretiliyor...\n\n");
                ThreadSleeper.sleep(3000);
                //sleep metodu yardımıyla 3 saniye bekliyoruz

                BeybladeUretme beybladeUretme = new BeybladeUretme();
                //Beyblade üretmek için "BeybladeUretme" sınıfından nesne oluşturdum.

                Beyblade beyblade = beybladeUretme.beybladeUret(uretilecekBeyblade);
                //polymorphism kullandığımız kısım, polymorphism burada çok işime yarıyor.

                if ( beyblade == null)
                {
                    System.out.println("Geçerli bir isim giriniz.");
                    //beyblade ismi yanlış girilirse bu kısım çalışır ve uyarı verir.
                }else
                {
                    beyblade.bilgileriGoster();
                    //override edilmiş hali çalışır
                    beyblade.saldir();
                    //override edilmediği için beyblade sınıfındaki çalışır
                    beyblade.kutsalCanavarOrtayaCikiyor();
                    //override edilmiş hali çalışır
                }

            }
        }


    }
}