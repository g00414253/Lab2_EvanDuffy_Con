package ie.atu.week3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/products")
public class ProductController {
    private List<Product> products = new ArrayList<>();

    public ProductController() {
     products.add(new Product("TV", "Made by Sony", 899, 100));
     products.add(new Product("Radio", "Made by Samsung", 99, 101));
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return products;
    }

    @PostMapping("/addProduct")
    public ResponseEntity<List> addProduct(@RequestBody Product product){
        products.add(product);
        return ResponseEntity.ok(products) ;
    }

}
