package StockManagement.service;

import StockManagement.model.Stock;

import java.util.List;

/**
 * Created by Deepesh on 21/06/2016.
 */
public interface StockService {
    public void addStock(Stock sttock);
    public List<Stock> listStocks();
}
