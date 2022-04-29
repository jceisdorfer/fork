package edu.tcu.cs.expensetracker.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private double money;
    private String account;
    private String createtime;
    private String description;

    public Activity(int id, String flname, double money, String account, String createtime, String description) {
        this.id = id;
        this.name = flname;
        this.money = money;
        this.account = account;
        this.createtime = createtime;
        this.description = description;
    }

    public Activity() {

    }

    @Override
    public String toString() {
        return "Activity [id=" + id + ", name=" + name + ", money=" + money + ", account=" + account + ", createtime=" + createtime + ", description=" + description + "]";
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
