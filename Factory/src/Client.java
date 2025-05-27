import components.Button.AndroidButton;
import components.Button.Button;
import components.Dropdown.Dropdown;
import components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        /*
        String str = "Android";
        AndroidComponentFactory factory = new AndroidComponentFactory();  // Now, its important to hide from the user, that which factory is being used, whether it's AndroidComponentFactory or IOSComponentFactory
        Button b = factory.createButton();
        Dropdown d = factory.createDropdown();
        Menu m = factory.createMenu();
         */

        String str = "Android";  // Will get this from environmental variables
        Platform p = Platform.getPlatform(str);   // returns an Android object
        UIComponentFactory f = p.createUIComponentFactory();  // returns AndroidComponentFactory
        Button b = f.createButton();   // returns Android Button
        Dropdown d = f.createDropdown();  // returns Android Dropdown
        Menu m = f.createMenu();  // returns Android Menu
    }
}
