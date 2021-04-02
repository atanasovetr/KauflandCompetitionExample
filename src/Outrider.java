public class Outrider extends Battleship{
    private int plasmaDefense;

    public Outrider(long id, String name, Color color, int attackDamage, int life, int shield, int capacity, int plasmaDefense) {
        super(id, name, color, attackDamage, life, shield, capacity);
        this.plasmaDefense = plasmaDefense;
        super.life += 100;
    }

    @Override
    void attack(Battleship battleship) {
        battleship.takeDamage(attackDamage);
    }

    @Override
    void takeDamage(int damage) {
        this.life -= damage - 50;
    }

    public int getPlasmaDefense() {
        return plasmaDefense;
    }

    public void setPlasmaDefense(int plasmaDefense) {
        this.plasmaDefense = plasmaDefense;
    }
}
