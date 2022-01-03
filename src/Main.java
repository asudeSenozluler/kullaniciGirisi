import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int girisHakki=3;
        String sistemAd="Mustafa Murat";
        String sistemParola="12345";
        System.out.println("*****************************");
        System.out.println("Kullanıcı Girişine Hoş Geldiniz...");
        System.out.println("******************************");

        while (true){
            System.out.println("Kullanıcı Adı: ");
            String kullanici=scanner.nextLine();
            System.out.println("Parola: ");
            String parola=scanner.nextLine();
            if (kullanici.equals(sistemAd) && parola.equals(sistemParola)){
                System.out.println("Hoş Geldiniz: "+kullanici);
                break;
            }
            else if (kullanici.equals(sistemAd)&& !parola.equals(sistemParola)){
                System.out.println("Parolanız Yanliş");
                girisHakki -=1;
                System.out.println("Giriş Hakkı: "+girisHakki);
            }
            else if (!kullanici.equals(sistemAd)&& parola.equals(sistemParola)){
                System.out.println("Kullanıcı Adınız Yanliş");
                girisHakki -=1;
                System.out.println("Giriş Hakkı: "+girisHakki);
            }
            else {
                System.out.println("Kullanıcı adı ve parolanız yanlış!");
                girisHakki -=1;
                System.out.println("Giriş Hakkı: "+girisHakki);
            }
            if (girisHakki==0){
                System.out.println("Giriş Hakkınız Kalmadı...!");
                break;
            }


         }


    }
}
