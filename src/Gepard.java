public class Gepard extends Beast implements AttackAble, SpeedAble{
    private String weight;

    public Gepard(String name, String weight) {
        super(name);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n----------------------------" +
                "\nweight='" + weight + '\'' +
                "\nname='" + name;
    }

    @Override
    public void attacking() {
        System.out.println("Gepard is attacking");
    }

    @Override
    public void speed() {
        System.out.println("120km/h");
    }
}
