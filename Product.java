Package com.inventory.entity;
import jakarta.persistence.*;

Entity @Table(name "products")

public class Product (

@GeneratedValue(strategy GenerationType. AUTO)

private int id private String name;

private String description;

private double price private int quantity;

publ lic Product(String name, String description, double price, int quantity) ( thisnnast nase

public Product() {t

this.description description;

this.price price; this, quantity quantity:

public int getId() (return id; } public String getName() { return name;)

public void setName(String name) { this.name nase; } public String getDescription) { return description;
