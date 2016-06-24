package StockManagement.dao;

import StockManagement.model.Stock;

import java.util.List;

/**
 * Created by Deepesh on 21/06/2016.
 */
public interface StockDao {

    public void addStock(Stock stock);
    public List<Stock> listStocks();

}
