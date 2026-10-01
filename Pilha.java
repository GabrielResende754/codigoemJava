class Pilha {
    int[] elementos;
    int numero_elementos;

    public Pilha(int t) {
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

    //EMPILHAR - adiciona no topo (é uma pilha espera o que? EX pilha de pratos)
    public void empilhar(int valor) {
        if (estaCheia()) {
            System.out.println("Pilha esta cheia!");
        } else {
            elementos[numero_elementos] = valor;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha esta vazia!");
            return -1;
        } else {
            int indice = numero_elementos - 1;
            int elemento_removido = elementos[indice];

            numero_elementos = numero_elementos - 1;

            return elemento_removido;
        }
    }

    public int topo() {
        if (estaVazia()) {
            System.out.println("Pilha esta vazia!");
            return -1;
        } else {
            return elementos[numero_elementos - 1];
        }
    }

    public int getQuantidade() {
        return numero_elementos;
    }

    public void exibirElementos() {
        if (estaVazia()) {
            System.out.println("Pilha esta vazia!");
        } else {
            for (int i = 0; i < numero_elementos; i++) {
                System.out.println(elementos[i]);
            }
        }
    }

    public int pesquisarElemento(int valor) {
        if (estaVazia()) {
            System.out.println("Pilha esta vazia!");
        } else {
            for (int i = 0; i < numero_elementos; i++) {
                if (elementos[i] == valor) {
                    return i;
                }
            }
        }

        return -1;
    }

    public int retornarElemento(int pos) {
        return elementos[pos];
    }
}
