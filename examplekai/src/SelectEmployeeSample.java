import java.util.List;

import dao.EmployeeDAO13;
import model.Employee13;

public class SelectEmployeeSample {
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
 /* String removeon=null;
    System.out.print("DBのデータを消去しますか？消去したい時はremoveと入力してね");
    removeon=new Scanner(System.in).nextLine();
    if(removeon.equals("remove")) {
    	System.out.print("消去する行を手入力してね : EMPなんとかで入力");
    	String id=new Scanner(System.in).nextLine();
    	boolean dao=empDAO.remove(id);
    	if(dao==false) {System.out.println("消去失敗したんだけど。その行DBにないんだけど");}
    	
    }
    empList= empDAO.findAll();
    for (Employee13 emp : empList) {
        System.out.println("ID:" + emp.getId());
        System.out.println("名前:" + emp.getName());
        System.out.println("年齢:" + emp.getAge() + "\n"
      }*/
  }
}