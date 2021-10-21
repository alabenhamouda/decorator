package glace;

public class Parfum {
    public static final Parfum CASSIS = new Parfum("cassis");
    public static final Parfum CHOCOBLANC = new Parfum("chocolat blanc");
    public static final Parfum CHOCOLAIT = new Parfum("chocolat au lait");
    public static final Parfum CHOCONOIR = new Parfum("chocolat noir");
    public static final Parfum FRAISE = new Parfum("fraise");
    public static final Parfum FRAMBOISE = new Parfum("framboise");
    private String name;
    private Parfum(String s) { name = s; }
    @Override
    public String toString() {
        return name;
    }
}