import java.util.Map;
import java.util.Set;

public class Printer {
    public static void selectedCriteria(Map<String, Object> criterias) {
        System.out.println("\n========================= Выбранные критерии (возножно несколько!) ============================");
        
        boolean flagNull = true;
        for (var item : criterias.entrySet()){
            if (item.getValue() != null){
                System.out.print(" " + item.getKey() + ": " + item.getValue() + "  ");
                if(flagNull) flagNull = false;
            }
        }
        if(flagNull) System.out.println("Нет критериев");
        
        // System.out.println("\n=====================================================================");
    }

    public static void printAllNotebooks(Set<Notebook> nb) {
        System.out.println("=========================== Весь список ноутбуков ===================================");
        for (Notebook notebook : nb) {
            System.out.println(notebook);
        }
    }

    public static void printResultSelection(Set<Notebook> setNotebooks1_, Map<String, Object> criterias_){
        System.out.println("\n========================= Результат выборки ==============================");
                for (Notebook notebook : setNotebooks1_) {
                        if (notebook.isPassOnCriterias(criterias_)) {
                                System.out.println(notebook);
                        }
                }
                System.out.println("=========================================================================\n");
    }

}
