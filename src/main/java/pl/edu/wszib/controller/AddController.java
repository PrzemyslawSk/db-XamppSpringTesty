package pl.edu.wszib.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.dao.IProductDAO;
import pl.edu.wszib.model.Product;


@Controller
public class AddController {

    @Autowired
    IProductDAO productDAO;


    @RequestMapping(value = "/addProductPage", method = RequestMethod.GET)
    public ModelAndView addProduct() {
        return new ModelAndView("addProductPage", "productKey", new Product());
    }

    @RequestMapping(value = "/addProductPage", method = RequestMethod.POST)
    public String addProductForm(@ModelAttribute("productKey") Product product) {
        this.productDAO.saveProduct(product);
        return "index";
    }
}