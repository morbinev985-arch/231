//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author ekkel = new Author("Брюс","Эккель");
        Author martin = new Author("Роберт","Мартин");
        Book javaPhilosophy = new Book("философия java", ekkel, 2016);
        Book cleanCode = new Book("Чистый код", martin, 2020);

        System.out.println(javaPhilosophy.getTitle() + " " + javaPhilosophy.getAuthor().getFirsName() + " " + javaPhilosophy.getAuthor().getFirsName() +" " + javaPhilosophy.getPublicationYear());
        System.out.println(cleanCode.getTitle() + " " + cleanCode.getAuthor().getFirsName() + " " + cleanCode.getAuthor().getFirsName() + " " + cleanCode.getPublicationYear());

        javaPhilosophy.setPublicationYear(2021);

        System.out.println(javaPhilosophy.getTitle() + " " + javaPhilosophy.getAuthor().getFirsName() + " " + javaPhilosophy.getAuthor().getFirsName() + " " + javaPhilosophy.getPublicationYear());
        System.out.println("end");
    }
}
