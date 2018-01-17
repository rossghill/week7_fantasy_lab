package Player.Fighters;
import Actions.IAttackable;
import NPC.Enemy;

public abstract class Fighters extends Player.Player implements IAttackable {

    private Weapon weapon;

    public Fighters(String name, int healthPoints) {
        super(name, healthPoints);
        this.weapon = null;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        int enemyHealth = enemy.getHealth();
        int weaponValue = weapon.getValue();
        enemy.setHealth(enemyHealth - weaponValue);
    }
}

