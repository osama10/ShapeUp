package client.com.gymapp.sharedresources;

import android.widget.EditText;

/**
 * Created by haier_1 on 6/1/2017.
 */

public class Singelton {
    public static  boolean isEmpty(EditText myeditText) {
        return myeditText.getText().toString().trim().length() == 0;
    }

    public static  String makeEmpty() {
        return "";
    }
}
