package SecondLab_Flyweight.Docs;

import SecondLab_Flyweight.IDoc;

public class Oncologist implements IDoc {
    @Override
    public void HealPeople() {
        System.out.println("Heal cancer");
    }
}
