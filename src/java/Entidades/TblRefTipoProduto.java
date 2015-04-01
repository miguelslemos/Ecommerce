package Entidades;
// Generated 31/03/2015 20:14:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TblRefTipoProduto generated by hbm2java
 */
public class TblRefTipoProduto  implements java.io.Serializable {


     private Integer refTipoProdutoCodigo;
     private TblRefTipoProduto tblRefTipoProduto;
     private String refTipoProdutoCategoriaProduto;
     private String refTipoProdutoDescricao;
     private Set tblProdutos = new HashSet(0);
     private Set tblRefTipoProdutos = new HashSet(0);

    public TblRefTipoProduto() {
    }

	
    public TblRefTipoProduto(TblRefTipoProduto tblRefTipoProduto, String refTipoProdutoCategoriaProduto, String refTipoProdutoDescricao) {
        this.tblRefTipoProduto = tblRefTipoProduto;
        this.refTipoProdutoCategoriaProduto = refTipoProdutoCategoriaProduto;
        this.refTipoProdutoDescricao = refTipoProdutoDescricao;
    }
    public TblRefTipoProduto(TblRefTipoProduto tblRefTipoProduto, String refTipoProdutoCategoriaProduto, String refTipoProdutoDescricao, Set tblProdutos, Set tblRefTipoProdutos) {
       this.tblRefTipoProduto = tblRefTipoProduto;
       this.refTipoProdutoCategoriaProduto = refTipoProdutoCategoriaProduto;
       this.refTipoProdutoDescricao = refTipoProdutoDescricao;
       this.tblProdutos = tblProdutos;
       this.tblRefTipoProdutos = tblRefTipoProdutos;
    }
   
    public Integer getRefTipoProdutoCodigo() {
        return this.refTipoProdutoCodigo;
    }
    
    public void setRefTipoProdutoCodigo(Integer refTipoProdutoCodigo) {
        this.refTipoProdutoCodigo = refTipoProdutoCodigo;
    }
    public TblRefTipoProduto getTblRefTipoProduto() {
        return this.tblRefTipoProduto;
    }
    
    public void setTblRefTipoProduto(TblRefTipoProduto tblRefTipoProduto) {
        this.tblRefTipoProduto = tblRefTipoProduto;
    }
    public String getRefTipoProdutoCategoriaProduto() {
        return this.refTipoProdutoCategoriaProduto;
    }
    
    public void setRefTipoProdutoCategoriaProduto(String refTipoProdutoCategoriaProduto) {
        this.refTipoProdutoCategoriaProduto = refTipoProdutoCategoriaProduto;
    }
    public String getRefTipoProdutoDescricao() {
        return this.refTipoProdutoDescricao;
    }
    
    public void setRefTipoProdutoDescricao(String refTipoProdutoDescricao) {
        this.refTipoProdutoDescricao = refTipoProdutoDescricao;
    }
    public Set getTblProdutos() {
        return this.tblProdutos;
    }
    
    public void setTblProdutos(Set tblProdutos) {
        this.tblProdutos = tblProdutos;
    }
    public Set getTblRefTipoProdutos() {
        return this.tblRefTipoProdutos;
    }
    
    public void setTblRefTipoProdutos(Set tblRefTipoProdutos) {
        this.tblRefTipoProdutos = tblRefTipoProdutos;
    }




}


