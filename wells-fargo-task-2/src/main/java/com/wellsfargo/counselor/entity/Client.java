package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int clientID;

    @ManyToOne
    @JoinColumn(name="advisor_id" + "")
    private FinancialAdvisor advisor;

    public Client() {

    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(FinancialAdvisor advisor) {
        this.advisor = advisor;
    }

    public Client(int clientID, FinancialAdvisor advisor) {
        this.clientID = clientID;
        this.advisor = advisor;
    }
}

