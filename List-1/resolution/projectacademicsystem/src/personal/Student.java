package personal;

import academic.grade.GradeManager;

public class Student {

    private final String code;
    private String fullName;
    private GradeManager gradeManager;

    public Student(String code, String fullName, GradeManager gradeManager) throws Exception {
        if (!code.startsWith("201") || code.length() != 8)
            throw new Exception("Código inválido");

        this.code = code;
        setFullName(fullName);
        setGradeManager(gradeManager);
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws Exception {
        if (fullName.length() > 50)
            throw new Exception("Nome muito grande");

        if (fullName.indexOf(" ") == -1)
            throw new Exception("Não possui dois nomes");

        this.fullName = fullName;
    }

    public GradeManager getGradeManager() {
        return gradeManager;
    }

    public void setGradeManager(GradeManager gradeManager) throws Exception {
        if (gradeManager == null)
            throw new Exception("Gerenciador de notas é necessário");

        this.gradeManager = gradeManager;
    }

}
