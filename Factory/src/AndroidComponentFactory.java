import components.Button.AndroidButton;
import components.Button.Button;
import components.Dropdown.AndroidDropdown;
import components.Dropdown.Dropdown;
import components.Menu.AndroidMenu;
import components.Menu.Menu;

public class AndroidComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
