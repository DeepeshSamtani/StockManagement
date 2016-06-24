package StockManagement.dao.impl;

import StockManagement.dao.StockDao;
import StockManagement.model.Stock;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Deepesh on 21/06/2016.
 */
@Repository
public class StockDaoImpl implements StockDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStock(Stock stock) {
        sessionFactory.getCurrentSession().save(stock);
    }

    @Override
    public List<Stock> listStocks() {
        return sessionFactory.getCurrentSession().createQuery("from Stock").list();
    }
}
