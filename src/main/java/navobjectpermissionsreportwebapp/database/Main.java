package navobjectpermissionsreportwebapp.database;

public class Main {


    public static void main(String[] args) {
        //System.out.println(Data.GetConnectionURL());
        System.out.println("URL: " + Data.GetConnectionURL());
        Data data = new Data();
        //System.out.println(data.GetData());
        System.out.println("Rows count: " + data.GetRowsCount());


    }
}

