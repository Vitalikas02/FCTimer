import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;


public class JsonReader {
    public static int dungeonMassiveNumber = 0;

    void jsonReader() throws IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader("timings.json"));
        JSONObject jsonObject =  (JSONObject) obj;
        JSONArray dungeonList = (JSONArray) jsonObject.get("dungeonsList");
        JSONObject dungeonObj = (JSONObject) dungeonList.get(dungeonMassiveNumber);

        String rollback = (String) dungeonObj.get("rollback");
        if (Objects.equals(rollback, "none")){
            JsonWriter.soloWriter();
        }
    }



    public static int getDungeonMassiveNumber() {
        return dungeonMassiveNumber;
    }

    public static void setDungeonMassiveNumber(int dungeonMassiveNumber) {
        JsonReader.dungeonMassiveNumber = dungeonMassiveNumber;
    }
}
//
//
//
//
//
//




//        File file = new File("test.json");
//        Gson gson = new Gson();
//
//        try (FileReader reader = new FileReader("test.json")) {
//            System.out.println("[SYSTEM] Файл найден.");
//
//            Root rootRead = gson.fromJson(reader, Root.class);
//            System.out.println("[SYSTEM] Значение: " + rootRead.toString());
//
//            return rootRead;
//        } catch (Exception e) {
//            System.out.println("[ERROR] " + e.toString());
//        }
//        return null;
//    }
//

//
//        if (file.exists() && !file.isDirectory()) {
//            System.out.println("[SYSTEM] Файл найден.");
//            FileReader fr = new FileReader(file);
//            char[] buf = new char[256];
//            int c;
//            while((c = fr.read(buf))>0){
//
//                if(c < 256){
//                    buf = Arrays.copyOf(buf, c);
//                }
//                System.out.println("[SYSTEM] Прочитанное значение: ");
//                System.out.print(buf);
//            }
//        }
//        else {
//            file.createNewFile();
//            FileWriter writer = new FileWriter(file);
//            StringWriter stringWriter = new StringWriter();
//            ObjectMapper mapper = new ObjectMapper();
//            mapper.writeValue(stringWriter, jsonRollback);
//            LocalDateTime result = JsonRollback.akrDungeon;
//            result.toString();
//            writer.write(String.valueOf(result) + "\n");
//            writer.flush();
//            writer.close();
//            System.out.println("[SYSTEM] Файл создан, значение записано." + "\n");
//            }
//        }
//    @JsonAutoDetect
//    static
//    class JsonRollback {
//        public static LocalDateTime akrDungeon = TimeMath.getROLLBACK();
//    }
//}