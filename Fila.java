class Fila {
    int[] elementos;
    int numero_elementos;

    public Fila(int t) {
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

    // ENFILEIRAR - adiciona no final da fila (é uma fila esperava o que?)
    public void enfileirar(int valor) {
        if (estaCheia()) {
            System.out.println("Fila esta cheia!");
        } else {
            elementos[numero_elementos] = valor;
            numero_elementos = numero_elementos + 1;
        }
    }

    // DESENFILEIRAR - remove o primeiro elemento (continua sendo uma fila)
    public int desenfileirar() {
        if (estaVazia()) {
            System.out.println("Fila esta vazia!");
            return -1;
        } else {
            int elemento_removido = elementos[0];

            for (int i = 0; i < numero_elementos - 1; i++) {
                elementos[i] = elementos[i + 1];
            }

            numero_elementos = numero_elementos - 1;

            return elemento_removido;
        }
    }

    // CONSULTAR O PRIMEIRO ELEMENTO (vai ver o caba que chegou cedo na fila)
    public int frente() {
        if (estaVazia()) {
            System.out.println("Fila esta vazia!");
            return -1;
        } else {
            return elementos[0];
        }
    }

    // OBTER TAMANHO DA FILA
    public int getQuantidade() {
        return numero_elementos;
    }

    // EXIBIR OS ELEMENTOS
    public void exibirElementos() {
        if (estaVazia()) {
            System.out.println("Fila esta vazia!");
        } else {
            for (int i = 0; i < numero_elementos; i++) {
                System.out.println(elementos[i]);
            }
        }
    }

    // PESQUISAR UM ELEMENTO (vai procurar um caba especifico da fila)
    public int pesquisarElemento(int valor) {
        if (estaVazia()) {
            System.out.println("Fila esta vazia!");
        } else {
            for (int i = 0; i < numero_elementos; i++) {
                if (elementos[i] == valor) {
                    return i;
                }
            }
        }

        return -1;
    }

    // RETORNAR ELEMENTO DE UMA POSIÇÃO
    public int retornarElemento(int pos) {
        return elementos[pos];
    }
}
