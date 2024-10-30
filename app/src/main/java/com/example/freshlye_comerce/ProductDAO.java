package com.example.freshlye_comerce;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public interface ProductDAO {
    @Insert
    void insertProduct(Product product);

    @Update
    void updateProduct(Product product);

    @Delete
    void deleteProduct(Product product);

    @Query("SELECT * FROM products WHERE category_id = :categoryId")
    List<Product> getProductsByCategory(int categoryId);

    @Query("SELECT * FROM products WHERE title LIKE '%' || :search || '%' OR description LIKE '%' || :search || '%'")
    List<Product> searchProducts(String search);
}

