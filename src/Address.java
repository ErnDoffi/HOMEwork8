public class Address {
    private String city;
    private String region;

    Address(String city, String region) {
        this.city = city;
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }
}
