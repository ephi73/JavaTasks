package constructor;

public class pizza {
    char size;
    int numberOfCheeseTopping;
    int numberOfPepperoniTopping;

    public pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size =size;
        this.numberOfCheeseTopping =numberOfCheeseTopping;
        this.numberOfPepperoniTopping =numberOfPepperoniTopping;

        if((size+"").equalsIgnoreCase("s")){
            System.out.println("Your total cost is $" + (10 + (numberOfCheeseTopping * 2) +
                    (numberOfPepperoniTopping * 2)));
        }if((size+"").equalsIgnoreCase("m")){
            System.out.println("Your total cost is $" + (12 + (numberOfCheeseTopping * 2) +
                    (numberOfPepperoniTopping * 2)));
        }if((size+"").equalsIgnoreCase("l")){
            System.out.println("Your total cost is $" + (14 + (numberOfCheeseTopping * 2) +
                    (numberOfPepperoniTopping * 2)));
        }

    }
}