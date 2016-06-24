package StockManagement.service.impl;

import StockManagement.dao.SignUpDao;
import StockManagement.model.SignUp;
import StockManagement.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Deepesh on 15/06/2016.
 */
@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private SignUpDao signUpDao;

    @Transactional
    public void addSignUp(SignUp signUp) {
        signUpDao.addSignUp(signUp);
    }
}
