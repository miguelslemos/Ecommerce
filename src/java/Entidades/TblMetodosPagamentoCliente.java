package Entidades;
// Generated 31/03/2015 20:14:15 by Hibernate Tools 4.3.1



/**
 * TblMetodosPagamentoCliente generated by hbm2java
 */
public class TblMetodosPagamentoCliente  implements java.io.Serializable {


     private Integer metodosPagamentoClienteCodigo;
     private TblCliente tblCliente;
     private TblRefMetodosPagamento tblRefMetodosPagamento;
     private String refMetodosPagamentoCartaoCreditoNumero;
     private String refMetodosPagamentoDetalhes;

    public TblMetodosPagamentoCliente() {
    }

	
    public TblMetodosPagamentoCliente(TblCliente tblCliente, TblRefMetodosPagamento tblRefMetodosPagamento) {
        this.tblCliente = tblCliente;
        this.tblRefMetodosPagamento = tblRefMetodosPagamento;
    }
    public TblMetodosPagamentoCliente(TblCliente tblCliente, TblRefMetodosPagamento tblRefMetodosPagamento, String refMetodosPagamentoCartaoCreditoNumero, String refMetodosPagamentoDetalhes) {
       this.tblCliente = tblCliente;
       this.tblRefMetodosPagamento = tblRefMetodosPagamento;
       this.refMetodosPagamentoCartaoCreditoNumero = refMetodosPagamentoCartaoCreditoNumero;
       this.refMetodosPagamentoDetalhes = refMetodosPagamentoDetalhes;
    }
   
    public Integer getMetodosPagamentoClienteCodigo() {
        return this.metodosPagamentoClienteCodigo;
    }
    
    public void setMetodosPagamentoClienteCodigo(Integer metodosPagamentoClienteCodigo) {
        this.metodosPagamentoClienteCodigo = metodosPagamentoClienteCodigo;
    }
    public TblCliente getTblCliente() {
        return this.tblCliente;
    }
    
    public void setTblCliente(TblCliente tblCliente) {
        this.tblCliente = tblCliente;
    }
    public TblRefMetodosPagamento getTblRefMetodosPagamento() {
        return this.tblRefMetodosPagamento;
    }
    
    public void setTblRefMetodosPagamento(TblRefMetodosPagamento tblRefMetodosPagamento) {
        this.tblRefMetodosPagamento = tblRefMetodosPagamento;
    }
    public String getRefMetodosPagamentoCartaoCreditoNumero() {
        return this.refMetodosPagamentoCartaoCreditoNumero;
    }
    
    public void setRefMetodosPagamentoCartaoCreditoNumero(String refMetodosPagamentoCartaoCreditoNumero) {
        this.refMetodosPagamentoCartaoCreditoNumero = refMetodosPagamentoCartaoCreditoNumero;
    }
    public String getRefMetodosPagamentoDetalhes() {
        return this.refMetodosPagamentoDetalhes;
    }
    
    public void setRefMetodosPagamentoDetalhes(String refMetodosPagamentoDetalhes) {
        this.refMetodosPagamentoDetalhes = refMetodosPagamentoDetalhes;
    }




}


