package cart.dto;

import cart.domain.Product;

public class ProductDto {

    private int id;
    private String name;
    private int price;
    private String imageUrl;


    public ProductDto() {
    }

    public ProductDto(int id, String name, int price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Product toEntity(){
        return new Product(id, name, price, imageUrl);
    }

}