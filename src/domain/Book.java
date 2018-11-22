package domain;

import org.springframework.stereotype.Component;

@Component
public class Book {
	

	
    private Integer bid;

    private String bname;

    private Float price;

    private Integer stock;

    private String image;
    
    private int category;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    @Override
    public String toString() {
	return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price
		+ ", stock=" + stock + ", image=" + image + "]";
    }

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
    
    
    
    
    
    
    
}