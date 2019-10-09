
package testingwithhsqldb;

/**
 * Correspond à l'enregistrement d'un produit
 */
public class ProductEntity {
    private int id;
    private String name;
    private int price;
    
    public ProductEntity(int productId, String productName, int productPrice) {
        this.id = productId;
        this.name = productName;
        this.price = productPrice;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
}
