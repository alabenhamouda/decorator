import glace.*;
import java.io.*;
import java.util.*;
public class Commande {
    private List<Produit> lesCoupes = new LinkedList<>();
    public void publieFacture(PrintWriter writer) {
        float total = 0;
        for (Iterator<Produit> it = this.lesCoupes.iterator(); it.hasNext();) {
            Produit coupe = (Produit)it.next();
            writer.println(coupe.description() + " + " + coupe.cout());
            total = total + coupe.cout();
        }
        writer.println(" TOTAL : " + total);
    }
    public void addCoupe(Produit c) { lesCoupes.add(c); }
}