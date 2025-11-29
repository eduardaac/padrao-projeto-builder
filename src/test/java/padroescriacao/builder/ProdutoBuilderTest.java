package padroescriacao.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoBuilderTest {

    @Test
    void deveRetornarExcecaoParaProdutoSemCodigo() {
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setNome("Notebook X10")
                    .setPreco(5500.00)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código do Produto inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaProdutoSemNome() {
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setCodigo(101)
                    .setPreco(5500.00)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do Produto inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarProdutoValido() {
        ProdutoBuilder produtoBuilder = new ProdutoBuilder();
        Produto produto = produtoBuilder
                .setCodigo(101)
                .setNome("Notebook X10")
                .setMarca("TechCorp")
                .setPreco(5500.00)
                .setCor("Prata")
                .build();

        assertNotNull(produto);
    }
}