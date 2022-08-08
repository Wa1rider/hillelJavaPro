package hw9;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Москва", "Ивановы");
        map.put("Киев", "Петровы");
        map.put("Лондон", "Абрамовичи");
        map.put("Днепр", "Кравец");
        System.out.println(map.get("Лондон"));
    }
}
