class Lista {
    int[] elementos;
    int numero_elementos;

    public Lista(int t) {
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

    public void adicionarFinal(int valor) {
        if (estaCheia()) {
            System.out.println("Estrutura esta cheia!");
        } else {
            elementos[numero_elementos] = valor;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int removerFinal() {
        if (estaVazia()) {
            System.out.println("Estrutura vazia!");
            return -1;
        } else {
            int indice = numero_elementos - 1;
            int elemento_removido = elementos[indice];
            numero_elementos = indice;
            return elemento_removido;
        }

    }

    public void adicionarInicio(int valor) {
        if (estaCheia()) {
            return;
        } else {
            for (int i = numero_elementos; i >= 1; i--) {
                elementos[i] = elementos[i - 1];
            }
            elementos[0] = valor;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int removerInicio() {
        if (estaVazia()) {
            System.out.println("Da não chefe");
        } else {
            int elemento_removido = elementos[0];
            for (int i = 0; i < numero_elementos - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            numero_elementos = numero_elementos - 1;
            return elemento_removido;
        }
        return -1;
    }

    public void adicionarPosicao(int valor, int pos) {
        if (estaCheia()) {
            return;
        } else {
            if (pos <= 0) {
                adicionarInicio(valor);
            } else if (pos >= numero_elementos) {
                adicionarFinal(valor);
            } else if {
                for (int i = numero_elementos; i > pos; i--) {
                    elementos[i] = elementos[i - 1];
                }
            }
            elementos[pos] = valor;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int removerPosicao(int valor, int pos) {
        if (estaVazia()) {
            System.out.println("Da não chefe");
        } else{
            if(pos <= 0){
                removerInicio();
            } else if(pos >= numero_elementos){
                removerFinal();
            } else if{
                int elemento_removido = elementos[pos];
                for(int i = pos; i < numero_elementos - 1; i++){
                    elementos[i] = elementos[i+1];
                }
                numero_elementos = numero_elementos - 1;
                return elemento_removido;
            }
        }
    }
public void exibirElementos(){
        for(int i = 0; i < numero_elementos; i++){
            System.out.println(elementos[i]);
        }
}
public int pesquisarElemento(int valor){
        if(estaVazia()){
            System.out.println("Da não chefe");
        } else {
            for(int i = 0; i < numero_elementos; i++){
                if(elementos[i] == valor){
                    return i;
                }
            }
        }
        return -1;
}

public int retornarElementos(int pos){
        return elementos[pos];
}
public void removerRepetidos(){
        if(estaVazia()){
            System.out.println("Da não chefe");
        } else {
            for (int i = 0; i < numero_elementos; i++){
                for(int j = i + 1; j < numero_elementos; j++){
                    if(retornarElementos(i) == retornarElementos(j)){
                        removerPosicao(j);
                        j--;
                    }
                }
            }
        }
}




}






