package homework7.bodyguard;

public abstract class BodyGuard {

    void shoot(Attacker attacker) {
        attacker.shoot();
    }

    void notShoot(Attacker attacker) {
        attacker.notShoot();
    }

    void saveClientLife(Attacker attacker, BodyGuard bodyGuard) {
        if (attacker.hasGun() == 1) {
            shoot(attacker);
            shoot(bodyGuard);
        } else {
            notShoot(attacker);
            notShoot(bodyGuard);
        }
    }

    protected abstract void shoot(BodyGuard bodyGuard);
    protected abstract void notShoot(BodyGuard bodyGuard);
}

