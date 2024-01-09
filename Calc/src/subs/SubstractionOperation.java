package subs;

import OpInterface.Operation;

public class SubstractionOperation implements Operation<Integer> {


    @Override
    public Integer calc(Integer x, Integer y) {
        return x-y;
    }

}
