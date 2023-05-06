public class Main {
    public static void main(String[] args) {
        String name = "Libor";
        String surname = "Novotný";
        int numberOfContracts = 28;
        double carrotSoldInTons = 62;
        String city = "Turnov";
        String carSpz = "3B33333";
        double vehicleConsumption = 7.9;
        String ipAddress = "192.168.48.39";

        double averageCarrotSoldPerContract = carrotSoldInTons/numberOfContracts;
        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu: " + averageCarrotSoldPerContract + " tun.");
    }
}