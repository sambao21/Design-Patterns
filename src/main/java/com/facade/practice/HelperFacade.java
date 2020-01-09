package com.facade.practice;

import java.sql.Connection;

public class HelperFacade {
    public static enum DBTypes{
        MYSQL,ORACLE;
    }
    public static enum ReportType{
        HTML,PDF;
    }

    public static void generateReport(DBTypes dbType, ReportType reportType, String tablename){
        Connection con = null;
        switch (dbType){
            case MYSQL:
                con = MySqlHelper.getMySqlConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType){
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tablename,con);
                        break;
                    case HTML:
                        mySqlHelper.generateMyHTMLPDFReport(tablename,con);
                        break;
                }
                break;
            case ORACLE:
                con= MyOracleHelper.getMyOracleConnection();
                MyOracleHelper myOracleHelper = new MyOracleHelper();
                switch (reportType){
                    case HTML:
                        myOracleHelper.getMyOracleHTMLReport(tablename,con);
                        break;
                    case PDF:
                        myOracleHelper.getMyOraclePDFReport(tablename,con);
                        break;
                }
                break;
        }
    }
}
