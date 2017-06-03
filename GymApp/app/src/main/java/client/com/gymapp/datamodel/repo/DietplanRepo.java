package client.com.gymapp.datamodel.repo;

import java.util.ArrayList;
import java.util.List;

import client.com.gymapp.datamodel.entity.Dietplan;

/**
 * Created by haier_1 on 6/3/2017.
 */

public class DietplanRepo {

    public static List<Dietplan> getWeeklyDietPlan(){

        List <Dietplan> weeklyPlan = new ArrayList<Dietplan>();

        List <String> sunPlan = new ArrayList<String>();
        sunPlan.add("1 : Eat 500 gram protiens");
        sunPlan.add("2 : Drink 1 litre milk");
        Dietplan  sun = new Dietplan(sunPlan);

        List <String> monPlan = new ArrayList<String>();
        monPlan.add("1 : Eat 10 boiled eggs ");
        monPlan.add("2 : Drink 1 litre milk");
        Dietplan  mon = new Dietplan(monPlan);

        List <String> tuePlan = new ArrayList<String>();
        tuePlan.add("1 : Eat 10 boiled eggs ");
        tuePlan.add("2 : Drink 1 litre protein shake");
        Dietplan  tue = new Dietplan(tuePlan);

        List <String> wedPlan = new ArrayList<String>();
        wedPlan.add("1 : Eat 1kg boiled chiken");
        wedPlan.add("2 : Drink 1 litre milk");
        Dietplan  wed = new Dietplan(wedPlan);

        List <String> thuPlan = new ArrayList<String>();
        thuPlan.add("1 : Eat 1kg boiled chiken");
        thuPlan.add("2 : Eat 1kg boiled liver");
        Dietplan  thu = new Dietplan(thuPlan);

        List <String> friPlan = new ArrayList<String>();
        friPlan.add("1 : Eat 10 boiled eggs protiens");
        friPlan.add("2 : Drink 2 litre milk");
        Dietplan  fri = new Dietplan(friPlan);

        List <String> satPlan = new ArrayList<String>();
        satPlan.add("1 : Eat 10 boiled eggs protiens");
        satPlan.add("2 : Drink 1 litre milk");
        Dietplan  sat = new Dietplan(satPlan);

        weeklyPlan.add(sun);
        weeklyPlan.add(mon);
        weeklyPlan.add(tue);
        weeklyPlan.add(wed);
        weeklyPlan.add(thu);
        weeklyPlan.add(fri);
        weeklyPlan.add(sat);

        return weeklyPlan;
    }
}
