/**
 * @author Anna Scribner
 * @version March 11, 2025
 * <p>
 * Main class to display the OPhones classes
 */
package src;

public class Main {
    public static void main(String[] args) {
        OPhone[] oPhone = new OPhone[]{new OPhone(), new OPhone8(), new OPhone8Mini(),
                new OPhone9(), new OPhone9Max(), new OPhoneX(), new OPhoneXFilm(),
                new OPhoneXFold()};

        for (OPhone phone : oPhone) {
            System.out.println(phone);
        }
    }
}