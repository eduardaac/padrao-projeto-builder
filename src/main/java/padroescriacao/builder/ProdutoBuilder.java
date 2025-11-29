package padroescriacao.builder;

public class ProdutoBuilder {

    private Produto produto;

    public ProdutoBuilder() {
        produto = new Produto();
    }

    public Produto build() {
        if (produto.getCodigo() == 0) {
            throw new IllegalArgumentException("Código do Produto inválido");
        }
        if (produto.getNome().equals("")) {
            throw new IllegalArgumentException("Nome do Produto inválido");
        }
        return produto;
    }

    public ProdutoBuilder setCodigo(int codigo) {
        produto.setCodigo(codigo);
        return this;
    }

    public ProdutoBuilder setNome(String nome) {
        produto.setNome(nome);
        return this;
    }

    public ProdutoBuilder setMarca(String marca) {
        produto.setMarca(marca);
        return this;
    }

    public ProdutoBuilder setModelo(String modelo) {
        produto.setModelo(modelo);
        return this;
    }

    public ProdutoBuilder setPreco(double preco) {
        produto.setPreco(preco);
        return this;
    }

    public ProdutoBuilder setCor(String cor) {
        produto.setCor(cor);
        return this;
    }

    public ProdutoBuilder setPeso(double peso) {
        produto.setPeso(peso);
        return this;
    }

    public ProdutoBuilder setDimensoes(String dimensoes) {
        produto.setDimensoes(dimensoes);
        return this;
    }

    public ProdutoBuilder setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        produto.setQuantidadeEmEstoque(quantidadeEmEstoque);
        return this;
    }

    public ProdutoBuilder setLocalizacaoEstoque(String localizacaoEstoque) {
        produto.setLocalizacaoEstoque(localizacaoEstoque);
        return this;
    }

    public ProdutoBuilder setCodigoDeBarras(String codigoDeBarras) {
        produto.setCodigoDeBarras(codigoDeBarras);
        return this;
    }

    public ProdutoBuilder setNomeFornecedor(String nomeFornecedor) {
        produto.setNomeFornecedor(nomeFornecedor);
        return this;
    }

    public ProdutoBuilder setTelefoneFornecedor(String telefoneFornecedor) {
        produto.setTelefoneFornecedor(telefoneFornecedor);
        return this;
    }

    public ProdutoBuilder setEmailFornecedor(String emailFornecedor) {
        produto.setEmailFornecedor(emailFornecedor);
        return this;
    }
}