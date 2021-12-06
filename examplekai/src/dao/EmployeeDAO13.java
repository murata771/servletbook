package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee13;

public class EmployeeDAO13 {
  // データベース接続に使用する情報
  private final String JDBC_URL =
          "jdbc:mysql://localhost/example";
  private final String DB_USER = "root";
  private final String DB_PASS = "Yu583hz5kr3&";

  public List<Employee13> findAll() {
    List<Employee13> empList = new ArrayList<Employee13>();

    // データベースへ接続
    try (Connection conn = DriverManager.getConnection(
        JDBC_URL, DB_USER, DB_PASS)) {

      // SELECT文を準備
      String sql = "SELECT ID, NAME, AGE FROM employee";
      PreparedStatement pStmt = conn.prepareStatement(sql);

      // SELECTを実行し、結果表を取得
      ResultSet rs = pStmt.executeQuery();

      // 結果表に格納されたレコードの内容を
      // Employeeインスタンスに設定し、ArrayListインスタンスに追加
      while (rs.next()) {
        String id = rs.getString("ID");
        String name = rs.getString("NAME");
        int age = rs.getInt("AGE");
        Employee13 employee = new Employee13(id, name, age);
        empList.add(employee);
      }
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
    return empList;
  }
  public boolean remove(String id) {
	  try (Connection conn = DriverManager.getConnection(
		        JDBC_URL, DB_USER, DB_PASS)) {
		  String sql="DELETE from employee where ID=?";
		  PreparedStatement psmt=conn.prepareStatement(sql);
		  psmt.setString(1, id);
		  int delcan=psmt.executeUpdate();
		  if(delcan!=1) {return false;}
		  else if(delcan==0) {
			  return false;
		  }
		  
	  }
	  catch(SQLException e) {
		  e.printStackTrace();
		  return false;
	  }
	  return true;
  }
}