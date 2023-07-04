package maceraOyunu;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz ! ");
        System.out.print("Lütfen bir isim giriniz: ");
        String playerName = "Barış";
        Player player = new Player(playerName);
        System.out.println("Sayın " + player.getName()+" bu karanlık ve sisli adaya hoşgeldiniz ! ");
        System.out.println("Burada yaşananların hepsi gerçek !");
        player.SelectChar();
        Location location = null;
        while (true){
                player.printInfo();
                System.out.println();
                System.out.println("#####Bölgeler#####");
                System.out.println();
                System.out.println("1- Güvenli Ev--> Burası sizin için güvenli bir ev, düşman yoktur !");
                System.out.println("2- Eşya Dükkanı --> Silah ve zırh satın alabilirsiniz !");
                System.out.println("3- Mağara --> Ödül <Yemek>, dikkatli ol Zombi çıkabilir !");
                System.out.println("4- Orman --> Ödül <Odun>, dikkatli ol Vampir çıkabilir !");
                System.out.println("5- Nehir --> Ödül <Su>, dikkatli ol Ayı çıkabilir !");
                System.out.println("0- Çıkış Yap ");
                System.out.println();
                System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
                int selectloc = input.nextInt();
                switch (selectloc){
                    case 0 :
                        location = null;
                        break;
                    case 1 :
                        location = new SafeHouse(player);
                        break;
                    case 2 :
                        location = new ToolStore(player);
                        break;
                    case 3:
                        location = new Cave(player);
                        break;
                    case 4:
                        location = new Forest(player);
                        break;
                    case 5:
                        location = new River(player);
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir bölge değeri giriniz : ");
                }
                if (location == null){
                    System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin ! ");
                    break;
                }
                if (!location.onLocation()){
                    System.out.println("GAME OVER !");
                    break;
                }

            }








    }
}
