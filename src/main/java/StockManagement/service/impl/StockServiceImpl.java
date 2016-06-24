package StockManagement.service.impl;

import StockManagement.dao.StockDao;
import StockManagement.model.Stock;
import StockManagement.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Deepesh on 21/06/2016.
 */

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockDao stockDao;

    @Transactional
    public void addStock(Stock stock) {
        stockDao.addStock(stock);
    }

    @Transactional
    public List<Stock> listStocks() {
        return stockDao.listStocks();
    }
}
