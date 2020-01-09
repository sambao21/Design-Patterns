package com.facade.practice;

import java.sql.Connection;

//helper calss to test facade
public class FacadeTest {
    public static void main(String[] args) {
       String tablename = "Employee";

       //generating report using facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,HelperFacade.ReportType.HTML,tablename);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,HelperFacade.ReportType.PDF,tablename);

        //generating report without using facade
        Connection con = MyOracleHelper.getMyOracleConnection();
        Connection con1 = MySqlHelper.getMySqlConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        MyOracleHelper myOracleHelper = new MyOracleHelper();
        myOracleHelper.getMyOraclePDFReport(tablename,con);
        mySqlHelper.generateMySqlPDFReport(tablename,con);

    }
}
