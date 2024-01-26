
public class Todo {
    private static int nextId = 0;
    private static int getNextId(){
        return ++nextId;
    }

    private int id;
    private String title;

    public Todo(String title) {
        this.title = title;
        id = getNextId();
    }

    public static void setNextId(int nextId) {
        Todo.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
