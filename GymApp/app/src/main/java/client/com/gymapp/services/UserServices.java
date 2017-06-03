package client.com.gymapp.services;

import java.util.ArrayList;
import java.util.List;

import client.com.gymapp.datamodel.entity.BarcodeCred;
import client.com.gymapp.datamodel.entity.Users;
import client.com.gymapp.datamodel.repo.UsersRepo;

/**
 * Created by haier_1 on 6/1/2017.
 */

public class UserServices {

    public static Users getUserByBarcodeCredentials(BarcodeCred barcodeCred){

        List<Users> listOfUsers = UsersRepo.getAllUsers();



        for(Users user : listOfUsers){

            if(user.getBarcodeCred().getFormatName().equals(barcodeCred.getFormatName()) && user.getBarcodeCred().getContent().equals(barcodeCred.getContent()) ){

                return  user ;

            }

        }

        return null;
    }
}
