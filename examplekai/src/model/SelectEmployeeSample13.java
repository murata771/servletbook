package model;
import java.util.List;

import dao.EmployeeDAO13;
public class SelectEmployeeSample13 {
  public static void main(String[] args) {

    // employeeテーブルの全レコードを取得
    EmployeeDAO13 empDAO = new EmployeeDAO13();
    List<Employee13> empList = empDAO.findAll();

    // 取得したレコードの内容を出力
    for (Employee13 emp : empList) {
      System.out.println("ID:" + emp.getId());
      System.out.println("名前:" + emp.getName());
      System.out.println("年齢:" + emp.getAge() + "\n");
    }
  }
}//13章のサンプルプログラム