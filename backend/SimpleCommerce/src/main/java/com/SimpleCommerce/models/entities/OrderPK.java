package com.SimpleCommerce.models.entities;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class OrderPK implements Serializable {

    @ManyToOne()
    @JoinColumn(name = "user_id_order")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id_order")
    private Product product;

    OrderPK(){

    }

    public OrderPK(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
