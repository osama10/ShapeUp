package client.com.gymapp.datamodel.repo;

import java.util.ArrayList;
import java.util.List;

import client.com.gymapp.datamodel.entity.BarcodeCred;
import client.com.gymapp.datamodel.entity.Users;

/**
 * Created by haier_1 on 6/1/2017.
 */

public class UsersRepo {

    public static List<Users> getAllUsers(){

        List<Users> users = new ArrayList<Users>();

        BarcodeCred user1Cred = new BarcodeCred("UPC_A" , "036000291452");
        BarcodeCred user2Cred = new BarcodeCred("UPC_A" , "084253233163");
        BarcodeCred user3Cred = new BarcodeCred("UPC_A" , "610762569327");

        Users user1 = new Users("01" ,"Osama Bin Bashir" , "Morning" , user1Cred);
        Users user2 = new Users("02" ,"Hamza" , "Evening" , user2Cred);
        Users user3 = new Users("03" ,"Hassan" , "Evening" , user3Cred);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }


}
