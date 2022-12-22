package n4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class CatalogFinder {
    public CatalogFinder() {}
    public static void fillByCatalog(String path) throws Exception {
        File f = new File(path);
        String[] fileArray = null;
        if (f.exists()||f.isDirectory()) fileArray = f.list(null);
        else {
            throw new Exception("Catalog not found");
        }
        ArrayList<String> list = new ArrayList(Arrays.asList(fileArray));

        for (int i =0; i < list.size(); i++) {
            if(i < 5) System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) throws Exception {
        fillByCatalog("C:");
    }
}
