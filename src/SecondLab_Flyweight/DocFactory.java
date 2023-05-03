package SecondLab_Flyweight;

import SecondLab_Flyweight.Docs.Anesthesiologist;
import SecondLab_Flyweight.Docs.Nurse;
import SecondLab_Flyweight.Docs.Oncologist;
import SecondLab_Flyweight.Docs.Surgeon;

import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;

public class DocFactory {
    private static final Map<String, IDoc> docs = new HashMap<>();
    public IDoc getDocBySpecialty(String specialty){
        IDoc doc = docs.get(specialty);
        if(doc == null){
            switch (specialty){
                case "Anesthesiologist":
                    System.out.println("Call anesthesiologist");
                    doc = new Anesthesiologist();
                    break;
                case "Nurse":
                    System.out.println("Call Nurse");
                    doc = new Nurse();
                    break;
                case "Oncologist":
                    System.out.println("Call Oncologist");
                    doc = new Oncologist();
                    break;
                case "Surgeon":
                    System.out.println("Call Surgeon");
                    doc = new Surgeon();
                    break;
            }
            docs.put(specialty, doc);
        }
        return doc;
    }
}
