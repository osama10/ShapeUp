package client.com.gymapp.services;

import java.util.List;

import client.com.gymapp.datamodel.entity.Dietplan;
import client.com.gymapp.datamodel.repo.DietplanRepo;

/**
 * Created by haier_1 on 6/3/2017.
 */

public class DietplanServices {

    public static Dietplan getDailyDietPlan(String day){

        List <Dietplan> weeklyPlan = DietplanRepo.getWeeklyDietPlan();

        if(day == "sun"){
            return weeklyPlan.get(0);
        }

        else if(day == "mon"){
            return weeklyPlan.get(1);
        }

       else if(day == "tue"){
            return weeklyPlan.get(2);
        }

        else if(day == "wed"){
            return weeklyPlan.get(3);
        }

        else if(day == "thu"){
            return weeklyPlan.get(4);
        }

        else if(day == "fri"){
            return weeklyPlan.get(5);
        }

        else {
            return weeklyPlan.get(6);
        }


    }
}
