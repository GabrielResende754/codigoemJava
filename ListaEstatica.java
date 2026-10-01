public class ListaEstatica {
    int[] elementos;
    int numero_elementos;

    public ListaEstatica(int t) {
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
    public int retornarElementos(int pos){
        return elementos[pos];
    }
    public void redimencionar(){
        if(estaCheia()){
            int[] novo = new int[elementos.length * 2];
            for (int i = 0; i < numero_elementos; i++){
                novo[i] = retornarElementos(i);
            }
            elementos = novo;
        }
    }
}
