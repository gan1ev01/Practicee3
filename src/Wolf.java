public class Wolf extends Beast implements AttackAble, SpeedAble{
    private String weight;

    public Wolf(String name, String weight) {
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
                "/nname='" + name;
    }

    @Override
    public void attacking() {
        System.out.println("wolf is attacking");
    }

    @Override
    public void speed() {
        System.out.println("30 km/h");
    }
}
