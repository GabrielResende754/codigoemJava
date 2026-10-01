public class ListaEstatica02 {
    public class ListaEstatica {
        int[] elementos;
        int numero_elementos;

        public ListaEstatica02(int t) {
            elementos = new int[t];
            numero_elementos = 0;
        }
        public boolean estaVazia() {
            if (numero_elementos == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean estaCheia() {
            if (numero_elementos == elementos.length) {
                return true;
            } else {
                return false;
            }
        }
        public int alterarValor(int pos, int valor){
            return elementos[pos] = valor;
        }
        public int retornarElementos(int pos){
            return elementos[pos];
        }
        public void inverterLista(){
            int inicio = 0;
            int fim = numero_elementos - 1;
            while(inicio < fim){
                int auxiliar = retornarElementos(fim);
                alterarValor(inicio, retornarElementos(fim));
                alterarValor(fim, auxiliar);
                inicio++;
                fim--;
            }
        }
    }
}
