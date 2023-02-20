package pl.javastart.task;

public class ToDoApp {
    public static void main(String[] args) {
        ToDo toDo1 = new ToDo("Sprzątanie", "Mycie okien", 1, new Person("Jan", "Kowalski"));
        ToDo toDo2 = new ToDo("Pranie", "Pranie pościeli", 0);
        ToDo toDo3 = new ToDo("Prasowanie", "Prasowanie koszul");
    }
}
