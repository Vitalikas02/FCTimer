public class QuestData {
    private int id;
    private String name;
    private String rollback;

    QuestData(int id, String name, String rollback) {
        this.id = id;
        this.name = name;
        this.rollback = rollback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "QuestData [id=" + id
                + ", name=" + name
                + ", rollback=" + rollback + "]";
    }
}
