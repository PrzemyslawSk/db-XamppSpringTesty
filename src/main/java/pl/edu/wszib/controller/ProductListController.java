package pl.edu.wszib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.dao.IProductDAO;
import pl.edu.wszib.model.Product;


@Controller
public class ProductListController {

    @Autowired
    IProductDAO productDAO;

    @RequestMapping(value = "/productListPage", method = RequestMethod.GET)
    public String getProductsList(Model product) {

        product.addAttribute("productKey", this.productDAO.getAllProducts());

        return "productListPage";
    }
}



