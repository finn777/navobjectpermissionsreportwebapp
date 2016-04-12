package navobjectpermissionsreportwebapp.database;

import java.util.ArrayList;
import java.util.Collection;

public class Main {


    public static void main(String[] args) {
        //System.out.println(Data.GetConnectionURL());
        System.out.println("URL: " + Data.getConnectionURL());
        Data data = new Data();
        //System.out.println(data.GetData());
        System.out.println("Rows count: " + data.getRowsCount());
        ArrayList<Row> rows = data.getRows("TableData",17);
        if (rows != null) {
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
}

