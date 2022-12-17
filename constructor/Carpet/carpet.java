package constructor.Carpet;

public class carpet {
    public double width;
    public double length;
    public boolean isPersian;
    public static double unitPrice = 20;


    public carpet(double width, double length, boolean isPersian){
        this.width = width;
        this.length = length;
        this.isPersian = isPersian;
        if(isPersian == true){
            unitPrice+=200;
            double totalCost = (width*length)*unitPrice;
            System.out.println("The total cost of the carpet is $"+totalCost);
        }else{
            double totalCost = (width*length)*unitPrice;
            System.out.println("The total cost of the carpet is $"+totalCost);
        }

    }

}
/*
Task03:
    1. Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice

 */
