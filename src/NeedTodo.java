
public class NeedTodo extends Todo {
    public NeedTodo(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return "\u001B[31m" + super.toString().toUpperCase() + "\u001B[0m";
    }
}
