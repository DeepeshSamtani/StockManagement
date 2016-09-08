package StockManagement.service.impl;

import StockManagement.dao.TradeDao;
import StockManagement.model.Stock;
import StockManagement.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Deepesh on 24/06/2016.
 */

@Service
public class TradeServiceImpl implements TradeService{

    @Autowired
    private TradeDao tradeDao;

    @Transactional
    public List<Stock> ListStocks() {
        return tradeDao.ListStocks();    }
}
