package service;

import model.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    private List<Product> productList;

    public ProductService() {
        this.productList = new ArrayList<>();
    }

    // Thêm sản phẩm
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Xóa
    public boolean deleteProduct(String productId) {
        return productList.removeIf(p -> p.getId().equals(productId));
    }

    // Cập nhật thông tin sản phẩm
    public boolean updateProduct(Product updatedProduct) {
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.getId().equals(updatedProduct.getId())) {
                productList.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }

    // Tìm kiếm theo tên (gần đúng)
    public List<Product> searchByName(String keyword) {
        return productList.stream()
                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Lấy danh sách tất cả sản phẩm
    public List<Product> getAllProducts() {
        return new ArrayList<>(productList);
    }

    // Cảnh báo sản phẩm sắp hết hạn
    public List<Product> getExpiringSoon(Date currentDate, int daysThreshold) {
        long thresholdMillis = daysThreshold * 24L * 60 * 60 * 1000;
        return productList.stream()
                .filter(p -> {
                    long timeDiff = p.getExpirationDate().getTime() - currentDate.getTime();
                    return timeDiff > 0 && timeDiff <= thresholdMillis;
                })
                .collect(Collectors.toList());
    }

    // Cảnh báo sản phẩm sắp hết hàng
    public List<Product> getLowStock(int minQuantity) {
        return productList.stream()
                .filter(p -> p.getQuantity() <= minQuantity)
                .collect(Collectors.toList());
    }

    // Tìm sản phẩm theo ID
    public Product findById(String id) {
        return productList.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
