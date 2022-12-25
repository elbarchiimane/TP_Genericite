package metier;

import metier.Produit;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {

    List<Produit> listProduit=new ArrayList<>();
    @Override
    public void add(Produit o) {
        listProduit.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return listProduit;
    }

    @Override
    public Produit finfById(long id) {
        Produit result=null;
        for (Produit p : listProduit) {
            if (p.getId() == id) result = p;}

            return result;

    }

    @Override
    public void delete(long id) {
        Produit result=null;
        for (Produit p: listProduit){
            if(p.getId()==id) result=p;
        }
        listProduit.remove(result);
    }

}
