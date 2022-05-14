package com.realestate;

public class ProgramLogic {
    Property [] properties;
    int totalProperties;
    ProgramLogic() {
        properties = new Property[15];
        totalProperties = 0;
    }
    public boolean sellNewHouse(Property property){
        if (totalProperties >= 15)
            return false;

        properties[totalProperties++] = property;
        return true;
    }
}
