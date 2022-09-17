package personal;

import validation.IEntityValidation;

public abstract class Person implements IEntityValidation {

    @Override
    public String toString() {
        return "Type: Person";
    }

}
