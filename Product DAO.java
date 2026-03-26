package com. Inventory.entity,

import jakarta.persistence.";

Entity

Table(name "products")

public class Product

#1d

@GeneratedValue(strategy GenerationType.AUTO)

private int id;

private String description;

private String name;

private double price; private int quantity;

Jublic Product() (

public Product(String name, String description, double price, int quantity) (

this.name name

this.description description;

this.price price: this.quantity quantity:

public int getid() { return id; }

public String getName() { return name; }

public void setName(String name) (this.name name;)

public String getDescription() { return description;)

public void setDescription(String description) { this.description description;

putilic double getprice() { return price;}}

public int getQuantity() { return quantity: public void setQuantity(int quantity) { this. quantity quantity; }

Hibernate java

public void setPrice(double price) (this.price price; }
