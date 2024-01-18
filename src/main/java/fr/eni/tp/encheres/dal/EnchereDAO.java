package fr.eni.tp.encheres.dal;

import fr.eni.tp.encheres.bo.ArticleVendu;
import fr.eni.tp.encheres.bo.Enchere;
import fr.eni.tp.encheres.bo.Utilisateur;

import java.util.List;

public interface EnchereDAO {

    //Méthode pour créer une enchère :
    public void insert(Enchere enchere);

    //Méthode pour voir une enchère avec 2 paramètres qui correspondent à la double clé primaire pour la table ENCHERES:
    public abstract Enchere read(Utilisateur utilisateur, ArticleVendu articleVendu);

    //Méthode mise à jour d'une enchère:
    public void update(Enchere enchere);

    //Méthode  pour supprimer une enchère :
    public void delete(Utilisateur utilisateur, ArticleVendu articleVendu);

    //Méthode pour voir toutes les enchères en cours :
    public List<Enchere> findAll();
}

