import java.util.ArrayList;
import java.util.List;

public class TodoList {

    // ACCESS MODIFIER
    // - WE CAN'T ACCESS OUTSIDE OF THE CLASS
    private final List<Todo> todos = new ArrayList<>();

    public TodoList() {
        todos.add(new Todo("Feed dog"));
        todos.add(new Todo("Walk dog"));
        todos.add(new NeedTodo("Learn java"));
    }

    public Todo getTodo(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    // OVERLOADING
    // SAME METHOD SIGNATURE
    // DIFFERENT PARAMETERS
    public boolean addTodo(Todo todo) {
        return todos.add(todo);
    }

    public boolean addTodo(String title) {
        if (title.equals("")) {
            return false;
        } else {
            todos.add(new Todo(title));
            return true;
        }
    }

    public boolean removeTodo() {
        todos.clear();
        return true;
    }

    public boolean removeTodo(int id) {
        int todoIndex = -1;
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId() == id) {
                todoIndex = i;
            }
        }

        if (todoIndex == -1) {
            return false;
        } else {
            todos.remove(todoIndex);
            return true;
        }
    }

    public void printTodos(){
        for (Todo todo: todos) {
            System.out.println(todo);
        }
        System.out.println("-".repeat(90));
    }

}
