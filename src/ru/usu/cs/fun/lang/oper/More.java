package ru.usu.cs.fun.lang.oper;

import ru.usu.cs.fun.back.Term;
import ru.usu.cs.fun.lang.Bool;

public class More extends Operation {

    public More(String representation) {
        super(representation);
    }

    protected Term calculate(int arg1, int arg2) {
        return (arg1 > arg2) ? Bool.TRUE : Bool.FALSE;
    }

    protected Term calculate(float arg1, float arg2) {
        return (arg1 > arg2) ? Bool.TRUE : Bool.FALSE;
    }
}
