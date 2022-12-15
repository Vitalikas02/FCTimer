import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsonWriter {
    public static List<DungeonData> dungeonsList = new ArrayList<>();
    public static List<QuestData> questsList = new ArrayList<>();
    public static Date date = new Date();
    public static SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static String dateOut = simpleDate.format(date);

    public void writer() throws IOException{

        dungeonsList.add(new DungeonData(1, "akra", dateOut));
        dungeonsList.add(new DungeonData(2, "akra", dateOut));
        dungeonsList.add(new DungeonData(3, "akra", dateOut));
        dungeonsList.add(new DungeonData(4, "akra", dateOut));
        dungeonsList.add(new DungeonData(5, "akra", dateOut));

        questsList.add(new QuestData(1, "bt", dateOut));
        questsList.add(new QuestData(2, "bt", dateOut));
        questsList.add(new QuestData(3, "bt", dateOut));
        questsList.add(new QuestData(4, "bt", dateOut));
        questsList.add(new QuestData(5, "bt", dateOut));

        JsonArray jsonArray = new JsonArray(dungeonsList, questsList);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter("timings.json");
            writer.write(gson.toJson(jsonArray));
            writer.close();
    }
}
