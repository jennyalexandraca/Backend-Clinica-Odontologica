package com.odont.util;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class JDBCHelper {

    public static Timestamp dateTimeStamp(Date date){
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }

    //Date to SQL Date converter
    public static java.sql.Date utilDateToSqlDate(Date utilDate){
        long timeInMiliSeconds = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(timeInMiliSeconds);
        return sqlDate;
    }

}
