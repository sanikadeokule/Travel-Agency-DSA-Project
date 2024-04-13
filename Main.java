

import java.time.LocalDate;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.*;

class mini {



// declare all linkedhsahmaps

    //speciality tours-

    static LinkedHashMap<String, String> specialtyTours = new LinkedHashMap<>();

    // tourDetails parent lhm



    static LinkedHashMap<String, LinkedHashMap<String, String>> tourDetails = new LinkedHashMap<>();

    // for each package one lhm

    static LinkedHashMap<String, String> tourInfo2100 = new LinkedHashMap<>();

    static LinkedHashMap<String, String> tourInfo2101 = new LinkedHashMap<>();

    static LinkedHashMap<String, String> tourInfo2102 = new LinkedHashMap<>();

    static LinkedHashMap<String, String> tourInfo2103 = new LinkedHashMap<>();

    static LinkedHashMap<String, String> tourInfo2104 = new LinkedHashMap<>();

    static LinkedHashMap<String, String> tourInfo2105 = new LinkedHashMap<>();

    static LinkedHashMap<String, String> tourInfo2106 = new LinkedHashMap<>();

    static LinkedHashMap<String, String> tourInfo2107 = new LinkedHashMap<>();

    static LinkedHashMap<String, String> tourInfo2108 = new LinkedHashMap<>();

    //price lhm

    static LinkedHashMap<String, Integer> tourPrices = new LinkedHashMap<>();

    //itinerary lhm

    static LinkedHashMap<String, String> itineraryDetails = new LinkedHashMap<>();

//Scanner sc=new Scanner(System.in);



    static String name;

    static String EmailId;

    static int age;



    static double totalPrice = 0.0;

    static String tourId;

    static String sd1;

    static String sd2;





    public static void main(String[] args)

    {

        login();



    }



    public static void login() {

        Scanner scanner = new Scanner(System.in);

        int choice;





        System.out.println("Welcome to the WanderLust Tours!!! \nWe take immense pride in presenting you with a diverse collection of meticulously crafted tours, each offering a unique perspective on some of the most captivating destinations across India.");
        System.out.println();
        System.out.println("1. Login as Customer");
        System.out.println();
        System.out.println("2. Login as Admin");
        System.out.println();
        System.out.println("3. Exit System");
        System.out.println();


        System.out.print("Please enter your choice: ");

        choice = scanner.nextInt();
        System.out.println();


        switch (choice) {

            case 1:

                // Login logic for Customer

                System.out.println("Logging in as Customer...");

                // add all funcs

                speciality_tours(); //func call
                itinerary_details();
                short_details_each_package();
                search_or_sort();
                calc_price();
                Date();
                user_details();
                disp_bill();
                // Place your customer login logic here

                break;

            case 2:

                // Login logic for Admin

                login_as_admin();

                // Place your admin login logic here

                break;

            case 3:

                System.out.println("Exiting system...");

                //scanner.close();

                return;

            default:

                System.out.println("Invalid choice. Please enter a valid option.");

                break;

        }



    } //login ends



    public static void speciality_tours()

    {
        // Adding specialty tours to the LinkedHashMap

        specialtyTours.put("Chota Break", "Enjoy short and refreshing breaks at scenic destinations.");

        specialtyTours.put("Youth special :Adventure", "Explore thrilling adventures in exotic locations.");

        specialtyTours.put("Spritual tours", "Embark on spiritual journeys to sacred sites.");

        specialtyTours.put("Honeymoon Special", "Indulge in opulent experiences with lavish accommodations and services.");

        // Iterating through the LinkedHashMap using a for-each loop

        System.out.println("Specialty Tours:");

        for (Map.Entry<String, String> entry : specialtyTours.entrySet()) {
            System.out.println("Tour Name: " + entry.getKey());
            System.out.println("Description: " + entry.getValue());
            System.out.println(); // Add a blank line for readability
        }
    }

    public static void short_details_each_package()
//Add tour details of 2100

    {

        tourInfo2100.put("Tour Name", "MAGICAL MANALI");

        tourInfo2100.put("Cities to Visit", "Manali, Khanul, Prini, Delhi");

        tourInfo2100.put("Number of Days", "6");

        tourInfo2100.put("Specialization", "Chota Break");

        tourDetails.put("2100", tourInfo2100);





        tourInfo2101.put("Tour Name", "UNPARALLELED KERALA");

        tourInfo2101.put("Cities to Visit", "Kochi, Munnar, Kumarakor");

        tourInfo2101.put("Number of Days", "4");

        tourInfo2101.put("Specialization", "Chota Break");

        tourDetails.put("2101", tourInfo2101);





        tourInfo2102.put("Tour Name", "HISTORICAL MAHARASHTRA ");

        tourInfo2102.put("Cities to Visit", "Mumbai, Nahik, Aurangabad");

        tourInfo2102.put("Number of Days", "4");

        tourInfo2102.put("Specialization", "Chota Break");

        tourDetails.put("2102", tourInfo2102);





        tourInfo2103.put("Tour Name", "AMAZING GOA");

        tourInfo2103.put("Cities to Visit", "Panji, Candolim, Goa Velha");

        tourInfo2103.put("Number of Days", "3");

        tourInfo2103.put("Specialization", "Youth Special-Adventure");

        tourDetails.put("2103", tourInfo2103);





        tourInfo2104.put("Tour Name", "OFFBEAT ANADAMAN ");

        tourInfo2104.put("Cities to Visit", "Port Blair, Mayabundar");

        tourInfo2104.put("Number of Days", "8");

        tourInfo2104.put("Specialization", "Youth Special-Adventure");

        tourDetails.put("2104", tourInfo2104);





        tourInfo2105.put("Tour Name", "MESMERIZING KEDARNATH");

        tourInfo2105.put("Cities to Visit", "Kedarnath, Badrinath");

        tourInfo2105.put("Number of Days", "5");

        tourInfo2105.put("Specialization", "Spiritual Tours");

        tourDetails.put("2105", tourInfo2105);





        tourInfo2106.put("Tour Name", "DIVINE ODYSSEY: ORISSA'S SPIRITUAL ESSENCE ");

        tourInfo2106.put("Cities to Visit", "Bhubaneshwar, Puri");

        tourInfo2106.put("Number of Days", "4");

        tourInfo2106.put("Specialization", "Spiritual Tours");

        tourDetails.put("2106", tourInfo2106);





        tourInfo2107.put("Tour Name", "AMAZING OOTY & MYSORE WITH BANGALORE");

        tourInfo2107.put("Cities to Visit", "Bangalore, Mysore, Ooty");

        tourInfo2107.put("Number of Days", "5");

        tourInfo2107.put("Specialization", "Honeymoon Special");

        tourDetails.put("2107", tourInfo2107);





        tourInfo2108.put("Tour Name", "COLOURFUL RAJASTHAN");

        tourInfo2108.put("Cities to Visit", "Jaipur, Jodhpur, Jaisalmer, Udaipur");

        tourInfo2108.put("Number of Days", "8");

        tourInfo2108.put("Specialization", "Honeymoon Special");

        tourDetails.put("2108", tourInfo2108);



//create another linkedhashmap for tourprices





        // Add tour prices for each package

        tourPrices.put("2100", 14000); // Price for Magical Manali tour

        tourPrices.put("2101", 13000);

        tourPrices.put("2102", 9000);

        tourPrices.put("2103", 10000);

        tourPrices.put("2104", 15000);

        tourPrices.put("2105", 16000);

        tourPrices.put("2106", 12000);

        tourPrices.put("2107", 15000);

        tourPrices.put("2108", 14000);





        System.out.println("Displaying all the Packages we offer :");

        for (Map.Entry<String, LinkedHashMap<String, String>> entry : tourDetails.entrySet()) {

            String tourId = entry.getKey();

            LinkedHashMap<String, String> each_details = entry.getValue();

            System.out.println("For Tour ID: " + tourId);

            for (Map.Entry<String, String> detail : each_details.entrySet()) {

                System.out.println(detail.getKey() + ": " + detail.getValue());

            }

            System.out.println();

        }



        System.out.println("\nTour Prices:");

        for (Map.Entry<String, Integer> entry : tourPrices.entrySet()) {

            System.out.println("Tour ID: " + entry.getKey() + ", Price per member: " + entry.getValue());

        }



    }



    public static void  search_or_sort()

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter one choice from below. \n1-View the packages within a particular budget \n2-Search packages by city ");

        int ch=sc.nextInt();
        System.out.println();
        String tourId="";
        switch(ch)

        {

            case 1:new_sort_prices();

                break;
            case 2:  search_city();

                break;
            default: System.out.println("Enter one choice from below\n1-View the packages within budget \n2-Search packages by city");


        }


    }
    public static void new_sort_prices()
    {
        String interested_in_id="";
        Scanner sc=new Scanner(System.in);

        System.out.println("Do you want to sort packages under a fixed budget?(Type yes/no)");

        String response=sc.next();

        if(response.equalsIgnoreCase("yes")){

            System.out.println("Enter your budget:");

            int budget=sc.nextInt();

            sc.nextLine();

            for (Map.Entry<String, Integer> entry : tourPrices.entrySet()) {

                //System.out.println("Tour ID: " + entry.getKey() + ", Price per member: " + entry.getValue());
                if(entry.getValue() <= budget)
                {
                    String correspondingKey= entry.getKey();
                    displayItinerary(correspondingKey,itineraryDetails);
                    if(("2108").equals(entry.getKey()))
                    {
                        break;
                    }

                }

            }
            System.out.println(" Enter the id of the package you are interested in .");
            interested_in_id = sc.nextLine();
            System.out.println("Do you wish to confirm booking for the given ID? Enter yes or no .");
            String answer= sc.nextLine();
            if(answer.equalsIgnoreCase("yes"))
            {
                System.out.println("Your booking for package with id "+interested_in_id +" is confirmed. Lets proceed to hotel bookings." );
                booking_for_id();

            }
            else
            {
                System.out.println("Displaying all the packages again. ");
                short_details_each_package();
            }


        }// extreme outer if ends

        else{

            System.out.println("Continue without Sorting");



        }


    }


    public static void  search_city()

    {

        System.out.println("*** VIEW PACKAGES BY CITY ***");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a city name: ");

        String cityName = scanner.nextLine();

        // Check if the city exists in any tour package

        boolean cityExists = false;

        for (Map.Entry<String, LinkedHashMap<String, String>> entry : tourDetails.entrySet()) { // for open

            LinkedHashMap<String, String> each_details = entry.getValue();

            String citiesToVisit = each_details.get("Cities to Visit");

            if (citiesToVisit.contains(cityName)) { // if open

                cityExists = true;

                tourId = entry.getKey();
                System.out.println();

                System.out.println("City \"" + cityName + "\" is present in one tour package with id :" + tourId);
                System.out.println();
                displayItinerary(tourId, itineraryDetails);
                break;

            }//clse if
        }//close for
        // Display result outside the loop

        if (!cityExists) {

            System.out.println("City \"" + cityName + "\" is not present in any tour package.");

            System.out.println("Please choose a city from among the list of packages with cities shown.");

            short_details_each_package();

        }

        System.out.println("Do you wish to confirm booking for the given ID: " + tourId +"? Enter yes or no .");
        Scanner sc= new Scanner (System.in);
        String answer= sc.nextLine();
        if(answer.equalsIgnoreCase("yes"))
        {
            System.out.println();
            System.out.println("Your booking for package with id "+ tourId+" is confirmed. Lets proceed to hotel bookings." );
            System.out.println();
            booking_for_id();   //_----------------------------------------------------------------------see this is where booking for hotel called

        }
        else
        {
            System.out.println();
            System.out.println("Displaying all the packages again. ");
            System.out.println();
            short_details_each_package();
        }

    }// search end




    public static void itinerary_details()

    {

        itineraryDetails.put("2100", " MAGICAL MANALI \n\n ************** \n\n Day 1 - Manali – Jagatsukh – Khanul\nVillage of Jagatsukh to Bahangan Nullah\nBahangan Nullah serves as your first day’s campsite.\n\nDay 2 - Camping Site At Prini\n\nDay 3 - A trek of about five kilometres in The Himalayan Mountain ranges\n\nDay 4 - Adventure attractions: 1.Burma Bridge 2. Commando Net\n\nDay 5 - The Mall Road and head back towards the central hill station of Manali.\n\nDay 6 - Shopping and on-foot exploration of the hill station Then Manali – Delhi");

// here add all the itinerary details by Aakanksha

        itineraryDetails.put("2101" , " UNPARALLED KERALA \n\n ************** \n\n DAY 1- Kochi Day at Leisure \n DAY 2 and 3 - Munnar \n 1.Visit Eravikulam National Park \n 2.Visit to Tea Museum \n 3.Visit to Mattupetty Dam \n 4.Visit to Eco Point \n 5.Visit to Flower Garden \n DAY 4 -Kumarakom \n Day at Leisure ");

        itineraryDetails.put("2102"," HISTORICAL MAHARASHTRA \n\n ************** \n\n Day 1 - Arrival in Mumbai\nOn reaching Mumbai, check in at the hotel for the night\nDay 2 - Sightseeing in Aurangabad\nPost breakfast,cover Elephanta Island and Elephanta Caves\nDay 3 - Nashik Sightseeing\nCover Panchavati Temple, Kalaram Temple, Bhaktidham and Trimbakeshwar\nDay 4 - Visit Ajanta Caves\nEnjoy a visit to the rock cut Ajanta Caves today.\nEnjoy a visit to the Ellora Caves today.\n");

        itineraryDetails.put("2103"," AMAZING GOA \n \n ************** \n \nDay 1 - NORTH GOA FORTS & BEACHES\n1.Reis Mogos Fort\n2.Aguada Fort\n3.Calangute Beach\n4.Chapora Fort\n5.Vagator Beach\nDAY 2 - DUDHSAGAR FALLS\nDay 3 - OLD GOA & TEMPLES\n1.Basilica Of Bom Jesus\n2.Se Cathedral\n3.St. Francis Of Assisi Church\n4.St. Augustine Tower / Church Of St. Augustin\n5.Shri Mangueshi Temple / Mangeshi Temple\n");

        itineraryDetails.put("2104"," OFFBEAT ANDAMAN \n\n************** \n \n DAY 1 - Arrival at Port Blair\n1.Cellular Jail Visit\nDAY 2 - Port Blair| Bartang | Rangat | Mayabunder | Diglipur\n1. Jarawa Reserve\n2.Mud Volcano\n3.Limestone cave\n4.Aamkunj Beach\n5.Brake water\n6.Panchabati Fall\n7.Cutbery beach\nDAY 3 - Mayabunder | Diglipur\n1.Kalipur beach\n2.Mayabunder Islands\n3.Karmatang beach\nDAY 4 - Mayabunder | Port Blair\n1.Shopping\nDAY 5 - Port Blair to Havelock\nDAY 6 - Explore Havelock\n1.Radhanagar Beach\n2.Water sports.\nDAY 7 - Havelock to Port Blair\n1.Elephant Beach\nDAY 8 - Check out and Return\n");

        itineraryDetails.put("2105"," MESMERIZING KEDARNATH \n\n ************** \n \n DAY 1 - Dehradun\nExplore on your own\nDAY 2 - Yamunotri\n1.Yamunotri Temple\n2.Shani Temple\nDAY 3 - Gangotri\n1.Gangotri Temple\nDAY 4 - Kedarnath\n1.Visit Kedarnath Temple\nDAY 5 - Badrinath\n1.Visit Badrinath Temple\n");

        itineraryDetails.put("2106"," DIVINE ODYSSEY : ORISSA'S SPIRITUAL ESSENCE \n \n ************** \n \nDay 1: Arrival in Bhubaneswar\nVisit Lingaraj Temple, one of the oldest and largest temples in Bhubaneswar dedicated to Lord Shiva.\nExplore other temples in the city such as Mukteshwar Temple and Rajarani Temple.\nDay 2: Bhubaneswar to Puri\nVisit Konark Sun Temple, a UNESCO World Heritage Site\nReach Puri by afternoon and spend the evening at leisure, exploring the local markets or relaxing by the beach.\nDay 3: Visit Jagannath Temple, one of the Char Dham\nAttend morning aarti\nExplore other nearby attractions such as Gundicha Temple and Narendra Tank.\nDay 4: Departure from Puri\nVisit Raghurajpur, a heritage crafts village known for its Pattachitra paintings\nEnjoy a scenic drive to Chilika Lake, Asia's largest brackish water lagoon\nDeparture by train\n");

        itineraryDetails.put("2107"," AMAZING OOTY & MYSORE WITH BANGLORE \n\n ************** \n \n Day 1 - Bangalore\n1.Bull Temple\n2.Commercial Street\n3.Vidhana Soudha\n4.Lal Bagh Botanical Garden\n5.Mysore Arts & Crafts Centre\nDay 2 - Bangalore to Mysore\n1.Mysore Palace\n2.Brindavan Gardens\n3.Chamundi Hills\n4.St. Philomena Church\n5.Mysore Zoo\nDay 3 - Mysore to Ooty\n1.Ooty Lake\nDay 4 - Ooty\n1.Sim's Park\n2.Lamb's Rock\n3.Dolphin's Nose\n4.Tea Museum\n5.Coonoor\n6.Doddabetta Peak\n7.Ooty Botanical Gardens\nDay 5 - Ooty to Bangalore\n");

        itineraryDetails.put("2108"," COLOURFUL RAJASTHAN \n \n************** \n \n Day 1 - Arrival in Jaipur\nDay 2 - Sightseeing in Jaipur\n1.Amer Fort\nDay 3 - Jaipur to Jodhpur\nSightseeing in Jaisalmer\n1.Umaid Bhawan Palace\nDay 4 - Jodhpur to Jaisalmer\n1.Mehrangarh Fort\n2.Jaswant Thada\nDay 5 - Jaisalmer\nSightseeing in Jaisalmer\n1.Nathdwara\n2.Patwaon ki Haveli\n3.Sam Sand Dunes\nDay 6 - Jaisalmer to Udaipur(travel)\nDay 7 - Udaipur\nSightseeing in Udaipur\n1.Saheliyon ki Bari\n2.City Palace\n3.Sajjangarh Palace\nDay 8 - Departure from Udaipur\nBreakfast at Hotel in Udaipur\n");





/* Scanner sc=new Scanner(System.in);

System.out.println("****** Display itinerary part ******");

System.out.println("Enter id of package whose itinerary you wish to see.");

String input_id=sc.nextLine();

 displayItinerary(input_id, itineraryDetails);*/

    }







    public static void displayItinerary(String tourId, LinkedHashMap<String, String> itineraryDetails) {

        System.out.println("Itinerary for Package " + tourId + ":");

        for (Map.Entry<String, String> entry : itineraryDetails.entrySet()) {

            String itinerary = itineraryDetails.get(tourId);

            System.out.println(itinerary);

            break;

        }
    }

    public static void booking_for_id()

    {
        System.out.println( " Our travel site WanderLust Tours has a collaboration with the Ritz Carlton chain of luxury hotels. You will enjoy a pleasant stay at the Ritz Carlton Hotel." );
        System.out.println();
        // Example multi-dimensional array representing rooms availability

        int[][] rooms = {

                {0, 0, 0, 0},

                {0, 0, 0, 0},

                {0, 0, 0, 0}

        };



        // Display initial availability

        System.out.println("Initial room availability:");
        System.out.println();

        displayRooms(rooms);



        Scanner scanner = new Scanner(System.in);



        // Ask user for floor and number of rooms
        System.out.println();
        System.out.print("Enter floor number (1, 2, or 3): ");

        int floor = scanner.nextInt();
        System.out.println();

        System.out.print("Enter number of rooms to book: ");

        int numRooms = scanner.nextInt();
        System.out.println();


        // Book rooms

        bookRooms(rooms, floor, numRooms);



        // Display updated availability

        System.out.println("Updated room availability:");

        displayRooms(rooms);

    }

    //scanner.close();

    // Scanner scanner = new Scanner(System.in);

    public static void calc_price()
    {

        int base_price_2=0;
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the ID of the package you have selected to confirm price of booking. ");
        String chosen_id= sc.nextLine();
        System.out.println();
        for (Map.Entry<String, Integer> entry : tourPrices.entrySet()) {

            int base_price = tourPrices.get(chosen_id);
            base_price_2=base_price;
            System.out.println("The base price of the your desired package is : "+base_price);
            System.out.println();
            break;

        }
        double taxes = 0.0;

        // double totalPrice = 0.0;
        double foodPricePerPerson = 300.0;

        System.out.println("The food price per person for the entire tour is Rs." + foodPricePerPerson);
        System.out.println();

        System.out.println("Please enter the number of members: ");

        int noOfMem = sc.nextInt();



        double totalFoodPrice = noOfMem * foodPricePerPerson;

        double nmem_price = base_price_2 * noOfMem;



        taxes = nmem_price * 0.18;

        System.out.println("GST applied: 18%");



        totalPrice = taxes + nmem_price + totalFoodPrice;



        System.out.println();

        System.out.println("The total price for your tour is: Rs." + totalPrice);




    }




    public static void displayRooms(int[][] rooms) {

        for (int[] floor : rooms) {

            for (int room : floor) {

                System.out.print(room + " ");

            }

            System.out.println();

        }

    }



    public static void bookRooms(int[][] rooms, int floor, int numRooms) {

        if (floor < 1 || floor > rooms.length) {

            System.out.println("Invalid floor number.");

            return;

        }

        int[] floorRooms = rooms[floor - 1];

        int availableRooms = 0;

        for (int room : floorRooms) {

            if (room == 0) {

                availableRooms++;

            }

        }

        if (availableRooms < numRooms) {

            System.out.println("Not enough rooms available on this floor.");

            return;

        }

        int roomsBooked = 0;

        for (int i = 0; i < floorRooms.length && roomsBooked < numRooms; i++) {

            if (floorRooms[i] == 0) {

                floorRooms[i] = 1;

                roomsBooked++;

            }

        }

        System.out.println("Rooms booked successfully.");

    }



    public static void login_as_admin()

    {

        Scanner sc=new Scanner (System.in);

        System.out.println("Logging in as Admin....");

        System.out.println("Enter the choice \n1-to add new package\n2-to remove any package");

        int ch=sc.nextInt();

        switch(ch)

        {

            case 1:





                System.out.println("Enter the name of the package you want to add:");

                String name = sc.next();



                sc.nextLine();



                System.out.println("Enter a one line description of the package:");

                String details = sc.nextLine();



                specialtyTours.put("Chota Break", "Enjoy short and refreshing breaks at scenic destinations.");

                specialtyTours.put("Youth special: Adventure", "Explore thrilling adventures in exotic locations.");

                specialtyTours.put("Spiritual tours", "Embark on spiritual journeys to sacred sites.");

                specialtyTours.put("Honeymoon Special", "Indulge in opulent experiences with lavish accommodations and services.");



                // Add the new package

                specialtyTours.put(name, details);



                // Print the updated LinkedHashMap

                System.out.println("Specialty Tours:");

                for (Map.Entry<String, String> entry : specialtyTours.entrySet()) {

                    System.out.println("Tour Name: " + entry.getKey());

                    System.out.println("Description: " + entry.getValue());

                    System.out.println();

                }



                System.out.println("Enter the Id from 2109...");

                String Id=sc.next();

                sc.nextLine();

                System.out.println("Enter the detailed discription");

                String Discription=sc.nextLine();





                itineraryDetails.put("2100", "Day 1 - Manali – Jagatsukh – Khanul\nVillage of Jagatsukh to Bahangan Nullah\nBahangan Nullah serves as your first day’s campsite.\n\nDay 2 - Camping Site At Prini\n\nDay 3 - A trek of about five kilometres in The Himalayan Mountain ranges\n\nDay 4 - Adventure attractions: 1.Burma Bridge 2. Commando Net\n\nDay 5 - The Mall Road and head back towards the central hill station of Manali.\n\nDay 6 - Shopping and on-foot exploration of the hill station Then Manali – Delhi");



                itineraryDetails.put("2102","Day 1 - Arrival in Mumbai\nOn reaching Mumbai, check in at the hotel for the night\nDay 2 - Sightseeing in Aurangabad\nPost breakfast,cover Elephanta Island and Elephanta Caves\nDay 3 - Nashik Sightseeing\nCover Panchavati Temple, Kalaram Temple, Bhaktidham and Trimbakeshwar\nDay 4 - Visit Ajanta Caves\nEnjoy a visit to the rock cut Ajanta Caves today.\nEnjoy a visit to the Ellora Caves today.\n");

                itineraryDetails.put("2103","Day 1 - NORTH GOA FORTS & BEACHES\n1.Reis Mogos Fort\n2.Aguada Fort\n3.Calangute Beach\n4.Chapora Fort\n5.Vagator Beach\nDAY 2 - DUDHSAGAR FALLS\nDay 3 - OLD GOA & TEMPLES\n1.Basilica Of Bom Jesus\n2.Se Cathedral\n3.St. Francis Of Assisi Church\n4.St. Augustine Tower / Church Of St. Augustin\n5.Shri Mangueshi Temple / Mangeshi Temple\n");

                itineraryDetails.put("2104","DAY 1 - Arrival at Port Blair\n1.Cellular Jail Visit\nDAY 2 - Port Blair| Bartang | Rangat | Mayabunder | Diglipur\n1. Jarawa Reserve\n2.Mud Volcano\n3.Limestone cave\n4.Aamkunj Beach\n5.Brake water\n6.Panchabati Fall\n7.Cutbery beach\nDAY 3 - Mayabunder | Diglipur\n1.Kalipur beach\n2.Mayabunder Islands\n3.Karmatang beach\nDAY 4 - Mayabunder | Port Blair\n1.Shopping\nDAY 5 - Port Blair to Havelock\nDAY 6 - Explore Havelock\n1.Radhanagar Beach\n2.Water sports.\nDAY 7 - Havelock to Port Blair\n1.Elephant Beach\nDAY 8 - Check out and Return\n");

                itineraryDetails.put("2105","DAY 1 - Dehradun\nExplore on your own\nDAY 2 - Yamunotri\n1.Yamunotri Temple\n2.Shani Temple\nDAY 3 - Gangotri\n1.Gangotri Temple\nDAY 4 - Kedarnath\n1.Visit Kedarnath Temple\nDAY 5 - Badrinath\n1.Visit Badrinath Temple\n");

                itineraryDetails.put("2106","Day 1: Arrival in Bhubaneswar\nVisit Lingaraj Temple, one of the oldest and largest temples in Bhubaneswar dedicated to Lord Shiva.\nExplore other temples in the city such as Mukteshwar Temple and Rajarani Temple.\nDay 2: Bhubaneswar to Puri\nVisit Konark Sun Temple, a UNESCO World Heritage Site\nReach Puri by afternoon and spend the evening at leisure, exploring the local markets or relaxing by the beach.\nDay 3: Visit Jagannath Temple, one of the Char Dham\nAttend morning aarti\nExplore other nearby attractions such as Gundicha Temple and Narendra Tank.\nDay 4: Departure from Puri\nVisit Raghurajpur, a heritage crafts village known for its Pattachitra paintings\nEnjoy a scenic drive to Chilika Lake, Asia's largest brackish water lagoon\nDeparture by train\n");

                itineraryDetails.put("2107","Day 1 - Bangalore\n1.Bull Temple\n2.Commercial Street\n3.Vidhana Soudha\n4.Lal Bagh Botanical Garden\n5.Mysore Arts & Crafts Centre\nDay 2 - Bangalore to Mysore\n1.Mysore Palace\n2.Brindavan Gardens\n3.Chamundi Hills\n4.St. Philomena Church\n5.Mysore Zoo\nDay 3 - Mysore to Ooty\n1.Ooty Lake\nDay 4 - Ooty\n1.Sim's Park\n2.Lamb's Rock\n3.Dolphin's Nose\n4.Tea Museum\n5.Coonoor\n6.Doddabetta Peak\n7.Ooty Botanical Gardens\nDay 5 - Ooty to Bangalore\n");

                itineraryDetails.put("2108","Day 1 - Arrival in Jaipur\nDay 2 - Sightseeing in Jaipur\n1.Amer Fort\nDay 3 - Jaipur to Jodhpur\nSightseeing in Jaisalmer\n1.Umaid Bhawan Palace\nDay 4 - Jodhpur to Jaisalmer\n1.Mehrangarh Fort\n2.Jaswant Thada\nDay 5 - Jaisalmer\nSightseeing in Jaisalmer\n1.Nathdwara\n2.Patwaon ki Haveli\n3.Sam Sand Dunes\nDay 6 - Jaisalmer to Udaipur(travel)\nDay 7 - Udaipur\nSightseeing in Udaipur\n1.Saheliyon ki Bari\n2.City Palace\n3.Sajjangarh Palace\nDay 8 - Departure from Udaipur\nBreakfast at Hotel in Udaipur\n");



                itineraryDetails.put(Id,Discription);//add id and detailed discription of new package



                //printing updated hashmap

                for(Map.Entry<String , String > entry : itineraryDetails.entrySet())

                {

                    System.out.println("Tour Id " + entry.getKey());

                    System.out.println("Detailed discription " + entry.getValue());

                    System.out.println();





                }









                break;



            case 2:

                System.out.println("Enter the name of package you want to remove from :\nChota Break\nYouth Special: Adventure"

                        + "\nSpritual tours\nHoneymoon Special");
                Scanner s= new Scanner(System.in);

                String Name = s.nextLine(); // Trim to remove leading/trailing whitespace

//sc.nextLine();



                Map<String, String> specialtyTours = new LinkedHashMap<>();

                specialtyTours.put("Chota Break", "Enjoy short and refreshing breaks at scenic destinations.");

                specialtyTours.put("Youth Special:Adventure", "Explore thrilling adventures in exotic locations.");

                specialtyTours.put("Spritual tours", "Embark on spiritual journeys to sacred sites.");

                specialtyTours.put("Honeymoon Special", "Indulge in opulent experiences with lavish accommodations and services.");



                specialtyTours.remove(Name);

                System.out.println("Attempting to remove package with name: " + Name);







                System.out.println("Now the speciality packages are:");

                System.out.println();





                for (Map.Entry<String, String> entry : specialtyTours.entrySet()) {

                    System.out.println("Tour Name: " + entry.getKey());

                    System.out.println("Description: " + entry.getValue());

                    System.out.println();

                }





        }

    }















    public static void user_details()//taking details of customer

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name of customer");

        name=sc.nextLine();

        System.out.println("enter the age");

        age=sc.nextInt();



        System.out.println("enter the email Id");

        EmailId=sc.next();





        if(EmailId.contains("@"))

        {

            System.out.println("Valid E mail Id");

        }

        else

        {

            System.out.println("Invalid Email Id");



        }

        while(!EmailId.contains("@"))//USE OF WHILE LOOP TILL THE USER ENTERS VALID EMAIL

        {

            System.out.println("Enter the valid E mail (It must contain @)");

            EmailId=sc.next();

        }

        if(EmailId.contains("@"))

        {

            System.out.println("Thank You!");

        }

    }

    public static void disp_bill()

    {
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter the TourId of the package for final confirmation.");
        String tourId= sc.nextLine();

        System .out.println("****Displaying bill****");



        System.out.println("Name of customer :" + name);

        System.out.println();

        System.out.println("Age : " +age);

        System.out.println();

        System.out.println("Email id :"+EmailId);

        System.out.println();

        System.out.println("Package chosen is of Id:" +tourId);
        //System.out.println( displayItinerary(tourId, itineraryDetails));

        //printing the details of specific tourId

        System.out.println();
        System.out.println("Displaying details of the tour chosen :");

        System.out.println();


        System.out.println("Itinerary for Package " + tourId + ":");

        for (Map.Entry<String, String> entry : itineraryDetails.entrySet()) {

            String itinerary = itineraryDetails.get(tourId);

            System.out.println(itinerary);
            break;
        }





        System.out.println("Starting date of Tour : "+sd1);

        System.out.println();

        System.out.println("Ending date of tour : "+sd2);

        System.out.println();

        System.out.println("Your Total bill for thr tour is :"+ totalPrice);



    }

    public static void Date()

    {

        Scanner scanner = new Scanner(System.in);







        //printing current date & time



        LocalDateTime currentDate= LocalDateTime.now();



        DateTimeFormatter formatDate= DateTimeFormatter.ofPattern("dd-MM-yyyy"+" , "+"E"); //Printing the date & the day in a format that we want



        String myDate=currentDate.format(formatDate);



        System.out.println(myDate);



        System.out.println();



        // Input start date of the tour



        System.out.println("Enter the start date of the tour (YYYY-MM-DD):");



        String sd = scanner.nextLine();







        // Parse the start date



        LocalDate startDate = parseDate(sd);







        // Input number of tour days



        System.out.println("Enter the number of tour days:");



        int tourDays = scanner.nextInt();







        // Calculate end date based on the number of tour days



        LocalDate endDate = startDate.plusDays(tourDays);



        // Print start and end dates



        sd1=startDate.format(formatDate);//changing the format from yyyy-mm-dd to dd-mm-yyyy



        System.out.println("Start Date: " + sd1);



        sd2=endDate.format(formatDate); //changing the format from yyyy-mm-dd to dd-mm-yyyy



        System.out.println("End Date: " + sd2);







    }





    // Method to parse date from string



    private static LocalDate parseDate(String dateString) {



        try {



            return LocalDate.parse(dateString);



        } catch (Exception e) {



            return null;



        }




    }

}
