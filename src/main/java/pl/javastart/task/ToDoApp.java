package pl.javastart.task;

public class ToDoApp {
    public static void main(String[] args) {
        ToDo toDo1 = new ToDo("Sprzątanie", "Mycie okien", 1, new Person("Jan", "Kowalski"));
        System.out.println("Czy zadanie mycie okien ma priorytet wysoki?: " + toDo1.highPriority());
        ToDo toDo2 = new ToDo("Pranie", "Pranie pościeli", 0);
        ToDo toDo3 = new ToDo("Prasowanie", "Prasowanie koszul");
        ToDo toDo4 = new ToDo("Sprzątanie", "Mycie naczyń", -1, new Person("Jan", "Kowalski"));
        System.out.println("Czy zadanie mycie naczyń ma priorytet wysoki?: " + toDo4.highPriority());
        ToDo toDo5 = new ToDo("Sprzątanie", "Mycie okien", 0, new Person("Jan", "Kowalski"));
        System.out.println("Czy zadanie mycie okien ma priorytet średni?: " + toDo5.mediumPriority());
        ToDo toDo6 = new ToDo("Sprzątanie", "Mycie drzwi", 3, new Person("Jan", "Kowalski"));
        System.out.println("Czy zadanie mycie drzwi ma priorytet średni?: " + toDo6.mediumPriority());
        ToDo toDo7 = new ToDo("Sprzątanie", "Mycie mebli", -3, new Person("Jan", "Kowalski"));
        System.out.println("Czy zadanie mycie mebli ma priorytet niski?: " + toDo7.lowPriority());
    }
}
