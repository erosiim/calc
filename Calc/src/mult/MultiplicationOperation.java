package mult;

import OpInterface.Operation;

public class MultiplicationOperation implements Operation<Integer> {
    @Override
    public Integer calc(Integer x, Integer y) {
        return Math.multiplyExact(x,y);
    }
}
