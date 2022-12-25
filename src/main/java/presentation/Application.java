package presentation;

import metier.MetierProduitImpl;
import metier.Produit;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static java.lang.System.exit;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl m=new MetierProduitImpl();

        Scanner s=new Scanner(System.in);
        System.out.println("Entrer un choix : ");
            int c= s.nextInt();
            System.out.println("1.Afficher la liste des produits");
            System.out.println("2.Rechercher un produit par son id");
            System.out.println("3.Ajouter un nouveau produit dans la liste");
            System.out.println("4.Supprimer un produit par son id");
            System.out.println("5.Quitter le programme");

        }
    }
}
