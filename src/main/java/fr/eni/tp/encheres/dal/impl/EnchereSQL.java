package fr.eni.tp.encheres.dal.impl;

import fr.eni.tp.encheres.bo.ArticleVendu;
import fr.eni.tp.encheres.bo.Enchere;
import fr.eni.tp.encheres.bo.Utilisateur;
import fr.eni.tp.encheres.dal.EnchereDAO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnchereSQL implements EnchereDAO {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private JdbcTemplate jdbcTemplate;

    public EnchereSQL(NamedParameterJdbcTemplate namedParameterJdbcTemplate, JdbcTemplate jdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(Enchere enchere) {

    }

    @Override
    public Enchere read(Utilisateur utilisateur, ArticleVendu articleVendu) {
        return null;
    }

    @Override
    public void update(Enchere enchere) {

    }

    @Override
    public void delete(Utilisateur utilisateur, ArticleVendu articleVendu) {

    }

    @Override
    public List<Enchere> findAll() {
        return null;
    }
}