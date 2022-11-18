import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice();

        SmartDevice SmartPhone = new SmartDevice("Apple", "Iphone13", 38.8, 2022, false );

        SmartDevice SmartWatch = new SmartDevice("Samsung", "Galaxy 2", 12.5, 2021, true);
        System.out.println(SmartPhone.fabricante);
        System.out.println(SmartPhone.model);
        System.out.println(SmartPhone.peso);
        System.out.println(SmartPhone.year);
        System.out.println(SmartPhone.android);

        System.out.println(SmartWatch.fabricante);
        System.out.println(SmartWatch.model);
        System.out.println(SmartWatch.peso);
        System.out.println(SmartWatch.year);
        System.out.println(SmartWatch.android);
    }
}
