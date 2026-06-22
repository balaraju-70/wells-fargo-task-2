package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long securityId;

    @Column(nullable = false)
    private String ticker;

    @Column(nullable = false)
    private String name;

    protected Security() {
    }

    public Security(String ticker, String name) {
        this.ticker = ticker;
        this.name = name;
    }

    public long getSecurityId() {
        return securityId;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
