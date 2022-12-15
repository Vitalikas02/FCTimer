import java.util.List;

public class JsonArray {
    List<DungeonData> dungeonsList;
    List<QuestData> questsList;


    JsonArray(List<DungeonData> dungeonsList, List<QuestData> questsList){
        this.dungeonsList = dungeonsList;
        this.questsList = questsList;
    }
    public List<DungeonData> getDungeons() {
        return dungeonsList;
    }

    public void setDungeons(List<DungeonData> dungeons) {
        this.dungeonsList = dungeons;
    }

    public List<QuestData> getQuests() {
        return questsList;
    }

    public void setQuests(List<QuestData> quests) {
        this.questsList = quests;
    }

    @Override
    public String toString() {
        return "JsonArray [DungeonData=" + dungeonsList
                + ", QuestData=" + questsList + "]";
    }
}
