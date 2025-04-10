public class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void display() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        Device d=new Device("ndsviuv281", "on");
        d.display();
        Thermostat th = new Thermostat("T1234", "ON", 22.5);
        th.display();
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void display() {
        super.display();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

