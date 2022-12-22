package ru.mirea.lab13.n4;
import java.util.ArrayList;

public class TestShirt {
    public static void main(String[] args) {
        String[] shirtsSTR = new String[11];
        shirtsSTR[0] = "S001,Black Polo Shirt,Black,XL";
        shirtsSTR[1] = "S002,Black Polo Shirt,Black,L";
        shirtsSTR[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirtsSTR[3] = "S004,Blue Polo Shirt,Blue,M";
        shirtsSTR[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirtsSTR[5] = "S006,Black T-Shirt,Black,XL";
        shirtsSTR[6] = "S007,White T-Shirt,White,XL";
        shirtsSTR[7] = "S008,White T-Shirt,White,L";
        shirtsSTR[8] = "S009,Green T-Shirt,Green,S";
        shirtsSTR[9] = "S010,Orange T-Shirt,Orange,S";
        shirtsSTR[10] = "S011,Maroon Polo Shirt,Maroon,S";
        ArrayList<Shirt> data = new ArrayList<>();
        for (String str : shirtsSTR) {
            Shirt tmp = new Shirt(str);
            data.add(tmp);
        }

        for (Shirt tmp : data) {
            System.out.println(tmp);
        }
    }

}
