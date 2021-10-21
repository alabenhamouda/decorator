package glace;

public class SauceChocolat extends BaseToppings {
    public SauceChocolat(Produit w) { super(w); }
    @Override
    public String description() {
        return super.description() + "et sa delicieuse sauce chocolat ";
    }
    @Override
    public float cout() {
        return super.cout() + 0.7f;
    }
}