
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
        public static void main(String[] args) {
                Set<Notebook> setNotebooks1 = initObjectsNotebook();
                Printer.printAllNotebooks(setNotebooks1);
                Printer.printSelectCriterias();
                Map<String, String> criterias = initCriteriasForNotebook();
                Printer.printAllNotebooks(setNotebooks1);
                Printer.printSelectedCriteria(criterias);
                Printer.printResultSelection(setNotebooks1, criterias);
        }

        public static Set<Notebook> initObjectsNotebook() {
                Set<Notebook> setNotebooks = new HashSet<>();
                Notebook notebook1 = new Notebook(
                                new Cpu("AMD Ryzen 3", 2500),
                                new Ram("Good Memory", 8),
                                new Hdd("Seagate", 2),
                                "Free OS",
                                "Black",
                                "Hulk-522");
                setNotebooks.add(notebook1);

                Notebook notebook2 = new Notebook(
                                new Cpu("AMD Ryzen 3", 2500),
                                new Ram("Good Memory", 8),
                                new Hdd("Seagate", 2),
                                "Free OS",
                                "Black",
                                "Hulk-522");

                setNotebooks.add(notebook2);

                Notebook notebook3 = new Notebook(
                                new Cpu("Intel i3", 2500),
                                new Ram("Good Memory", 16),
                                new Hdd("Seagate", 1),
                                "Free OS",
                                "Black",
                                "Hulk-12");

                setNotebooks.add(notebook3);

                Notebook notebook4 = new Notebook(
                                new Cpu("AMD Ryzen 5", 3500),
                                new Ram("Fast Memory", 32),
                                new Hdd("Maxtor", 8),
                                "Windows11",
                                "White",
                                "Hulk-9022");

                setNotebooks.add(notebook4);

                Notebook notebook5 = new Notebook(
                                new Cpu("Intel i3", 2500),
                                new Ram("Good Memory", 16),
                                new Hdd("Seagate", 1),
                                "Free OS",
                                "Red",
                                "Hulk-5702");

                setNotebooks.add(notebook5);

                Notebook notebook6 = new Notebook(
                                new Cpu("AMD Ryzen 5", 3500),
                                new Ram("Fast Memory", 32),
                                new Hdd("Maxtor", 4),
                                "Linux",
                                "White",
                                "Hulk-978");

                setNotebooks.add(notebook6);
                return setNotebooks;
        }

        public static Map<String, String> initCriteriasForNotebook() {
                String[] arrKeys = { "color", "os", "name", "nameCpu", "nameRam", "nameHdd", "frequencyСpu", "volumeRam", "volumeHdd" };
                Map<String, String> criterias = new HashMap<>();
                for (String s : arrKeys) {
                        criterias.put(s, null);
                }
                String strNumCtriteria = "";
                String strValue = "";
                Scanner scan = new Scanner(System.in);
                while (true) {
                        if (strValue.equals(""))
                                System.out.print("Ввод: ");
                        else
                                System.out.print("Еще критерий?  (клавиши 0-8 или 9-вывода результата) ");
                        strNumCtriteria = scan.nextLine();
                        Integer index = Integer.parseInt(strNumCtriteria);
                        if (strNumCtriteria.equals("9"))
                                break;
                        System.out.print("значение  для \"" + arrKeys[index] + "\": ");
                        strValue = scan.nextLine();
                        criterias.put(arrKeys[index], strValue);
                }
                scan.close();
                return criterias;
        }

       
        

}
