package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Security {
    @Id@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="security_id")
    private int securityId;

    @Column(name="name")
    private String name;
    @Column(name="category")
    private String category;

    @Column(name="purchase_date")
    private Date purchaseDate;

    @Column(name="purchase_price")
    private BigDecimal purchasePrice;

    @Column(name="quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name="portfolio_id")
    private Portfolio portfolio;

    public Security() {

    }

    public int getSecurityId() {
        return securityId;
    }

    public void setSecurityId(int securityId) {
        this.securityId = securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Security(int securityId, String name, String category, Date purchaseDate, BigDecimal purchasePrice, int quantity, Portfolio portfolio) {
        this.securityId = securityId;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }
}
