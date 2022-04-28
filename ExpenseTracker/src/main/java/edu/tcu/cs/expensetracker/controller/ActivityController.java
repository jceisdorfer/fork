package edu.tcu.cs.expensetracker.controller;

import edu.tcu.cs.expensetracker.domain.Activity;
import edu.tcu.cs.expensetracker.domain.Result;
import edu.tcu.cs.expensetracker.domain.StatusCode;
import edu.tcu.cs.expensetracker.service.ActivityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    private ActivityService service;

    public ActivityController(ActivityService service){
        this.service = service;
    }

    @GetMapping
    public Result findAll(){return new Result(true, StatusCode.SUCCESS, "Find All Success", service.findAll());}

    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id){
        return new Result(true, StatusCode.SUCCESS, "Find One Success", service.findById(id));
    }

    @PostMapping
    public Result save(@RequestBody Activity activity){
        service.save(activity);
        return new Result(true, StatusCode.SUCCESS, "Save Success", activity);
    }

    @PutMapping
    public Result update(@RequestBody Activity activity){
        service.update(activity);
        return new Result(true, StatusCode.SUCCESS, "Update Success", activity);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        service.deleteById(id);
        return new Result(true, StatusCode.SUCCESS, "Delete Success");
    }
}
