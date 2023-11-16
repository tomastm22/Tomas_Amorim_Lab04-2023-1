package list;

public class FilaNeto implements Fila{

    ListaLigada l;
    No frente;
    No fim;

    public Fila(){

        l = new ListaLigada();
        this.frente = null;
        this.fim = null;

    }

    public void	enqueue(int item){

        No novoNo = new No(item);

        if (isEmpty()) {
            
            frente = fim = novoNo;

        } else {
            
            fim.setProximo(novoNo);
            fim = novoNo;

        }

    }

    public int	dequeue(){

        int x = 0;
         if (this.frente != null) {
            this.frente = this.frente.getProximo();
            x = this.frente.getValor();
         } 

        return x;

    }


    public boolean isEmpty(){
        
        return l.buscaIndice(0) == -1;

    }

    public int	size(){

        int contador = 0;
        No x = frente;
        while (x != null) {
            x = x.getProximo();
            contador ++;
        }

        return contador;

    }

    
}