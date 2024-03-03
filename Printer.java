import java.util.Map;
import java.util.Set;

public class Printer {
    public static void printSelectedCriteria(Map<String, String> criterias) {
        System.out.println("\n================================================ Выбранные критерии ========================================================");
        
        boolean flagNull = true;
        for (var item : criterias.entrySet()){
            if (item.getValue() != null){
                System.out.print(" " + item.getKey() + ": " + item.getValue() + "  ");
                if(flagNull) flagNull = false;
            }
        }
        if(flagNull) System.out.println("Нет критериев");
    }

    public static void printAllNotebooks(Set<Notebook> nb) {
        System.out.println("================================================== Весь список ноутбуков ==================================================");
        for (Notebook notebook : nb) {
            System.out.println(notebook);
        }
        System.out.println("===========================================================================================================================");
    }

    public static void printResultSelection(Set<Notebook> setNotebooks1_, Map<String, String> criterias_){
       
        System.out.println("\n=========================================== Результат выборки ==============================================================");
                for (Notebook notebook : setNotebooks1_) {
                        if (notebook.isPassOnCriterias(criterias_)) {
                        
                                System.out.println(notebook);
                        }
                }
                System.out.println("=============================================================================================================================\n");
       
    }

    public static void printSelectCriterias(){
        System.out.println("\nВыберете критерий для фильтрации ноутбуков, нажмите клавишу от \"0\" до \"9\":\n" +
        "0-цвет (color)   1-OC (os)   2-название ноутбука (name)  3-название поцессора (nameCpu)   4-название памяти (nameRam)\n"+
        "5-название ЖД (nameHdd)   6-частота процессора (frequencyСpu)   7-объем памяти (volumeRam)   8-объем ЖД (volumeHdd)   9-ВЫВОД РЕЗУЛЬТАТА" );
    }
}
