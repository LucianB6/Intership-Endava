import java.util.List;

public class Shop {
    private String shop;
    private int year;
    private List<Products> products;

    public Shop(String shop, List<Products> products, int year) {
        this.shop = shop;
        this.products = products;
        this.year = year;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shop='" + shop + '\'' +
                ", year=" + year +
                ", products=" + products +
                '}';
    }
}

