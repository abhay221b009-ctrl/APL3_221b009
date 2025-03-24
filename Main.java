public class Main{
    public static void main(String[]args){
        
        Offering offering  = new Icecream();
        offering = new Gin(offering);
        System.out.println("Your order is "+offering.getName()+" "+ ",Your total price is "+offering.getPrice()+" Rs");
        
         
         
        
    }
}