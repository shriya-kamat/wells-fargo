package com.wellsfargo.counselor.entity;

public class Security {
    private String securityId;
    private String name;
    private String type;
    private double value;
    private Portfolio portfolio;

    // Constructor
    public Security(String securityId, String name, String type, double value, Portfolio portfolio) {
        this.securityId = securityId;
        this.name = name;
        this.type = type;
        this.value = value;
        this.portfolio = portfolio;
    }

    // Getters
    public String getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    // Setters (optional – add if needed)
    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
