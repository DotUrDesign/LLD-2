import components.Button.Button;
import components.Button.IOSButton;
import components.Dropdown.Dropdown;
import components.Dropdown.IOSDropdown;
import components.Menu.IOSMenu;
import components.Menu.Menu;

public class IOSComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
