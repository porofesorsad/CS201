package readingMaterials;

public class Driver
{
    public static void main(String[] args)
    {
        System.out.println("Time to make and print out reading materials");
        ReadingMaterials rm = new ReadingMaterials("Stewart", 450);
        rm.print();
        Book book = new Book("Java Programming","Test Name", 
            "Pearson",300);
        book.print();
        Magazine magazine = new Magazine("Test Magazine", "Fashion", 
            "New fashion week", "whatever", 40);
        magazine.print();
        TechnicalJournal techJournal = new TechnicalJournal("GreaterGeology", 
            "Geology", "dinosaurs", "MG", 20, "New dinosaur bones found.");
        techJournal.print();
        Novel novel = new Novel("The Alchemist", "someone", "Thriller",
            "TMG", 249);
        novel.print();
    }
}
