package navobjectpermissionsreportwebapp.database;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        System.out.println("URL: " + Data.getConnectionURL());
        Data data = new Data();
        System.out.println("Rows count: " + data.getRowsCount());
        System.out.println("");
        ArrayList<String> types = data.getTypes();
        for (int i = 0; i < types.size(); i++) {
            System.out.println(types.get(i)+";");
        }
        System.out.println("");
        ArrayList<Row> rows = data.getRows("TableData",17);
        for (int i = 0; i < rows.size(); i++) {
            System.out.print(rows.get(i).getObjecttype()+";");
            System.out.print(rows.get(i).getModulename()+";");
            System.out.print(rows.get(i).getVersionname()+";");
            System.out.print(rows.get(i).getRead()+";");
            System.out.print(rows.get(i).getInsert()+";");
            System.out.print(rows.get(i).getModify()+";");
            System.out.print(rows.get(i).getDelete()+";");
            System.out.print(rows.get(i).getExecute()+";");
            System.out.print(rows.get(i).getProductline()+";");
            System.out.println();
        }
    }
}

