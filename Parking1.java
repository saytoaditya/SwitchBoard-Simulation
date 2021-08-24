import java.util.Scanner;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
class Booking{
    int parkingNo;
    int vehicleNo;
    int inTime;
    VehicleType vehicleType;
    Booking(int parkingNo,int vehicleNo,int inTime,VehicleType vehicleType)
    {
        this.parkingNo=parkingNo;
        this.vehicleNo=vehicleNo;
        this.inTime=inTime;
        this.vehicleType=vehicleType;
    }
}
class Parking1
{
    enum VehicleType{
        car,
        bike,
        heavy
    }
    public static void main(String[] args)
    {
        int temp=1,totalSlot=0;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome In parking Lot System"); 
        Scanner scan=new Scanner(System.in);
        VehicleType arr[]=VehicleType.values();
        for(VehicleType value:arr)
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("Enter available " +value+ " parking slot");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int slot=scan.nextInt();
            totalSlot+=slot;
        }
        HashMap<String,Booking> vehicle=new HashMap<String,Booking>(totalSlot);
        while(temp==1)
        {
            System.out.println("1 Slot Availablity Of Vehicle");
            System.out.println("2 parking slot booking");
            System.out.println("3 remove parking ");
            System.out.println("4 exit ");
            int option=scan.nextInt();
            switch(option)
            {
                case 1:
                        showAvailableParking(car,bike,heavy);
                        break;
                case 2:
                        addParking(vehicle);
                        //ticket();
                        break;
                case 3:
                        emptyParking(car,bike,heavy);
                        break;
                case 4:
                        temp=0;
                         break;
            }
        }
    }
    public static void addParking(HashMap<String,Booking> vehicle);
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("For Which Vehicle You want to add praking");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        VehicleType arr[]=VehicleType.values();
        int sno=1;
        for(VehicleType val:arr)
        {
            System.out.println(+sno+". "+val);
            sno++;
        }
        int choice=scan.nextInt();
                            System.out.println("Enter  number of car");
                            int carvehicleNo=scan.nextLine(); 
                            System.out.println("Enter  Intime of car");
                            int inTime=scan.netInt(); 
                            
                            if(car.conatinsKey(carvehicleNo))
                            break;
                            else
                            Booking obj = new Booking(vehicleNo,parkingNo,inTime);
                            car.put(carvehicleNo,obj);
        }  
    }
}