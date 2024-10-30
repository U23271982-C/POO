package contenido.Week02.AdditionalExercise;

public class Test {
    public static void main(String[] args) throws Exception {
        Beneficiaria beneficiaria = new Beneficiaria(6);
        beneficiaria.CalcularTotal();
        System.out.println(beneficiaria.ShowMember(8432));
        System.out.println(beneficiaria.ShowMember("Namal"));
    }
}
