public abstract class Battleship {
    protected long id;
    protected String name;
    protected Color color;
    protected int attackDamage;
    protected int life;
    protected int shield;
    protected int capacity;

    public Battleship(long id, String name, Color color, int attackDamage, int life, int shield, int capacity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.attackDamage = attackDamage;
        this.life = life;
        this.shield = shield;
        this.capacity = capacity;
    }

    abstract void attack(Battleship battleship);
    abstract void takeDamage(int damage);

    public boolean isDestroyed(){
        if(this.life <= 0){
            return true;
        }
        return false;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
