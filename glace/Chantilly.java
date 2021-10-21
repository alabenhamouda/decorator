package glace;

public class Chantilly extends BaseToppings {
    public Chantilly(Produit w) { super(w); }
    @Override
    public String description() {
        return super.description() + "chantilly ";
    }
    @Override
    public float cout() {
        return super.cout() + 0.5f;
    }
}