public class Tiger extends Beast implements AttackAble, SpeedAble{
    private String weight;

    public Tiger(String name, String weight) {
        this.name = name;
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
        System.out.println("tiger is attacking");
    }

    @Override
    public void speed() {
        System.out.println("60km/h");
    }
}
