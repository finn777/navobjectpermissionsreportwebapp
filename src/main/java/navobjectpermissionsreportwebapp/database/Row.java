package navobjectpermissionsreportwebapp.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Row {
    private String objecttype; // Module ID
    private String modulename; // Module Description
    private String versionname; // Country
    private String read; // Read
    private String insert; // Insert
    private String modify; // Modify
    private String delete; // Delete
    private String execute; // Execute
    private String productline; // Product Line

    public Row(ResultSet rs) throws SQLException {
        setObjecttype(rs.getString(1));
        setModulename(rs.getString(2));
        setVersionname(rs.getString(3));
        setRead(rs.getString(4));
        setInsert(rs.getString(5));
        setModify(rs.getString(6));
        setDelete(rs.getString(7));
        setExecute(rs.getString(8));
        setProductline(rs.getString(9));
    }

    public String getObjecttype() {
        return objecttype;
    }

    public void setObjecttype(String objecttype) {
        this.objecttype = objecttype;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getInsert() {
        return insert;
    }

    public void setInsert(String insert) {
        this.insert = insert;
    }

    public String getModify() {
        return modify;
    }

    public void setModify(String modify) {
        this.modify = modify;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getExecute() {
        return execute;
    }

    public void setExecute(String execute) {
        this.execute = execute;
    }

    public String getProductline() {
        return productline;
    }

    public void setProductline(String productLine) {
        this.productline = productLine;
    }
}
