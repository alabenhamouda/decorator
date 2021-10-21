package glace;

public class Cafe extends Boisson {
    private String name;
    public Cafe(String n) { name = n; }
    @Override
    public String description() {
        return "cafe " + name + " ";
    }
    @Override
    public float cout() {
        return 1.5f;
    }
}