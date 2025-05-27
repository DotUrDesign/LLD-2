import components.Button.Button;
import components.Dropdown.Dropdown;
import components.Menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
