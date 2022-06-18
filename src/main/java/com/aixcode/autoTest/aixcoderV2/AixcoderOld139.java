package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld139 extends GenerateMethodBase {
        public Type [ ] getArgumentTypes ( String signature ) { 
ArrayList vec = new ArrayList ( ) ; 
int index ; 
Type [ ] types ; 
try { 
// Read all declarations between for `(' and `)'
if ( signature . charAt ( 0 ) != '(' ) 
throw new ClassFormatException ( "Invalid method signature: " + signature ) ; 
// current string position
index = 1 ; 
while ( signature . charAt ( index ) != ')' ) { 
vec . add ( getType ( signature . substring ( index ) ) ) ; 
// update position
index += consumed_chars ; 
} 
} catch ( StringIndexOutOfBoundsException e ) { 
// Should never occur
throw new ClassFormatException ( "Invalid method signature: " + signature ) ; 
} 
types = new Type [ vec . size ( ) ] ; 
vec . toArray ( types ) ; 
return types ; 
} 
    }
