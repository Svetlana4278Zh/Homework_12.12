public class Main {
    public static void main(String[] args) {
        Author turgenev = new Author("Иван", "Тургенев");
        Author pushkin = new Author("Александр", "Пушкин");
        Book mumu = new Book("Муму", turgenev, 1854);
        Book onegin = new Book("Евгений Онегин", pushkin, 1833);
        printBook(mumu);
        printBook(onegin);
        onegin.setYearOfPublication(1837);
        printBook(onegin);
    }

    public static void printBook(Book book){
        System.out.print(book.getTitle() + " - ");
        System.out.print(book.getAuthor().getName() + " "+ book.getAuthor().getLastName()+ " - ");
        System.out.println(book.getYearOfPublication());
    }
}