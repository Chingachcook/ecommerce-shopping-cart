package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class OrderPizzaProductPK implements Serializable {
    @JsonBackReference
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "pizza_product_id")
    private PizzaProduct pizzaProduct;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PizzaProduct getPizzaProduct() {
        return pizzaProduct;
    }

    public void setPizzaProduct(PizzaProduct pizzaProduct) {
        this.pizzaProduct = pizzaProduct;
    }
}
