package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Id
    private long clientId;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client) {
        this.clientId = client.getClientId();
        creationDate = new Date();
    }

    public Portfolio(Client client, Date creationDate) {
        this.clientId = client.getClientId();
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return this.portfolioId;
    }

    public void setClientId(Client client) {
        this.clientId = client.getClientId();
    }

    public Long getClientId() {
        return clientId;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
