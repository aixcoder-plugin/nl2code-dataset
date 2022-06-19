package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AixcoderOld132 extends GenerateMethodBase {
    public String parseDate(String weiboTimeStr)
        { 
// 将字符串转换为日期
Date weiboDate = null ;
try { 
weiboDate = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ) . parse ( weiboTimeStr ) ;
} catch ( ParseException e ) {
e . printStackTrace ( ) ; 
} 
// 将日期转换成时间
Calendar calendar = Calendar . getInstance ( ) ;
calendar . setTime ( weiboDate ) ; 
// 将时间转换成毫秒
long weiboTimeLong = calendar . getTimeInMillis ( ) ; 
// 微博时间转换成秒
long weiboTimeSec = weiboTimeLong / 1000 ; 
// 微博时间转换成分钟
long weiboTimeMin = weiboTimeLong / 60 ; 
// 微博时间转换成小时
long weiboTimeHour = weiboTimeLong / 60 / 60 ; 
// 微博时间转换成天
long weiboTimeDay = weiboTimeLong / 24 ; 
// 微博时间转换成月
long weiboTimeMonth = weiboTimeLong / 30 ; 
// 微博时间转换成年
long weiboTimeYear = weiboTimeLong / 365 ; 
// 微博时间转换成年月日
String weiboTimeYearMonth = weiboTimeYear + "年" + ( weiboTimeMonth + 1 ) + "月" ; 
// 微博时间转换成年月日时分秒
String weiboTimeYearMonthDay = weiboTimeYear + "年" + weiboTimeMonth + "月" + weiboTimeDay + "日" ; 
return weiboTimeYearMonth + "年" + weiboTimeMonth + "月" + weiboTimeDay + "日 " + weiboTimeHour + ":" + weiboTimeMin + ":" + weiboTimeSec ; 
} 
    }
