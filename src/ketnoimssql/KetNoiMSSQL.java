package ketnoimssql;

import java.sql.*;

public class KetNoiMSSQL {  
    
    public static Connection layKetNoi() { 
        Connection ketNoi = null;
        String uRL = "jdbc:sqlserver://;databaseName=QLSACHVAHOCVIEN";
        String userName = "sa";
        String password = "1123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi = DriverManager.getConnection(uRL, userName, password);
            System.out.println("Ket noi CSDL thanh cong");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Khong ket noi duoc voi CSDL");
        }
        return ketNoi;
    }
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//        KetNoiMSSQL kn = new KetNoiMSSQL();
//        kn.layKetNoi();
//    }
}
