package edu.tcu.cs.expensetracker.service;

import edu.tcu.cs.expensetracker.dao.ActivityDao;
import edu.tcu.cs.expensetracker.domain.Activity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ActivityService {
    private ActivityDao activityDao;

    public ActivityService(ActivityDao activityDao){
        this.activityDao = activityDao;
    }

    public List<Activity> findAll(){return activityDao.findAll();}

    public void save(Activity activity){activityDao.save(activity);}

    public void update(Activity activity){
        activityDao.save(activity);
    }

    public Activity findById(Integer id){
        return activityDao.findById(id).get();
    }

    public void deleteById(Integer id){activityDao.deleteById(id);}
}
