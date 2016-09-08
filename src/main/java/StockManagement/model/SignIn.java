package StockManagement.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Deepesh on 19/06/2016.
 */
@Entity
public class SignIn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int userId;
    @Column
    private String userName;
    @Column
    private String password;
    @OneToMany
    @JoinColumn(name = "stockId")
    private List<Stock> stocks;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SignIn{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
