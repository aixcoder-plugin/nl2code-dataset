package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aixcoder132 extends GenerateMethodBase {
        public String parseDate ( String weiboTimeStr ) { 
// 将字符串转换为日期
//Date weiboTime = parseWeiboDate ( weiboTimeStr ) ;
// 创建一个日期格式
SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss" ) ;
// 将时间转换为字符串
String weiboTimeStr2 = sdf . format ( weiboTimeStr ) ;
return weiboTimeStr2 ; 
} 
    }
