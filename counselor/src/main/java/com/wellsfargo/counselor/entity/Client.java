package com.wellsfargo.counselor.entity;

public class Client {
    private String clientId;
    private String name;
    private String phoneNumber;
    private FinancialAdvisor advisor;

    public Client(String clientId, String name, String phoneNumber, FinancialAdvisor advisor) {
        this.clientId = clientId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.advisor = advisor;
    }

    public String getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }
}
