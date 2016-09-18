package StockManagement.controller;

import StockManagement.model.Stock;
import StockManagement.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by Deepesh on 24/06/2016.
 */
@Controller
public class TradeController {

  /*  @Autowired
    private TradeService tradeService;

    @RequestMapping("/trade")
    public String ListStocks(Map<String ,Object> map){
        map.put("listStocks", new Stock());
        return "listStocks";
    }*/

}
