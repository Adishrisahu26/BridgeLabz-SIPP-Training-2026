class Device{

    String deviceId;
    String status;

    Device(String deviceId,String status){

        this.deviceId=deviceId;
        this.status=status;
    }

    void displayStatus(){

        System.out.println(deviceId+" "+status);
    }
}

class Thermostat extends Device{

    int temperatureSetting;

    Thermostat(String id,String status,int temp){

        super(id,status);

        temperatureSetting=temp;
    }

    void displayStatus(){

        super.displayStatus();

        System.out.println("Temperature : "+temperatureSetting);
    }

    public static void main(String args[]){

        Thermostat t=new Thermostat("T101","ON",24);

        t.displayStatus();
    }
}