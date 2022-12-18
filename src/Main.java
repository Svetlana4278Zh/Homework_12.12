public class Main {
    public static void main(String[] args) {
        Author turgenev = new Author("Иван", "Тургенев");
        Author pushkin = new Author("Александр", "Пушкин");
        Book mumu = new Book("Муму", turgenev, 1854);
        Book onegin = new Book("Евгений Онегин", pushkin, 1833);
        System.out.println(mumu);
        System.out.println(onegin);
        onegin.setYearOfPublication(1837);
        System.out.println(onegin);
    }
}