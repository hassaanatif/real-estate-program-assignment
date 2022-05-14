package com.realestate;

public class RealEstateAgencyCLI {
    CLIMenu cliMenu;
    ProgramLogic programLogic;

    RealEstateAgencyCLI() {
        cliMenu = new CLIMenu();
        cliMenu.displayWelcomeText();
        UserInput.initializeScanner();
        programLogic = new ProgramLogic();
    }

    public void runProgramLoop() {
        while (true) {
            cliMenu.displayMenu();
            int selection = UserInput.recordInt("");
            performValidAction(selection);

        }
    }

    public void performValidAction (int selectionInteger) {
        switch (selectionInteger) {
            case 1:
                sellNewHouse();
        }
    }

    private void sellNewHouse() {
       String name = UserInput.recordString("Please enter your name: ");
       String phoneNo = UserInput.recordString("PLease enter your phone number: ");
        Seller seller = new Seller(name, phoneNo);
        System.out.println();
        String stName = UserInput.recordString("Please enter a street name: ");
        String stNumber = UserInput.recordString("Please enter street number: ");
        String town = UserInput.recordString("Please enter town: ");
        Property property = new Property(stName,stNumber,town);
        property.setSeller(seller);

        boolean tmpBool = programLogic.sellNewHouse(property);
        if (!tmpBool)
            System.out.println("Sorry, properties have reached their maximum limit. Cannot add anymore properties");
        else {
            System.out.println("Successfully added a new property");
            System.out.println(property.getFullAddress());
            System.out.println("");
        }
    }


}
