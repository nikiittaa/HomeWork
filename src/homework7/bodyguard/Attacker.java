package homework7.bodyguard;

public class Attacker {
    private int gun;

    public Attacker(int gun) {
        this.gun = gun;
    }

    public int hasGun() {
        return this.gun;
    }

    public void shoot() {
        System.out.println("Attacker shoot");
    }

    public void notShoot(){
        System.out.println("Attacker doesn't shoot");
    }

}
