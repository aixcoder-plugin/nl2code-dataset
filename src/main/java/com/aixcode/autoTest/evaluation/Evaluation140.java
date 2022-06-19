package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation140 extends AbstractBaseEvaluation {
    public Evaluation140(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        List<ByteBuffer> lstBB = new ArrayList<>();
        Map<String, ByteBuffer> mTest = new HashMap<>();
        mTest.put("abcdefgh", ByteBuffer.allocate(8).put("abcdefgh".getBytes()));
        //mTest.put("1213141516171819",ByteBuffer.allocate(50).get(new byte[]{12, 13, 14, 15, 16, 17, 18, 19}));
        mTest.put("ABCDEF",ByteBuffer.allocate(6).put(new byte[]{'A', 'B', 'C', 'D', 'E', 'F'}));

        mTest.put("", ByteBuffer.allocate(0));
        mTest.put(null, null);

        int pass_count = 0;
        int total_count = 0;

        for (Map.Entry<String, ByteBuffer> arrBB : mTest.entrySet()) {
            String str = arrBB.getKey();
            ByteBuffer bb = arrBB.getValue();
            String actualReturn = null;
            try {
                total_count++;
                actualReturn = solution.toString(bb, 0, bb.limit(), Charset.defaultCharset());
                if (actualReturn.equals(str)){
                    pass_count++;
                }
            } catch (Exception e) {
            }

        }

        int startIndex = 7;
        for (Map.Entry<String, ByteBuffer> arrBB : mTest.entrySet()) {
            String str = arrBB.getKey();
            ByteBuffer bb = arrBB.getValue();
            if(bb != null && bb.capacity() > 0) {
                String actualReturn = null;
                try {
                    total_count++;
                    actualReturn = solution.toString(bb, startIndex, bb.limit() > startIndex? bb.limit() - startIndex:0, Charset.defaultCharset());
                    if (bb.capacity() > startIndex && actualReturn.equals(str.substring(startIndex))){
                        pass_count++;
                    }else if(bb.capacity() <= startIndex && actualReturn.equals("")) {
                        pass_count++;
                    }
                } catch (Exception e) {
                }
            }

        }
        return new int[]{pass_count, total_count};
    }
}
