package kr.co.bzsys.study.controller;

import static junit.framework.TestCase.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
public class DbConnectionController {

  static {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  @RequestMapping(value = "/dbConnection")
  public void testConnection() {
    ResultSet rs = null;
    Connection con = null;
    PreparedStatement stmt = null;

    try {
      String dbUrl = "jdbc:oracle:thin:@mp-dev-leehyun:1521:xe";
      con = DriverManager.getConnection(dbUrl, "leehyun", "leehyun");
      stmt = con.prepareStatement("SELECT title FROM board");
      rs = stmt.executeQuery();
      while (rs.next()) {
        String title = rs.getString("title");
        System.out.println(title);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        rs.close();
        stmt.close();
        con.close();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }

}
