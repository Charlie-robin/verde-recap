
public class Main {
    public static void main(String[] args) {
        // ENCAPSULATION
        TodoList todoList = new TodoList();
        todoList.printTodos();
        Todo todoOne = todoList.getTodo(1);

        // ABSTRACTION
        Todo cleaning = new Todo("Do cleaning");

        // INHERITANCE
        Todo washing = new NeedTodo("Do Washing");
        // POLYMORPHISM
        // - OVERRIDING

        // - OVERLOADING
        todoList.addTodo("Buy Shopping");
        todoList.addTodo(cleaning);
        todoList.addTodo(washing);

        todoList.printTodos();
    }
}