class apartment extends Building{
    int no_of_apartments;
}

class house extends Building{
    int house;
}

public class Building {
     int floor;
    
    public static void main(String[] args) {
        house hou = new house();
        Building h = new house();
        apartment a = new apartment();
        System.out.println("number of floors in this floor is : "+(h.floor=10));
        System.out.println("number of apartments is : "+(a.no_of_apartments=10));
        System.out.println("number of houses in these apartments is : "+(hou.house=100));
    }
}