package databaseDemo1.Dao;

import databaseDemo1.jpa.ProductRepository;
import databaseDemo1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;


public class ProductDao {
    @Autowired
    private ProductRepository repository;

    public Product getProduct(int id){
        return repository.findById(id).get();
    }
}
