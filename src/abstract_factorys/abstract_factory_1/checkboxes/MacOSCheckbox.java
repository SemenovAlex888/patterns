package abstract_factorys.abstract_factory_1.checkboxes;

/**
 * @author Semenov Alexey
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
