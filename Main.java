import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //==================== Инициализация объектов Notebook ===============================================
        Notebook notebook1 = new Notebook(
                new Cpu("AMD Ryzen 3", 2500),
                new Ram("Good Memory", 8),
                new Hdd("Seagate", 2000),
                "Free OS",
                "Black",
                "Hulk-522");

        Notebook notebook2 = new Notebook(
                new Cpu("AMD Ryzen 3", 2500),
                new Ram("Good Memory", 8),
                new Hdd("Seagate", 2000),
                "Free OS",
                "Black",
                "Hulk-522");

        Notebook notebook3 = new Notebook(
                new Cpu("Intel i3", 2500),
                new Ram("Good Memory", 16),
                new Hdd("Seagate", 1000),
                "Free OS",
                "Black",
                "Hulk-12");

        Notebook notebook4 = new Notebook(
                new Cpu("AMD Ryzen 5", 3500),
                new Ram("Fast Memory", 32),
                new Hdd("Maxtor", 4000),
                "Windows11",
                "White",
                "Hulk-9022");

        Notebook notebook5 = new Notebook(
                new Cpu("Intel i3", 2500),
                new Ram("Good Memory", 16),
                new Hdd("Seagate", 1000),
                "Free OS",
                "Red",
                "Hulk-5702");

        Notebook notebook6 = new Notebook(
                new Cpu("AMD Ryzen 5", 3500),
                new Ram("Fast Memory", 32),
                new Hdd("Maxtor", 4000),
                "Linux",
                "White",
                "Hulk-978");

 //======================== Заполнение множества из объектов Notebook ============================
        Set<Notebook> setNotebooks = new HashSet<>();

        setNotebooks.add(notebook1);
        setNotebooks.add(notebook2);
        setNotebooks.add(notebook3);
        setNotebooks.add(notebook4);
        setNotebooks.add(notebook5);
        setNotebooks.add(notebook6);

//================================================================================================
         //System.out.println(""+ notebook1+"\n" + notebook2);
        //System.out.println(setNotebooks);
        for (Notebook notebook : setNotebooks) {
            System.out.println(notebook);
        }
    }
}
