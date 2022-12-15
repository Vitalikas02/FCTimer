import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsonWriter {
    public static List<DungeonData> dungeonsList = new ArrayList<>();
    public static List<QuestData> questsList = new ArrayList<>();
    public static String dateOut = "none";
    File file = new File("timings.json");

    public static Date date = new Date();
    public static SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static String dateOutSoloWrite = simpleDate.format(date);

    public void writer() throws IOException{
        if (file.exists() && !file.isDirectory()) {
            System.out.println("Файл найден, перезаписи не будет.");
        }
        else

            System.out.println("Файл не найден, запись нового.");

        dungeonsList.add(new DungeonData(1, "akra", dateOut));
        dungeonsList.add(new DungeonData(2, "akra", dateOut));
        dungeonsList.add(new DungeonData(3, "akra", dateOut));
        dungeonsList.add(new DungeonData(4, "akra", dateOut));
        dungeonsList.add(new DungeonData(5, "akra", dateOut));
        dungeonsList.add(new DungeonData(6, "akra", dateOut));
        dungeonsList.add(new DungeonData(7, "akra", dateOut));
        dungeonsList.add(new DungeonData(8, "akra", dateOut));
        dungeonsList.add(new DungeonData(9, "akra", dateOut));
        dungeonsList.add(new DungeonData(10, "akra", dateOut));

        questsList.add(new QuestData(1, "bt", dateOut));
        questsList.add(new QuestData(2, "bt", dateOut));
        questsList.add(new QuestData(3, "bt", dateOut));
        questsList.add(new QuestData(4, "bt", dateOut));
        questsList.add(new QuestData(5, "bt", dateOut));
        questsList.add(new QuestData(6, "bt", dateOut));
        questsList.add(new QuestData(7, "bt", dateOut));
        questsList.add(new QuestData(8, "bt", dateOut));
        questsList.add(new QuestData(9, "bt", dateOut));
        questsList.add(new QuestData(10, "bt", dateOut));
        questsList.add(new QuestData(11, "bt", dateOut));
        questsList.add(new QuestData(12, "bt", dateOut));
        questsList.add(new QuestData(13, "bt", dateOut));
        questsList.add(new QuestData(14, "bt", dateOut));
        questsList.add(new QuestData(15, "bt", dateOut));
        questsList.add(new QuestData(16, "bt", dateOut));
        questsList.add(new QuestData(17, "bt", dateOut));
        questsList.add(new QuestData(18, "bt", dateOut));
        questsList.add(new QuestData(19, "bt", dateOut));
        questsList.add(new QuestData(20, "bt", dateOut));

        JsonArray jsonArray = new JsonArray(dungeonsList, questsList);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter("timings.json");
        writer.write(gson.toJson(jsonArray));
        writer.close();
    }
    public static void soloWriter() throws IOException, ParseException {
        int slotNumber = JsonReader.getDungeonMassiveNumber();
        slotNumber++;

        Object obj = new JSONParser().parse(new FileReader("timings.json"));
        JSONObject jsonObject =  (JSONObject) obj;
        JSONArray dungeonList = (JSONArray) jsonObject.get("dungeonsList");
        JSONObject dungeonObj = (JSONObject) dungeonList.get(JsonReader.getDungeonMassiveNumber());

        //Хуйня ебаная. В консоль выводит всё, всё изменяет, а в json'e всё остаётся неизменным
//        dungeonObj.put("rollback", "test");
//        dungeonObj.put("name", "test");
//        dungeonObj.put("id", 5);
//        System.out.println(dungeonObj);
        System.out.println("Значение слота " + slotNumber + " было перезаписано.");
        System.out.println("Теперь его значение: " + dateOutSoloWrite);
    }
}
