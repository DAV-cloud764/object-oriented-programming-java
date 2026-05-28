public class book {
    
    private String title;
    private String author;
    private double price;

    public void setTitle(String title){
        if (title != null && !title.isEmpty()){
            this.title = title;
        } else {
            System.out.println("Invalid Title");
        }
    } 

    public void setAuthor(String author){
        if (author != null && !author.isEmpty()){
            this.author = author;
        } else {
            System.out.println("Invalid Author");
        }
    }

    public void setPrice(double price){
        if (price > 0){
            this.price = price;
        } else {
            System.out.println("Invalid Price");
        }
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public static void main(String[] args){
        book user = new book();
        user.setTitle("Data Structure");
        user.setAuthor("David F");
        user.setPrice(3000);

        System.out.println("The title of the book is " + user.getTitle());
        System.out.println("The Author is " + user.getAuthor());
        System.out.println("The price for the book is " + user.getPrice());
    }
}
