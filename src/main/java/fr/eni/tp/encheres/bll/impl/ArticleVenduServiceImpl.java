package fr.eni.tp.encheres.bll.impl;

import fr.eni.tp.encheres.bll.ArticleVenduService;
import fr.eni.tp.encheres.bo.ArticleVendu;
import fr.eni.tp.encheres.dal.ArticleVenduDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleVenduServiceImpl implements ArticleVenduService {
    ArticleVenduDAO articleVenduDAO;

    //constructeur
    public ArticleVenduServiceImpl(ArticleVenduDAO articleVenduDAO) {
        super();
        this.articleVenduDAO = articleVenduDAO;

    }

    //ajouter un article dans la bdd
    @Override
    public void createArticleVendu(ArticleVendu articleVendu) {

        this.articleVenduDAO.insert(articleVendu);

    }
    @Override
    public ArticleVendu read(Integer no_article) {
       return this.articleVenduDAO.read(no_article);
    }

    @Override
    public ArticleVendu readArticleByNom(String nom_article) {
        return this.articleVenduDAO.readArticleByNom(nom_article);
    }

    @Override
    public List<ArticleVendu> findAll() {
        return this.articleVenduDAO.findAll();
    }


    @Override
    public void delete(Integer no_article) {
this.articleVenduDAO.delete(no_article);
    }

    @Override
    public void update(ArticleVendu articleVendu) {
this.articleVenduDAO.update(articleVendu);
    }


}


