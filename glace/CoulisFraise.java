package glace;

public class CoulisFraise extends BaseToppings {
    public CoulisFraise(Produit w) { super(w); }
    @Override
    public String description() {
        return super.description() + "au coulis de fraises fraiches ";
    }
    @Override
    public float cout() {
        return super.cout() + 1;
    }
}