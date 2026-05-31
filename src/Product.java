public class Product {

    private String name;
    private double price;

    public void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public void setPrice(double price){
        if (price > 0){
            this.price = price;
        } else {
            System.out.println("Invalid Price");
        }
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
    
    public static void main(String[] args){

        Product p = new Product();
        p.setName("Laptop");
        p.setPrice(5000);

        System.out.println("Name: " + p.getName());
        System.out.println("Price: " + p.getPrice());
    }
}
