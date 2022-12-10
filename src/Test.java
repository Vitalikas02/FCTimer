import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDateTime;

public class Test {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    LocalDateTime lang = TimeMath.getROLLBACK();

    String json = gson.toJson(lang);


    @Override
    public String toString(){
        return json;
    }
}
