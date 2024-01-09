package div;

import OpInterface.Operation;

public class DivisionOperation implements Operation<Float> {
    /**
     *
     * @param x any number
     * @param y must be different from 0
     * @return Float value
     * @exception if we try a division by 0, it'll print an exception message
     */
    @Override
    public Float calc(Float x, Float y) {
        Float result = 0f;
        try{
            result = x/y;
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
