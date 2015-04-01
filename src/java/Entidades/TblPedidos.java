package Entidades;
// Generated 31/03/2015 20:14:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TblPedidos generated by hbm2java
 */
public class TblPedidos  implements java.io.Serializable {


     private Integer pedidoCodigo;
     private TblCliente tblCliente;
     private TblRefPedidoStatus tblRefPedidoStatus;
     private String pedidoDataPedidoFeito;
     private String pedidoDetalhes;
     private Set tblEnvioses = new HashSet(0);
     private Set tblItensPedidos = new HashSet(0);
     private Set tblFaturas = new HashSet(0);

    public TblPedidos() {
    }

	
    public TblPedidos(TblCliente tblCliente, TblRefPedidoStatus tblRefPedidoStatus) {
        this.tblCliente = tblCliente;
        this.tblRefPedidoStatus = tblRefPedidoStatus;
    }
    public TblPedidos(TblCliente tblCliente, TblRefPedidoStatus tblRefPedidoStatus, String pedidoDataPedidoFeito, String pedidoDetalhes, Set tblEnvioses, Set tblItensPedidos, Set tblFaturas) {
       this.tblCliente = tblCliente;
       this.tblRefPedidoStatus = tblRefPedidoStatus;
       this.pedidoDataPedidoFeito = pedidoDataPedidoFeito;
       this.pedidoDetalhes = pedidoDetalhes;
       this.tblEnvioses = tblEnvioses;
       this.tblItensPedidos = tblItensPedidos;
       this.tblFaturas = tblFaturas;
    }
   
    public Integer getPedidoCodigo() {
        return this.pedidoCodigo;
    }
    
    public void setPedidoCodigo(Integer pedidoCodigo) {
        this.pedidoCodigo = pedidoCodigo;
    }
    public TblCliente getTblCliente() {
        return this.tblCliente;
    }
    
    public void setTblCliente(TblCliente tblCliente) {
        this.tblCliente = tblCliente;
    }
    public TblRefPedidoStatus getTblRefPedidoStatus() {
        return this.tblRefPedidoStatus;
    }
    
    public void setTblRefPedidoStatus(TblRefPedidoStatus tblRefPedidoStatus) {
        this.tblRefPedidoStatus = tblRefPedidoStatus;
    }
    public String getPedidoDataPedidoFeito() {
        return this.pedidoDataPedidoFeito;
    }
    
    public void setPedidoDataPedidoFeito(String pedidoDataPedidoFeito) {
        this.pedidoDataPedidoFeito = pedidoDataPedidoFeito;
    }
    public String getPedidoDetalhes() {
        return this.pedidoDetalhes;
    }
    
    public void setPedidoDetalhes(String pedidoDetalhes) {
        this.pedidoDetalhes = pedidoDetalhes;
    }
    public Set getTblEnvioses() {
        return this.tblEnvioses;
    }
    
    public void setTblEnvioses(Set tblEnvioses) {
        this.tblEnvioses = tblEnvioses;
    }
    public Set getTblItensPedidos() {
        return this.tblItensPedidos;
    }
    
    public void setTblItensPedidos(Set tblItensPedidos) {
        this.tblItensPedidos = tblItensPedidos;
    }
    public Set getTblFaturas() {
        return this.tblFaturas;
    }
    
    public void setTblFaturas(Set tblFaturas) {
        this.tblFaturas = tblFaturas;
    }




}


