package SecondLab_Flyweight.Docs;

import SecondLab_Flyweight.IDoc;

public class Surgeon implements IDoc {
    @Override
    public void HealPeople() {
        System.out.println("Heal organic");
    }
}
