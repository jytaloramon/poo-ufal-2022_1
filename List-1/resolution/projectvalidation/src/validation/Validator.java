package validation;

public class Validator {

    public static void runValidation(IEntityValidation e) {
        System.out.println(e + " -> " + (e.isValid() ? "É válido" : "Não é válido"));
    }

}
