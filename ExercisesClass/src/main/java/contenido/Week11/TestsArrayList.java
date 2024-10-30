package contenido.Week11;

import java.util.ArrayList;

public class TestsArrayList {
    public static void main(String[] args) {
        ArrayList<String> apps = new ArrayList<>();
        System.out.println("Initial size: " + apps.size());
        apps.add("IntelliJ IDEA");
        apps.add("Microsoft Word");

        for (String app : apps) {
            System.out.println(app);
        }
    }
}
