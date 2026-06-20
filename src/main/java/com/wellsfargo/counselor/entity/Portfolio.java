package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String portfolioName;

    @Column
    private Double totalValue;

    @Column
    private String description;

    public Portfolio() {}

    public Portfolio(Long id, String portfolioName, Double totalValue, String description) {
        this.id = id;
        this.portfolioName = portfolioName;
        this.totalValue = totalValue;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public String getDescription() {
        return description;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
