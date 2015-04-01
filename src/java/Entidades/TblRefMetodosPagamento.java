package Entidades;
// Generated 31/03/2015 20:14:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TblRefMetodosPagamento generated by hbm2java
 */
public class TblRefMetodosPagamento  implements java.io.Serializable {


     private Integer refMetodosPagamentoCodigo;
     private String refMetodosPagamentoDescricao;
     private Set tblMetodosPagamentoClientes = new HashSet(0);

    public TblRefMetodosPagamento() {
    }

	
    public TblRefMetodosPagamento(String refMetodosPagamentoDescricao) {
        this.refMetodosPagamentoDescricao = refMetodosPagamentoDescricao;
    }
    public TblRefMetodosPagamento(String refMetodosPagamentoDescricao, Set tblMetodosPagamentoClientes) {
       this.refMetodosPagamentoDescricao = refMetodosPagamentoDescricao;
       this.tblMetodosPagamentoClientes = tblMetodosPagamentoClientes;
    }
   
    public Integer getRefMetodosPagamentoCodigo() {
        return this.refMetodosPagamentoCodigo;
    }
    
    public void setRefMetodosPagamentoCodigo(Integer refMetodosPagamentoCodigo) {
        this.refMetodosPagamentoCodigo = refMetodosPagamentoCodigo;
    }
    public String getRefMetodosPagamentoDescricao() {
        return this.refMetodosPagamentoDescricao;
    }
    
    public void setRefMetodosPagamentoDescricao(String refMetodosPagamentoDescricao) {
        this.refMetodosPagamentoDescricao = refMetodosPagamentoDescricao;
    }
    public Set getTblMetodosPagamentoClientes() {
        return this.tblMetodosPagamentoClientes;
    }
    
    public void setTblMetodosPagamentoClientes(Set tblMetodosPagamentoClientes) {
        this.tblMetodosPagamentoClientes = tblMetodosPagamentoClientes;
    }




}


