package SecondLab_Flyweight.Docs;

import SecondLab_Flyweight.IDoc;

public class Anesthesiologist implements IDoc {
    @Override
    public void HealPeople() {
        System.out.println("Heal during the operation");
    }
}
