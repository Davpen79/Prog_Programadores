public class Programador {

    //Atributos
    private String name;
    private int salary;
    private String primaryLanguage;
    private String secondaryLanguage;

    //getters & setters

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    public String getSecondaryLanguage() {
        return secondaryLanguage;
    }

    //constructor

    public Programador(String name, int salary, String primaryLanguage, String secondaryLanguage) {
        this.name = name;
        this.salary = salary;
        this.primaryLanguage = primaryLanguage;
        this.secondaryLanguage = secondaryLanguage;
    }

    //Funciones

    public int updateSalary(int salary, int update) {
        if (salary < update) {
            this.salary = update;
        } else {
            return -1;
        }
        return this.salary;
    }

    public String updateLanguages(String primaryLanguage, String secondaryLanguage, String newLanguage) {
        String infoMessage = null;
        if (newLanguage.equals(secondaryLanguage)) {
            secondaryLanguage = primaryLanguage;
            primaryLanguage = newLanguage;
        } else if (newLanguage.equals(primaryLanguage)) {
            return infoMessage;
        }else {
            secondaryLanguage = primaryLanguage;
            primaryLanguage = newLanguage;
        }

        return this.primaryLanguage;
    }
}
