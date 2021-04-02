public class EbonHawk extends Battleship{

    public EbonHawk(long id, String name, Color color, int attackDamage, int life, int shield, int capacity) {
        super(id, name, color, attackDamage, life, shield, capacity);
    }

    @Override
    void attack(Battleship battleship) {
        battleship.takeDamage(attackDamage);
    }

    @Override
    void takeDamage(int damage) {
        this.life -= damage;
    }

    public void heal(int bonusLife){
        this.life += bonusLife;
    }
}
