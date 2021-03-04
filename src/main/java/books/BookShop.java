package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        //TODO complete
        int diffBooks=0;
        int totalBooks=0;
        
        for(int i : books){
            if(i<0){
                diffBooks++;
            }
            totalBooks+=i;
        }
        double discount=0.07;
        
        return (totalBooks-diffBooks)*8+(diffBooks-1)*discount*diffBooks;
    }
}
