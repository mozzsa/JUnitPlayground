public class Template {
    private String templateText;

    public Template() {
    }

    public Template(String s) {
        templateText = s;
    }

    public String renderTemplate(int firstNumber, int secondNumber) {
        return String.format(this.templateText, firstNumber, secondNumber);
    }
}
