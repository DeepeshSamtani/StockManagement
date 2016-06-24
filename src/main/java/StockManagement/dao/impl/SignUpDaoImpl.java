package StockManagement.dao.impl;

import StockManagement.dao.SignUpDao;
import StockManagement.model.SignUp;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Deepesh on 15/06/2016.
 */
@Repository
public class SignUpDaoImpl implements SignUpDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addSignUp(SignUp signUp) {
        sessionFactory.getCurrentSession().save(signUp);
    }
}
