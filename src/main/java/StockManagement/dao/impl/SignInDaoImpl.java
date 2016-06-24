package StockManagement.dao.impl;

import StockManagement.dao.SignInDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Deepesh on 19/06/2016.
 */
@Repository
public class SignInDaoImpl implements SignInDao {

    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public boolean checkLogin(String userName, String password) {
        Session session = sessionFactory.openSession();
           boolean userFound = false;

        String Sql_Query="from SignIn s where s.userName =? and s.password=?";

        Query query = session.createQuery(Sql_Query);

        query.setParameter(0,userName);
        query.setParameter(1,password);
        List list = query.list();
        if((list!=null) && (list.size()>0)){
            userFound = true;
        }
        session.close();

        return userFound;

    }
}
