public abstract class Beast implements SpeedAble, AttackAble{
    String name;

    public Beast(String name) {
        this.name = name;
    }

    protected Beast() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Beast{" +
                "name='" + name + '\'' +
                '}';
    }
}
