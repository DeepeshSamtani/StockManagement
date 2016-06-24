package StockManagement.controller;

import StockManagement.model.Stock;
import StockManagement.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import StockManagement.model.Stock;

import java.util.Map;

/**
 * Created by Deepesh on 23/06/2016.
 */
@Controller
public class MarketWatchController {

    @Autowired
    private StockService stockService;

    @RequestMapping("/marketWatch")
    public String showMarketWatchForm(Map<String,Object> map){
        map.put("stock",new Stock());
        map.put("stockList",stockService.listStocks());
        return "marketWatch";
    }
}
