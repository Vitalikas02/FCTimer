public class DungeonData {
    private String id;
    private String name;
    private String rollback;

    DungeonData(String id, String name, String rollback) {
        this.id = id;
        this.name = name;
        this.rollback = rollback;
    }
    DungeonData(String rollback){
        this.rollback = rollback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRollback() {
        return rollback;
    }

    public void setRollback(String rollback) {
        this.rollback = rollback;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "QuestData [id=" + id
                + "name=" + name
                + ",rollback=" + rollback;
    }
}

