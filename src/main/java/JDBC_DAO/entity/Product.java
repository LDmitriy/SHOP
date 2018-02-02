
package JDBC_DAO.entity;

/**
 *
 * @author Noga
 */
public class Product {
    
    private int productId;
    private int price;
    private String productName;
    private String productCategory;
    private String description;
    private String brande;
    

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getBrande() {
        return brande;
    }

    public void setBrande(String brande) {
        this.brande = brande;
    }
    
    
    
}
