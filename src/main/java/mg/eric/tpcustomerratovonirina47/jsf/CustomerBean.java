/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.eric.tpcustomerratovonirina47.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;

import mg.eric.tpcustomerratovonirina47.entity.Customer;
import mg.eric.tpcustomerratovonirina47.service.CustomerManager;

/**
 *
 * @author Ratovonirina
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {

    private List<Customer> customerList;

    @Inject
    private CustomerManager customerManager;

    public CustomerBean() {
    }

    /**
     * Retourne la liste des clients pour affichage dans une DataTable.
     */
    public List<Customer> getCustomers() {
        if (customerList == null) {
            customerList = customerManager.getAllCustomers();
        }
        return customerList;
    }

}
