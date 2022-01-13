package com.SimpleCommerce.models.entities;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Order {

    @EmbeddedId
    private OrderPK id = new OrderPK();
    private Integer order_number;

    public Order(){
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }

    public void setUser(User user){
        id.setUser(user);
    }

    public OrderPK getId() {
        return id;
    }

    public void setId(OrderPK id) {
        this.id = id;
    }

    public Integer getOrder_number() {
        return order_number;
    }

    public void setOrder_number(Integer order_number) {
        this.order_number = order_number;
    }
}
