public class Program {

    public static void main(String[] args) {

        Programador programadorJavier = new Programador("Javier", 22000, "Java", "c#");

        System.out.println("Estos son los datos actuales de tu programador");
        System.out.println("Nombre: " + programadorJavier.getName());
        System.out.println("Salario: " + programadorJavier.getSalary() + " Euros");
        System.out.println("Lenguaje de programación: " + programadorJavier.getPrimaryLanguage());



    }
}
