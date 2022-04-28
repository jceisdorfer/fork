package edu.tcu.cs.expensetracker.datainitializer;

import edu.tcu.cs.expensetracker.dao.ActivityDao;
import edu.tcu.cs.expensetracker.domain.Activity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {
    private ActivityDao activityDao;

    public DBDataInitializer(ActivityDao activityDao){
        this.activityDao = activityDao;
    }

    @Override
    public void run(String... args) throws Exception{
        Activity a1 = new Activity();
        a1.setId(1);
        a1.setName("Dining Spending");
        a1.setMoney(247);
        a1.setAccount("Chase Bank Credit Card");
        a1.setCreatetime("2016-03-02");
        a1.setDescription("Dutch Burger");

        Activity a2 = new Activity();
        a2.setId(2);
        a2.setName("Salary Income");
        a2.setMoney(3000);
        a2.setAccount("Cash");
        a2.setCreatetime("2016-03-15");
        a2.setDescription("September Salary");

        Activity a3 = new Activity();
        a3.setId(3);
        a3.setName("Books Spending");
        a3.setMoney(200);
        a3.setAccount("Cash");
        a3.setCreatetime("2016-04-02");
        a3.setDescription("Calculus Book");

        Activity a4 = new Activity();
        a4.setId(4);
        a4.setName("Dining Spending");
        a4.setMoney(325);
        a4.setAccount("Cash");
        a4.setCreatetime("2016-06-18");
        a4.setDescription("Eat at TCU Cafe");

        Activity a5 = new Activity();
        a5.setId(5);
        a5.setName("Stock Income',");
        a5.setMoney(8000);
        a5.setAccount("WellsFargo Saving Account");
        a5.setCreatetime("2016-10-28");
        a5.setDescription("Apple Stock is great!");

        Activity a6 = new Activity();
        a6.setId(6);
        a6.setName("Stock Income");
        a6.setMoney(5000);
        a6.setAccount("WellsFargo Saving Account");
        a6.setCreatetime("2016-10-28");
        a6.setDescription("Oracle Stock is great!");

        Activity a7 = new Activity();
        a7.setId(7);
        a7.setName("Salary Income");
        a7.setMoney(3000);
        a7.setAccount("ChaseBank Saving Account");
        a7.setCreatetime("2016-10-28");
        a7.setDescription("Oct Salary time!");

        Activity a8 = new Activity();
        a8.setId(8);
        a8.setName("Clothes Spending");
        a8.setMoney(5000);
        a8.setAccount("Cash");
        a8.setCreatetime("2016-10-28");
        a8.setDescription("JCrew again");

        Activity a9 = new Activity();
        a9.setId(9);
        a9.setName("Other Spending");
        a9.setMoney(20);
        a9.setAccount("Cash");
        a9.setCreatetime("2016-10-29");
        a9.setDescription("Lost 20 bucks in library. :(");

        Activity a10 = new Activity();
        a10.setId(10);
        a10.setName("Gas Spending");
        a10.setMoney(1200);
        a10.setAccount("ChaseBank Credit Card");
        a10.setCreatetime("2016-10-29");
        a10.setDescription("Gas is so expensive");

        Activity a11 = new Activity();
        a11.setId(11);
        a11.setName("Dining Spending");
        a11.setMoney(1000);
        a11.setAccount("ChaseBank Debit Card");
        a11.setCreatetime("2016-10-29");
        a11.setDescription("Eat eat eat");

        Activity a12 = new Activity();
        a12.setId(12);
        a12.setName("Salary Income");
        a12.setMoney(3000);
        a12.setAccount("ChaseBank Saving Account");
        a12.setCreatetime("2016-10-30");
        a12.setDescription("Nov salary");

        Activity a13 = new Activity();
        a13.setId(13);
        a13.setName("Flight Ticket Spending");
        a13.setMoney(500);
        a13.setAccount("ChaseBank Debit Card");
        a13.setCreatetime("2016-10-30");
        a13.setDescription("Fly to LA");

        Activity a14 = new Activity();
        a14.setId(14);
        a14.setName("Salary Income");
        a14.setMoney(3000);
        a14.setAccount("ChaseBank Saving Account");
        a14.setCreatetime("2016-10-30");
        a14.setDescription("December Salary");

        activityDao.save(a1);
        activityDao.save(a2);
        activityDao.save(a3);
        activityDao.save(a4);
        activityDao.save(a5);
        activityDao.save(a6);
        activityDao.save(a7);
        activityDao.save(a8);
        activityDao.save(a9);
        activityDao.save(a10);
        activityDao.save(a11);
        activityDao.save(a12);
        activityDao.save(a13);
        activityDao.save(a14);
    }
}
