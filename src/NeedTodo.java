// EXTENDS
public class NeedTodo extends Todo {

    public NeedTodo(String title) {
        super(title);
    }

    @Override
    protected String capitaliseTitle(String title) {
        return "OVERRIDDEN METHOD";
    }

    @Override
    public String toString() {
        return "\u001B[31m" + super.toString().toUpperCase() + "\u001B[0m";
    }

    public String toString(int number){
        return toString().repeat(number);
    }

    // UTILITY
    // - DOESNT MAKE SENSE FOR EVERY OBJECT TO HAVE THIS METHOD
    // - ONE METHOD ON THE CLASS
    public static NeedTodo createNeedTodo(Todo todo){
        return new NeedTodo(todo.getTitle());
    }
}
