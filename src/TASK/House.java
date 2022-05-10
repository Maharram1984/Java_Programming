package TASK;

public class House {

    public static void main(String[] args) {

        String houseType, address;
        int  numberOfBedrooms, numberOfKitchen,numberOfBathroom,costOfTheHouse, zipCode;
        boolean isThereABasement, isTherePool, isTheHouseForSale, isThereParkNearBy;
        char ratingOfSurroundingSchoolDistricts;

        houseType = "Town House";
        address = "22035 Street away st";
        numberOfBedrooms = 4;
        numberOfBathroom = 3;
        numberOfKitchen = 1;
        isThereABasement = false;
        isTherePool = false;
        isThereParkNearBy = true;
        isTheHouseForSale = true;
        ratingOfSurroundingSchoolDistricts = '5';
        costOfTheHouse = 450000;
        zipCode = 55555;




        String townHouseForSale = " There is a " + houseType + " with " + numberOfBedrooms + " bedrooms, " +
        numberOfBathroom + " bathrooms  and " + numberOfKitchen + " kitchen \n There is not basement " +
        isThereABasement + " and  pool " + isTherePool + " but it is really close \n to park " + isThereParkNearBy +
        " school rate is " + ratingOfSurroundingSchoolDistricts + " the house is for sale " + isTheHouseForSale +
        " and price is: \n $" + costOfTheHouse + "  Which is located in " + address + ", Zip code " + 55555 ;

        System.out.println(townHouseForSale);








    }



















}
