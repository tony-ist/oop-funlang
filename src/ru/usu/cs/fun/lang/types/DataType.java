package ru.usu.cs.fun.lang.types;

import ru.usu.cs.fun.back.Term;

public abstract class DataType extends Term {

    @Override
    public Term substitute(String name, Term value) {
        return this;
    }
    
    
}
