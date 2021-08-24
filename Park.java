import java.util.Scanner;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

   
enum VehicleType
{
    BIKE,
    CAR,
    HEAVY
}
enum ParkingLotOperationType
{
    PARK,
    UNPARK,
    STATUS
}

class parkingLot
    {
       public VehicleType vehicleType;
       public int totalParkingSpace;
       public int availableParkingSpace;
       public int fee;
        public parkingLot(VehicleType vehicleType,int totalParkingSpace,int availableParkingSpace,int fee)
        {
            this.vehicleType=vehicleType;
            this.totalParkingSpace=totalParkingSpace;
            this.availableParkingSpace=availableParkingSpace;
            this.fee=fee;
        } 
    }
    class VehicleTicket
    {
        public String vehicleNumber;
        public VehicleType vehicleType;
        public int parkingSlot;
        ////public DateTime InTime;
        public VehicleTicket(String vehicleNumber,VehicleType vehicleType, int parknigSlot)
        {
            this.vehicleType = vehicleType;
            this.vehicleNumber = vehicleNumber;
            this.parkingSlot = parknigSlot;
            ///this.InTime = DateTime.Now;
        }
    }
 public class Park{
    public static void main(String[] args)
    {
        System.out.println("welcome in parking lot simulation");
        Scanner scan = new Scanner(System.in);
        List<parkingLot> parking=new ArrayList<parkingLot>();
        List<VehicleTicket> parkingDetails=new ArrayList<VehicleTicket>();
        for(VehicleType vt:VehicleType.values())
        {
            System.out.println("ENTER Total Parking Space for  "+vt);
            int totalParkingSpace=scan.nextInt();
            int availableParkingSpace=totalParkingSpace;
            System.out.println("ENTER fee for vehicle type : "+vt);
            int fee=scan.nextInt();
            parking.add(new parkingLot(vt,totalParkingSpace,availableParkingSpace,fee));
        }
        
        
        while(true)
        {
            int count=1;
            for(VehicleType vt:VehicleType.values())
            {
                System.out.println(vt);
            }
            String x=scan.nextInt(VehicleType);
            //VehicleType selectedVehicleType = VehicleType.valueOf(x);
                System.out.println(selectedVehicleType);
               System.out.println("Press 1 to Park");
               System.out.println("Press 2 to UnPark");
               System.out.println("Press 3 to Check Parking Lot Occupency and Status");
               System.out.println("Press any other key to Exit");
               int operation=scan.nextInt();
               switch(operation)
                { 
                case 1:

                        // System.out.println("enter vehicle  number");
                        // String vehicleNumber=scan.nextLine();
                        // parkingDetails.add(new VehicleTicket(String vehicleNumber,))
                        break;
                case 2:
                        
                        break;
                case 3:
                        
                        break;
                default:
                        break;
                }
        }
    }
}     