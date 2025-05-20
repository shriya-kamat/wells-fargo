package com.wellsfargo.counselor;

import com.wellsfargo.counselor.entity.*;

public class Main {
    public static void main(String[] args) {
        FinancialAdvisor advisor = new FinancialAdvisor("1", "Pixie Advisor");
        Client client = new Client("101", "Pixie Client", "9876543210", advisor);
        Portfolio portfolio = new Portfolio("501", client);
        Security security = new Security("1001", "ABC Stock", "Equity", 2500.50, portfolio);

        System.out.println("Advisor: " + advisor.getName());
        System.out.println("Client: " + client.getName() + ", Phone: " + client.getPhoneNumber());
        System.out.println("Portfolio ID: " + portfolio.getPortfolioId());
        System.out.println("Security: " + security.getName() + ", Type: " + security.getType() + ", Value: " + security.getValue());
    }
}
