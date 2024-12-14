package first_project_springBoot.demoSpring.model;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Generated;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	public Product(String name, double price, String description, double rating, String category, String seller,
			int stock, int numofreview) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.rating = rating;
		this.category = category;
		this.seller = seller;
		this.stock = stock;
		this.numofreview = numofreview;
	}
	private String name;
	public Product() {
		super();
	}
	private double price;
	private String description;
	private double rating;
	private String category;
	private String seller;
	private int stock;
	private int numofreview;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getNumofreview() {
		return numofreview;
	}
	public void setNumofreview(int numofreview) {
		this.numofreview = numofreview;
	}
	
	
	
	

}
