package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class AixcoderOld128 extends GenerateMethodBase {
    public Calendar clearTo(Calendar c, int field)
        { 
int i = (int) ( c . getTimeInMillis ( ) ) ;
if ( i == field ) { 
// clear all time values
c . clear ( ) ; 
} else if ( i < field ) { 
// clear all time values less than the given field
c . clear ( field ) ; 
} else { 
// clear all time values greater than the given field
c . clear ( field ) ; 
// we are clearing all fields beyond the given field
if ( field == Calendar . DAY_OF_MONTH ) { 
c . set ( Calendar . DAY_OF_MONTH , 1 ) ; 
c . clear ( Calendar . HOUR_OF_DAY ) ; 
c . clear ( Calendar . MINUTE ) ; 
c . clear ( Calendar . SECOND ) ; 
c . clear ( Calendar . MILLISECOND ) ; 
} else if ( field == Calendar . MONTH ) { 
c . set ( Calendar . DAY_OF_MONTH , 1 ) ; 
c . clear ( Calendar . HOUR_OF_DAY ) ; 
c . clear ( Calendar . MINUTE ) ; 
c . clear ( Calendar . SECOND ) ; 
c . clear ( Calendar . MILLISECOND ) ; 
} else if ( field == Calendar . YEAR ) { 
c . clear ( Calendar . DAY_OF_MONTH ) ; 
c . clear ( Calendar . HOUR_OF_DAY ) ; 
c . clear ( Calendar . MINUTE ) ; 
c . clear ( Calendar . SECOND ) ; 
c . clear ( Calendar . MILLISECOND ) ; 
} 
} 
return c ; 
} 
    }
