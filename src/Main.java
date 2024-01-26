
public class Main {
    public static void main(String[] args) {
        // ENCAPSULATION
        // - CONTAINING -> DATA/INSTANCE VARIABLES METHODS -> DATA HIDING
        // - CONTROLLING ACCESS WITH METHODS
        TodoList todoList = new TodoList();
        todoList.printTodos();
        Todo todoOne = todoList.getTodo(1);

        // ABSTRACTION
        // - SIMPLIFYING COMPLEX THINGS IN A APPLICATION -> OBJECTS/CLASSES
        // - KEEPING THE THINGS THAT ARE IMPORTANT
        // - HIDE COMPLEXITY IN METHODS
        Todo cleaning = new Todo("Do cleaning");

        // SIMPLIFY COMPLEX SYSTEMS / APPLICATIONS

        // INHERITANCE
        // - SUPER CLASS / PARENT CLASS & SUBCLASS / CHILD CLASS
        // - SHARING CODE -> SUB CLASS CAN DO EVERYTHING THAT THE PARENT CLASS CAN DO
        // - CORE FUNCTIONALITY TO SHARE WITH OTHER SIMILAR CLASSES
        // - protected -> ALLOWS ACCESS TO METHOD / DATA IN SUBCLASS
        // IS - A RELATIONSHIP
        // ClassA IS A ClassB
        // NeedTodo IS A Todo
        Todo washing = new NeedTodo("Do Washing");

        // POLYMORPHISM
        // - IMPERSONATING -> MANY FORMS
        // - OBJECTS THAT HAVE COMMON TYPE BUT ACT DIFFERENTLY

        // - OVERRIDING
        // - CHANGE INHERITED METHODS

        // - OVERLOADING
        todoList.addTodo("Buy Shopping");
        todoList.addTodo(cleaning);
        todoList.addTodo(washing);

        todoList.printTodos();

        NeedTodo needTodo = (NeedTodo) washing;
        System.out.println(needTodo.toString(4));

        // static
        // -
        todoList.addTodo(NeedTodo.createNeedTodo(cleaning));

        todoList.printTodos();

    }
}