package glace;
public class BaseToppings extends Produit {
    private Produit wrapee;
    public BaseToppings(Produit w) { wrapee = w; }
    public String description() { return wrapee.description(); }
    public float cout() { return wrapee.cout(); }
}