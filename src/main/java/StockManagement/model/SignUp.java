package StockManagement.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

/**
 * Created by Deepesh on 15/06/2016.
 */
@Entity
@Table(name="signup")
public class SignUp {
    @Id
    @Column
    private  int customerId;
    @Column
    private String customerName;
    @Column
    private String userName;
    @Column
    private String emailId;
    @Column
    private int telephone;
    @Column
    private String password;


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
