package maceraOyunu;

public class SafeHouse extends Location {

    public SafeHouse (Player player){
        super(player,"Güvenli Ev");

    }

    @Override
   public boolean onLocation() {
        System.out.println("Güvenli Evdesiniz ! ");
        System.out.println("Canınız Yenilendi");
        this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
        return true;
    }
}
