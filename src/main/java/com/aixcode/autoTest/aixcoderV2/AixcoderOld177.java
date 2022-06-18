package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld177 extends GenerateMethodBase {
        public String getProcessId ( ) { 
if ( ! TextUtils . isEmpty ( mProcessId ) ) { 
return mProcessId ; 
} 
if ( Build . VERSION . SDK_INT >= Build . VERSION_CODES . P ) { 
String processId = getProcessIdPreP ( ) ; 
if ( ! TextUtils . isEmpty ( processId ) ) { 
return processId ; 
} 
} 
return getProcessIdPreQ ( ) ; 
} 
    }
