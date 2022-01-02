/* Crie uma classe Pessoa (abstrata) com as seguintes propriedades: nome e endereço. Implemente os métodos getters e setters. Implemente o método abstrato mostraTipo();
*/
public abstract class  Pessoa {
    
    private String nome;
    private String endereco;


    

    public Pessoa(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public abstract void mostraTipo();
    
}
