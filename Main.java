class Lista {
    int[] elementos;
    int numero_elementos;

public Lista (int t){
    int [] elementos = new int[t];
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
        if (numero_elementos == elementos.length){
            return true;
        } else {
            return false;
        }
    }
public void adicionarFinal(int e){
    if (estaCheia()){
        System.out.println("Estrutura esta cheia!");
    } else {
        elementos[numero_elementos] = e;
        numero_elementos = numero_elementos + 1;
    }
}
public int removerFinal(){
    if (estaVazia()){
        System.out.println("Estrutura vazia!");
        return -1;
    } else {
        int indice = numero_elementos -1;
        int elemento_removido = elementos[indice];
        numero_elementos = indice;
        return elemento_removido;
    }

}








}