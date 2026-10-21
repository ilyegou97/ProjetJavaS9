public class Aeroport {
    private String IATA;
    private String Name;
    private String country;
    private double latitude;
    private double longitude;

    public Aeroport(String IATA, String Name, String country, double latitude, double longitude) {
        this.IATA = IATA;
        this.Name = Name;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

        public String getIATA() {
        return IATA;
    }
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString (){
                return "Aeroport{IATA=" + IATA + ", Name=" + Name + ", country=" + country + ", latitude=" + latitude + ", longitude=" + longitude + "}";
    }

    public static void main(String[] args) {
        Aeroport cdg = new Aeroport("CDG", "Paris Charles De Gaulle", "FR", 49.0097, 2.5479);
        Aeroport ory = new Aeroport("ORY", "Paris Orly", "FR", 48.7233, 2.3794);

        System.out.println(cdg);
        System.out.println(ory);
        System.out.println("Code de CDG : " + cdg.getIATA());
    }
}