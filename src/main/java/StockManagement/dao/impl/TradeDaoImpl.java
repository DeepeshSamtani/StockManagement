package StockManagement.dao.impl;

import StockManagement.dao.TradeDao;
import StockManagement.model.Stock;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Deepesh on 24/06/2016.
 */

@Repository
public class TradeDaoImpl implements TradeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Stock> ListStocks() {
        Criteria criteria = sessionFactory.createCriteria(Stock.class).setProjection(Projections.projectionList().add(Projections.property("stockname"),"stockname")).setResultTransformer(Transformers.aliasToBean(Stock.class));
        List<Stock> list = criteria.list();
        return list;
    }
}
