package cart.controller;


import cart.domain.Product;
import cart.service.MemberShipService;
import cart.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SpringCartController {

    private ProductService productService;

    public SpringCartController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("products", productService.showProduct());
        return "index";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("products", productService.showProduct());
        return "admin";
    }

    @PostMapping("/createProduct")
    public ResponseEntity createProduct(@RequestBody Product product) {
        productService.createProduct(product);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/removeProduct")
    public ResponseEntity deleteProduct(@RequestBody Product product) {
        productService.deleteProduct(product);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/changeProduct")
    public ResponseEntity<Integer> updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        return new ResponseEntity(HttpStatus.OK);
    }

}
