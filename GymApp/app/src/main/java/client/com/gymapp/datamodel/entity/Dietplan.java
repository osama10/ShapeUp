package client.com.gymapp.datamodel.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haier_1 on 6/3/2017.
 */

public class Dietplan {

    List <String> weeklyPlan = new ArrayList<String>();



    public Dietplan(List<String> weeklyPlan) {
        this.weeklyPlan = weeklyPlan;
    }

    public Dietplan() {
    }

    public List<String> getWeeklyPlan() {
        return weeklyPlan;
    }

    public void setWeeklyPlan(List<String> weeklyPlan) {
        this.weeklyPlan = weeklyPlan;
    }
}
