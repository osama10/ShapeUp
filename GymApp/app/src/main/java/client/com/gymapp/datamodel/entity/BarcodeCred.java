package client.com.gymapp.datamodel.entity;

/**
 * Created by haier_1 on 6/1/2017.
 */

public class BarcodeCred {

    String formatName ;
    String content ;

    public BarcodeCred() {
    }

    public BarcodeCred(String formatName, String content) {
        this.formatName = formatName;
        this.content = content;
    }

    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
