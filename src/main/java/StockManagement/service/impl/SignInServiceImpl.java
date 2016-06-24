package StockManagement.service.impl;

import StockManagement.dao.SignInDao;
import StockManagement.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Created by Deepesh on 19/06/2016.
 */
@Service
public class SignInServiceImpl implements SignInService{

    @Autowired
    private SignInDao signInDao;

    @Override
    public boolean checkLogin(String userName, String password) {
        return signInDao.checkLogin(userName,password);
    }
}
