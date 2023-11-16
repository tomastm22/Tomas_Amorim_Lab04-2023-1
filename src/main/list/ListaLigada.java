package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    public ListaLigada() {
        cabeca = null;
    }

    @Override
    public boolean buscaElemento(int valor) {

        No noAtual = this.cabeca;
        
        while(noAtual != null){

            if(noAtual.getValor() == valor){

                return true;
            }

            noAtual = noAtual.getProximo();
        }

        return false;    
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'buscaElemento'");
    }

    @Override
    public int buscaIndice(int valor) {
        
        int indice = 0;
        No noAtual = cabeca;

        while(noAtual != null){

            if(noAtual.getValor() == valor){
                
                return indice;
            }

            indice++;

            noAtual = noAtual.getProximo();
        }
        
        return indice;

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'buscaIndice'");
    }

    @Override
    public int minimo() {
        
        
    if (cabeca == null) {
        throw new IllegalStateException("A lista está vazia. Não é possível encontrar o valor mínimo.");
    }

    No noAtual = cabeca;
    int valorMinimo = noAtual.getValor();

    while (noAtual != null) {

        if (noAtual.getValor() < valorMinimo) {

            valorMinimo = noAtual.getValor();

        }
        
        noAtual = noAtual.getProximo();
    }

    return valorMinimo;

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'minimo'");
    }

    @Override
    public int maximo() {

        
    if (cabeca == null) {
        throw new IllegalStateException("A lista está vazia. Não é possível encontrar o valor máximo.");
    }

    No noAtual = cabeca;
    int valorMaximo = noAtual.getValor();

    noAtual = noAtual.getProximo();

    while (noAtual != null) {

        if (noAtual.getValor() > valorMaximo) {

            valorMaximo = noAtual.getValor();

        }
        
        noAtual = noAtual.getProximo();
    }

    return valorMaximo;

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'maximo'");
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        
        
    if (cabeca == null) {

        cabeca = new No(valor);

    } else {

        No noAtual = cabeca;

        while (noAtual.getProximo() != null) {

            noAtual = noAtual.getProximo();

        }

        noAtual.setProximo(new No(valor));

    }
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'insereElemento'");
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        
            if (buscaIndice == 0) {

                No noAtual = new No(valor);
                noAtual.setProximo(cabeca);
                cabeca = noAtual;
            
            } else {

                No noAtual = cabeca;
                int indice = 0;
                
                while (noAtual != null && indice < buscaIndice - 1) {

                    noAtual = noAtual.getProximo();
                    indice++;
                }
        
                if (noAtual == null) {

                    throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
                }
        
                No no1 = new No(valor);
                no1.setProximo(noAtual.getProximo());
                noAtual.setProximo(no1);
            }
        }
        

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");

    @Override
    public void insereInicio(int valor) {      
        if (this.cabeca == null){           
            this.cabeca = new No(valor);    
        }

        else {
            No n = new No(valor);
            n.setProximo(this.cabeca);
            this.cabeca = n;
        }

    }

    @Override
    public void insereFim(int valor) {
        
            No no1 = new No(valor);
        
            if (cabeca == null) {

                cabeca = no1;

            } else {

                No no2 = cabeca;

                while (no2.getProximo() != null) {

                    no2 = no2.getProximo();

                }

                no2.setProximo(no1);
            }
        }
        
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'insereFim'");

    @Override
    public void remove(int valor) {
        
        if (cabeca == null) {
            return; 
        }
    
        if (cabeca.getValor() == valor) {
            cabeca = cabeca.getProximo();
            return;
        }
    
        No no1 = cabeca;

        while (no1.getProximo() != null && no1.getProximo().getValor() != valor) {

            no1 = no1.getProximo();

        }
    
        if (no1.getProximo() != null) {

            no1.setProximo(no1.getProximo().getProximo());

        }
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeIndice(int indice) {
        
        if (indice < 0) {
            throw new IndexOutOfBoundsException("Índice não pode ser negativo.");
        }
    
        if (indice == 0) {
            if (this.cabeca != null) {
                this.cabeca = this.cabeca.getProximo();
            }
        } else {
            int index = 1;
            No no1 = this.cabeca;
    
            while (no1 != null && index < indice) {
                no1 = no1.getProximo();
                index++;
            }
    
            if (no1 != null && no1.getProximo() != null) {
                no1.setProximo(no1.getProximo().getProximo());
            } else {
                throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
            }
        }
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        
        if (this.cabeca != null) {
            No no1 = this.cabeca.getProximo();
            this.cabeca = no1;
        }

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        
        if (this.cabeca != null) {
            No no1 = this.cabeca;
    
            if (no1.getProximo() == null) {
                this.cabeca = null;
            } else {
                while (no1.getProximo().getProximo() != null) {
                    no1 = no1.getProximo();
                }
                no1.setProximo(null);
            }
        }
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}