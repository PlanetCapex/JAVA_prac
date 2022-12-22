package ru.mirea.lab13.n3;

public class Address {
    private String country;
    private String district;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    Address(String s, String separator) {
        String[] info;
        info = s.split(separator);
        this.country = info[0];
        this.district = info[1];
        this.city = info[2];
        this.street = info[3];
        this.house= info[4];
        this.building = info[5];
        this.flat = info[6];
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (count == 0) {
//                if (s.charAt(i) != separator) {
//                    this.country += s.charAt(i);
//                }
//                else count += 1;
//            }
//            if (count == 1) {
//                if (s.charAt(i) != separator) {
//                    this.district += s.charAt(i);
//                }
//                else count += 1;
//            }
//            if (count == 2) {
//                if (s.charAt(i) != separator) {
//                    this.city += s.charAt(i);
//                }
//                else count += 1;
//            }
//            if (count == 3) {
//                if (s.charAt(i) != separator) {
//                    this.street += s.charAt(i);
//                }
//                else count += 1;
//            }
//            if (count == 4) {
//                if (s.charAt(i) != separator) {
//                    this.house += s.charAt(i);
//                }
//                else count += 1;
//            }
//            if (count == 5) {
//                if (s.charAt(i) != separator) {
//                    this.building += s.charAt(i);
//                }
//                else count += 1;
//            }
//            if (count == 6) {
//                if (s.charAt(i) != separator) {
//                    this.flat += s.charAt(i);
//                }
//                else count += 1;
//            }
    }

    public String getCountry() { return country; }

    public String getDistrict() { return district; }

    public String getCity() { return city; }

    public String getStreet() { return street; }

    public String getHouse() { return house; }

    public String getBuilding() { return building; }

    public String getFlat() { return flat; }
}
