package com.wellsfargo.counselor.entity;

public class Portfolio {

    private String portfolioId;
    private Client client;

    public Portfolio(String portfolioId, Client client) {
        this.portfolioId = portfolioId;
        this.client = client;
    }

    // Add getters if needed
    public String getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }
}
