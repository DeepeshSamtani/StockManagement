package StockManagement.controller;

import StockManagement.model.Stock;
import StockManagement.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Deepesh on 21/06/2016.
 */
@Controller
public class StockController {

    @Autowired
    private StockService stockService;

    @RequestMapping("/stock")
    public String listStock(Map<String,Object> map){
        map.put("stock",new Stock());
        return "stock";
    }
    @RequestMapping(value = "/addStock", method = RequestMethod.POST)
    public String addStock(@ModelAttribute ("stock") Stock stock,BindingResult result){
        stockService.addStock(stock);
        return "redirect:stock";
    }


}
