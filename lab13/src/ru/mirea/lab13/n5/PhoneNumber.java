package ru.mirea.lab13.n5;

public class PhoneNumber {
    private String countryNum;
    private String regionNum;
    private String operatorNum;
    private String personNum;

    PhoneNumber(String str) {
        if (str.charAt(0) == '+') {
            this.countryNum = str.substring(1, 2);
            this.regionNum = str.substring(2, 5);
            this.operatorNum = str.substring(5, 8);
            this.personNum = str.substring(8);
        }
        else {
            if (str.charAt(0) == '8') {
                this.countryNum = "7";
            }
            else this.countryNum = str.substring(0,1);
            this.regionNum = str.substring(1, 4);
            this.operatorNum = str.substring(4, 7);
            this.personNum = str.substring(7);
        }
    }

    @Override
    public String toString() {
        return "+" + this.countryNum + " " + this.regionNum + "-" +
                this.operatorNum + "-" + this.personNum;
    }
}
