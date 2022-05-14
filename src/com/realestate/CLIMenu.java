package com.realestate;

public class CLIMenu {
    CLIMenu () {

    }

    public void displayMenu() {
        System.out.println("You may press any of the keys below to select an operation: ");
        System.out.println("1. Sell new property");
        System.out.println("2. Show houses that need valuations");
        System.out.println("3. Record valuation for a house");
        System.out.println("4. Obtain list of houses requiring photographs");
        System.out.println("5. Record house for inspection");
        System.out.println("6. Schedule an 'Open for inspection time' for a house");
        System.out.println("7. Cancel scheduled 'Open for inspection time' for a house");
        System.out.println("8. See inspections for a given day");
        System.out.println("9. Record an offer for a house");
        System.out.println("10. Update a recorded offer for a house");
        System.out.println("11. Display list of offers/buyers for a particular house");
        System.out.println("12. Mark a particular house as sold");
        System.out.println("13. Display list of all the sold houses");
    }
    public void displayWelcomeText() {
        System.out.println("---Welecome to Real State Agency Software---");
    }
}
