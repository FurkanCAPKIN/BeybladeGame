public class ThreadSleeper
{
    /*Programımıza biraz daha gerçeklik katmak için Thread sınıfında bulunan
    static bir metot olan sleep yardımıyla programımızı durduyoruz.
     */
    public static void sleep (long milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
