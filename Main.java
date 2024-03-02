import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
        public static void main(String[] args) {         
                Set<Notebook> setNotebooks1 = initObjectsNotebook();
                Printer.printAllNotebooks(setNotebooks1);
                Map<String, Object> criterias = initCriteriasForNotebook();
                Printer.selectedCriteria(criterias);
                Printer.printResultSelection(setNotebooks1, criterias);             
        }

        public static Set<Notebook> initObjectsNotebook() {
                Set<Notebook> setNotebooks = new HashSet<>();
                Notebook notebook1 = new Notebook(
                                new Cpu("AMD Ryzen 3", 2500),
                                new Ram("Good Memory", 8),
                                new Hdd("Seagate", 2000),
                                "Free OS",
                                "Black",
                                "Hulk-522");
                setNotebooks.add(notebook1);

                Notebook notebook2 = new Notebook(
                                new Cpu("AMD Ryzen 3", 2500),
                                new Ram("Good Memory", 8),
                                new Hdd("Seagate", 2000),
                                "Free OS",
                                "Black",
                                "Hulk-522");

                setNotebooks.add(notebook2);

                Notebook notebook3 = new Notebook(
                                new Cpu("Intel i3", 2500),
                                new Ram("Good Memory", 16),
                                new Hdd("Seagate", 1000),
                                "Free OS",
                                "Black",
                                "Hulk-12");

                setNotebooks.add(notebook3);

                Notebook notebook4 = new Notebook(
                                new Cpu("AMD Ryzen 5", 3500),
                                new Ram("Fast Memory", 32),
                                new Hdd("Maxtor", 4000),
                                "Windows11",
                                "White",
                                "Hulk-9022");

                setNotebooks.add(notebook4);

                Notebook notebook5 = new Notebook(
                                new Cpu("Intel i3", 2500),
                                new Ram("Good Memory", 16),
                                new Hdd("Seagate", 1000),
                                "Free OS",
                                "Red",
                                "Hulk-5702");

                setNotebooks.add(notebook5);

                Notebook notebook6 = new Notebook(
                                new Cpu("AMD Ryzen 5", 3500),
                                new Ram("Fast Memory", 32),
                                new Hdd("Maxtor", 4000),
                                "Linux",
                                "White",
                                "Hulk-978");

                setNotebooks.add(notebook6);
                return setNotebooks;
        }

        public static Map<String, Object> initCriteriasForNotebook() {
                Map<String, Object> criterias = new HashMap<>();
                criterias.put("os", null);
                criterias.put("name", null);
                criterias.put("nameCpu", null);
                criterias.put("nameRam", null);
                criterias.put("nameHdd", null);
                criterias.put("frequencyСpu", null);
                criterias.put("volumeRam", null);
                criterias.put("volumeHdd", 2000);
                return criterias;
        }

}
