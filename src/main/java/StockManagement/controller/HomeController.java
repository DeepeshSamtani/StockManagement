package StockManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Deepesh on 24/06/2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/market", method = RequestMethod.GET)
    public String showMarketWatchPage(){
        return "marketWatch";
    }

    @RequestMapping(value = "/portfolio", method = RequestMethod.GET)
    public String showPortfolioPage(){
        return "portfolio";
    }

    @RequestMapping(value = "/fundTransfer", method = RequestMethod.GET)
    public String showFundTransferPage(){
        return "fundTransfer";
    }

    @RequestMapping(value = "trade", method = RequestMethod.GET)
    public String showTradePage(){
        return "trade";
    }
}
