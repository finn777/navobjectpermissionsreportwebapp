package navobjectpermissionsreportwebapp.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Row {
    private int DataID;
    private String ObjectType; // Module ID
    private int ModuleID; // Module ID
    private String ModuleName; // Module Description
    private String VersionName; // Country
    private String Read; // Read
    private String Insert; // Insert
    private String Modify; // Modify
    private String Delete; // Delete
    private String Execute; // Execute
    private String ProductLine; // Product Line

    public Row(ResultSet rs) throws SQLException {
        setDataID(rs.getInt(1));
        setObjectType(rs.getString(2));
        setModuleID(rs.getInt(3));
        setModuleName(rs.getString(4));
        setVersionName(rs.getString(5));
        setRead(rs.getString(6));
        setInsert(rs.getString(7));
        setModify(rs.getString(8));
        setDelete(rs.getString(9));
        setExecute(rs.getString(10));
        setProductLine(rs.getString(11));
    }

    public int getDataID() {
        return DataID;
    }

    public void setDataID(int dataID) {
        DataID = dataID;
    }

    public String getObjectType() {
        return ObjectType;
    }

    public void setObjectType(String objectType) {
        ObjectType = objectType;
    }

    public int getModuleID() {
        return ModuleID;
    }

    public void setModuleID(int moduleID) {
        ModuleID = moduleID;
    }

    public String getModuleName() {
        return ModuleName;
    }

    public void setModuleName(String moduleName) {
        ModuleName = moduleName;
    }

    public String getVersionName() {
        return VersionName;
    }

    public void setVersionName(String versionName) {
        VersionName = versionName;
    }

    public String getRead() {
        return Read;
    }

    public void setRead(String read) {
        Read = read;
    }

    public String getInsert() {
        return Insert;
    }

    public void setInsert(String insert) {
        Insert = insert;
    }

    public String getModify() {
        return Modify;
    }

    public void setModify(String modify) {
        Modify = modify;
    }

    public String getDelete() {
        return Delete;
    }

    public void setDelete(String delete) {
        Delete = delete;
    }

    public String getExecute() {
        return Execute;
    }

    public void setExecute(String execute) {
        Execute = execute;
    }

    public String getProductLine() {
        return ProductLine;
    }

    public void setProductLine(String productLine) {
        ProductLine = productLine;
    }
}
