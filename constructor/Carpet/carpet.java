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


Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie



Task05:
    Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

                Add a constructor that can set all the fields

            Actions:
                toString(): returns the full info of the Offer Object

    2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */
