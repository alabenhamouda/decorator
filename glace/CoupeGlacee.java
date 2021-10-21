package glace;
import java.util.*;
public abstract class CoupeGlacee extends Produit {
    protected List<Parfum> parfums = new LinkedList<Parfum>();
    protected CoupeGlacee() {}
    public String description() {
        StringBuffer sb = new StringBuffer("");
        for (Iterator<Parfum> it = parfums.iterator(); it.hasNext();) {
            sb.append(it.next().toString());
            sb.append(" ");
        }
        return sb.toString();
    }
}