package StockManagement.dao;

import java.sql.SQLException;

/**
 * Created by Deepesh on 19/06/2016.
 */
public interface SignInDao {

    public boolean checkLogin(String userName, String password);

}
