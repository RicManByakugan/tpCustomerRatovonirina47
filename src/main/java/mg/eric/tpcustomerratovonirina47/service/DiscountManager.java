/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.eric.tpcustomerratovonirina47.service;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import mg.eric.tpcustomerratovonirina47.entity.Discount;

/**
 *
 * @author Ratovonirina
 */
@RequestScoped
public class DiscountManager {

    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    public List<Discount> getAllDiscounts() {
        Query query = em.createNamedQuery("Discount.findAll");
        return query.getResultList();
    }

    public Discount findById(String code) {
        return em.find(Discount.class, code);
    }

    public List<Discount> getDiscountsSortedAscending() {
        Query query = em.createNamedQuery("Discount.findAllAscending");
        return query.getResultList();
    }

    public List<Discount> getDiscountsSortedDescending() {
        Query query = em.createNamedQuery("Discount.findAllDescending");
        return query.getResultList();
    }
}
