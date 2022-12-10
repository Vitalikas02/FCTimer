//import java.io.IOException;
//
//public class JsonReader {
//
//    void jsonReader() throws IOException {
//
//    }
//}
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