package StockManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Deepesh on 21/06/2016.
 */
@Entity
public class Stock {

    public Stock() {
    }

    public Stock(int stockId, String stockName){
        this.stockId = stockId;
        this.stockName=stockName;
    }



    @Id
    @Column
    private int stockId;
    @Column
    private String stockName;
    @Column
    private String stockValue;
    @Column
    private int stockQantity;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getStockQantity() {
        return stockQantity;
    }

    public void setStockQantity(int stockQantity) {
        this.stockQantity = stockQantity;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockValue() {
        return stockValue;
    }

    public void setStockValue(String stockValue) {
        this.stockValue = stockValue;
    }

}
