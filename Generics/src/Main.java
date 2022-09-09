public class Main {
    public static void main(String[] args) {
        Media book1 = new Book("Atomic Habits");

        Media video1 = new Video("Pisici");

        Newspaper newspaper = new Newspaper("ZiarulDeIasi");

        Library<Media> media = new Library<>();

        media.addMedia(book1);
        media.addMedia(video1);



    }
}
