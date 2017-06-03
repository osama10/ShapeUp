package client.com.gymapp.datamodel.entity;

/**
 * Created by haier_1 on 6/1/2017.
 */

public class Users {

    private String uID ;
    private String name;
    private String shift;
    BarcodeCred barcodeCred;

    public Users() {
    }

    public Users(String uID, String name, String shift, BarcodeCred barcodeCred) {
        this.uID = uID;
        this.name = name;
        this.shift = shift;
        this.barcodeCred = barcodeCred;
    }

    public BarcodeCred getBarcodeCred() {
        return barcodeCred;
    }

    public void setBarcodeCred(BarcodeCred barcodeCred) {
        this.barcodeCred = barcodeCred;
    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
