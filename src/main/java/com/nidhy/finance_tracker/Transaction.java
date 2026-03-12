package com.nidhy.finance_tracker;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private double amount;
    private String category;
    private String type;
    private LocalDate date;

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public double getAmount() {return amount;}
    public void setAmount(double amount) {this.amount = amount;}

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public LocalDate getDate() {return date;}
    public void setDate(LocalDate date) {this.date = date;}
}
