import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    String akrDungeon = "AkrDungeon";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    Test jsonManager() throws IOException {
        File file = new File("timings.json");
//        if (file.exists() && !file.isDirectory()) {
//            System.out.println("[SYSTEM] Файл найден.");
//
//            try (FileReader reader = new FileReader("timings.json")) {
//                Test rootRead = gson.fromJson(reader, Test.class);
//                System.out.println("[READ] Значение: " + "\n" + rootRead);
//            }
//            return null;
//        }
//
//        else
            System.out.println("[SYSTEM] Файл не найден, создаём новый.");
                file.createNewFile();
            System.out.println("[SYSTEM] Новый файл создан.");

        FileWriter writer = new FileWriter("timings.json");
        writer.write(gson.toJson(TimeMath.getROLLBACK()));
        writer.close();
        System.out.println("[WRITE] Значение обновлено.");

        return null;
    }
}










//        String fileName = "timings.json";
//        Path path = Paths.get(fileName);
//        try (JsonWriter writer = new JsonWriter(Files.newBufferedWriter(path,
//                StandardCharsets.UTF_8))) {
//            writer.setIndent("  ");
//
//            writer.beginObject();
//            writer.name("dungeons");
//
//                writer.beginObject();
//                writer.name("name").value("akra");
//                writer.name("rollback").value(String.valueOf(TimeMath.getROLLBACK()));
//                writer.endObject();
//
//
//                writer.beginObject();
//                writer.name("name").value("bt");
//                writer.name("rollback").value(String.valueOf(TimeMath.getROLLBACK()));
//                writer.endObject();
//
//            writer.endObject();
//                writer.beginObject();
//                writer.name("name").value("rh");
//                writer.name("rollback").value(String.valueOf(TimeMath.getROLLBACK()));
//                writer.endObject();




//    private String ROLLBACK1 = "1211" ;
//
//    public JsonWriter(String ROLLBACK) {
//        this.ROLLBACK1 = ROLLBACK1;
//    }
//
//    @Override
//        public String toString() {
//            return new StringBuilder().append("Rollbacks{").append("ROLLBACK: ")
//                    .append(ROLLBACK1).append("}").toString();
//        }
//            String json_string = "{\"firstName\":\"Tom\", \"lastName\": \"Broody\"}";
//
//            Gson gson = new Gson();
//            JsonWriter user = gson.fromJson(json_string, JsonWriter.class);

//        Gson gson = new Gson();
//        File file = new File("test.json");
//
//        if (file.exists() && file.isDirectory()) {
//            System.out.println("[SYSTEM] Файл не был найден.");
//            file.createNewFile();
//            System.out.println("[SYSTEM] Создан новый файл.");
//            new JsonWriter();
//
//            try (
//                FileWriter writer = new FileWriter("test.json")) {
//                String rootWrite = gson.toJson(writer, Root.class);
//
//                System.out.println("[SYSTEM] Значение записано");
//            } catch (Exception e1) {
//                System.out.println("Parsing error " + e1.toString());
//            }
//        }
//        return null;
//    }