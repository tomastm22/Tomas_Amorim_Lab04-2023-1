package list;

public class PilhaNeto implements Pilha {

    ListaLigada l;

    public Pilha(){

        l = new ListaLigada();

    }

    public boolean isEmpty(){
        
        return l.buscaIndice(0) == -1;

    }

    public void push(int valor){

        l.insereInicio(valor);

    }

    public int pop(){

        n = l.buscaIndice(0);
        l.removeInicio();
        return n;

    }

}