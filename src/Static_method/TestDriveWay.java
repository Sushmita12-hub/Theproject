package Static_method;

public class TestDriveWay {
    public static void main(String[] args) {
        DriveWay somaDriveWay = new DriveWay();
        somaDriveWay.setDriveWaySize(12);
        System.out.println("Soma's DriveWay Size:" + somaDriveWay.getDrivewaysize());

        DriveWay rishaanDriveWay = new DriveWay();
        rishaanDriveWay .setDriveWaySize(14);
        System.out.println("Rishaan's DriveWay Size:" + rishaanDriveWay.getDrivewaysize());

        System.out.println( "Soma's DriveWay Size:" + somaDriveWay.getDrivewaysize());
    }
}
