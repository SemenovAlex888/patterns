package abstract_factorys.abstract_factory_1.buttons;

/**
 * @author Semenov Alexey
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
