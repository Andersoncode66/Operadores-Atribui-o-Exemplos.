public class OperadorAtribuição7 {
    public static void main(String[] args) {
        // Operador de Atribuição com '&=' (E Lógico)
        // Este operador realiza uma operação AND bit a bit e atribui o resultado á variável da esquerda.
        int x = 6; // 0110 em binário
        x &= 3; // 0011 em binário
        System.out.println("O valor de x após x &= 3 é: " + x);
    }
}
