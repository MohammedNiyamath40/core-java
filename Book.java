class Book {
    static void bookTitle() {
        System.out.println("CLEAN CODE");
        isHardcover(true);
    }
    static void isHardcover(boolean hardcover) {
        System.out.println("Hardcover: " + hardcover);
        int pageCount = getPageCount();
        System.out.println("Pages: " + pageCount);
    }
    static int getPageCount() {
        return 464;
    }
}