//package SecondLab_Flyweight;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        DocFactory docFactory = new DocFactory();
//
//        List<IDoc> docs = new ArrayList<>();
//
//
//        for (int i = 0; i< 3; i++){
//            docs.add(docFactory.getDocBySpecialty("Anesthesiologist"));
//        }
//        for (int i = 0; i< 3; i++){
//            docs.add(docFactory.getDocBySpecialty("Nurse"));
//        }
//        for (int i = 0; i< 3; i++){
//            docs.add(docFactory.getDocBySpecialty("Oncologist"));
//        }
//        for (int i = 0; i< 3; i++){
//            docs.add(docFactory.getDocBySpecialty("Surgeon"));
//        }
//
//
//        for(IDoc doc: docs){
//            doc.HealPeople();
//        }
//
//    }
//
//}
