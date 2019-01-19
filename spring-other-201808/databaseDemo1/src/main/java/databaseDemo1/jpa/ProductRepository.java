package databaseDemo1.jpa;
import org.springframework.data.repository.CrudRepository;
import databaseDemo1.model.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
