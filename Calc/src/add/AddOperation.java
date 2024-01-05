package add;

import OpInterface.Operation;

public class AddOperation implements Operation<Integer> {

    @Override
    public Integer calc(Integer x, Integer y) {
        return x + y;
    }
}
