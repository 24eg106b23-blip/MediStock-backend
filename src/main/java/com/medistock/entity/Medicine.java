package com.medistock.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "medicines")
public class Medicine {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false) private String name;
    private String genericName;
    private String category;
    private String manufacturer;
    private String batchNumber;
    private LocalDate expiryDate;
    private int stockQuantity;
    private int reorderLevel;
    private double purchasePrice;
    private double sellingPrice;

    public Medicine() {}
    public Medicine(String name, String genericName, String category, String manufacturer,
                    String batchNumber, LocalDate expiryDate, int stockQuantity,
                    int reorderLevel, double purchasePrice, double sellingPrice) {
        this.name=name; this.genericName=genericName; this.category=category;
        this.manufacturer=manufacturer; this.batchNumber=batchNumber;
        this.expiryDate=expiryDate; this.stockQuantity=stockQuantity;
        this.reorderLevel=reorderLevel; this.purchasePrice=purchasePrice;
        this.sellingPrice=sellingPrice;
    }
    public Long getId(){return id;} public String getName(){return name;}
    public String getGenericName(){return genericName;} public String getCategory(){return category;}
    public String getManufacturer(){return manufacturer;} public String getBatchNumber(){return batchNumber;}
    public LocalDate getExpiryDate(){return expiryDate;} public int getStockQuantity(){return stockQuantity;}
    public int getReorderLevel(){return reorderLevel;} public double getPurchasePrice(){return purchasePrice;}
    public double getSellingPrice(){return sellingPrice;}
    public void setName(String v){name=v;} public void setGenericName(String v){genericName=v;}
    public void setCategory(String v){category=v;} public void setManufacturer(String v){manufacturer=v;}
    public void setBatchNumber(String v){batchNumber=v;} public void setExpiryDate(LocalDate v){expiryDate=v;}
    public void setStockQuantity(int v){stockQuantity=v;} public void setReorderLevel(int v){reorderLevel=v;}
    public void setPurchasePrice(double v){purchasePrice=v;} public void setSellingPrice(double v){sellingPrice=v;}
}
