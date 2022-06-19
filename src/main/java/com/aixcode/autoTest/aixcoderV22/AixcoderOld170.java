package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld170 extends GenerateMethodBase {
    public String getLunarDate(int year_log, int month_log, int day_log)
        { 
String message = "" ; 
if ( year_log > 0 ) { 
if ( month_log > 0 ) { 
if ( day_log > 0 ) { 
message = year_log + "年" + month_log + "月" + day_log + "日" ; 
} else { 
message = year_log + "年" + month_log + "月" + " 日" ; 
} 
} else { 
if ( day_log > 0 ) { 
message = year_log + "年" + "月" + day_log + "日" ; 
} else { 
message = year_log + "年" + "月" + " 日" ; 
} 
} 
} else { 
if ( month_log > 0 ) { 
if ( day_log > 0 ) { 
message = month_log + "月" + day_log + "日" ; 
} else { 
message = month_log + "月" + " 日" ; 
} 
} else { 
if ( day_log > 0 ) { 
message = day_log + "日" ; 
} else { 
message = "日" ; 
} 
} 
} 
return message ; 
} 
    }
