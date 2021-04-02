public class MillenniumFalcon extends Battleship {
    private int dodge;

    public MillenniumFalcon(long id, String name, Color color, int attackDamage, int life, int shield, int capacity, int dodge) {
        super(id, name, color, attackDamage, life, shield, capacity);
        this.dodge = dodge;
    }


    @Override
    void attack(Battleship battleship){
        battleship.takeDamage(attackDamage);
        this.attackDamage *= 2;
    }

    @Override
    void takeDamage(int damage){
        this.life -= damage + 50;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
}
