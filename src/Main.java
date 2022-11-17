public class Main {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("tiger","45");
        Gepard gepard = new Gepard("gepard","55");
        Wolf wolf = new Wolf("wolf","65");

        Beast [] beasts={tiger,gepard,wolf};
        for (Beast b:beasts) {
            System.out.println(b);
            b.attacking();
            b.speed();
        }
    }
}