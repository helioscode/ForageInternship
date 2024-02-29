package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "portfolio_id")
    private int portfolioId;

    @Column(name = "portfolio_name")
    private String portfolioName;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Constructor, getters, and setters


    public Portfolio(int portfolioId, String portfolioName, Client client) {
        this.portfolioId = portfolioId;
        this.portfolioName = portfolioName;
        this.client = client;
    }

    public Portfolio() {

    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(int portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}