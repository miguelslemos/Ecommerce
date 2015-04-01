package Entidades;
// Generated 31/03/2015 20:14:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TblRefPedidoStatus generated by hbm2java
 */
public class TblRefPedidoStatus  implements java.io.Serializable {


     private Integer refPedidoStatusCodigo;
     private String refPedidoStatusDescricao;
     private Set tblPedidoses = new HashSet(0);

    public TblRefPedidoStatus() {
    }

	
    public TblRefPedidoStatus(String refPedidoStatusDescricao) {
        this.refPedidoStatusDescricao = refPedidoStatusDescricao;
    }
    public TblRefPedidoStatus(String refPedidoStatusDescricao, Set tblPedidoses) {
       this.refPedidoStatusDescricao = refPedidoStatusDescricao;
       this.tblPedidoses = tblPedidoses;
    }
   
    public Integer getRefPedidoStatusCodigo() {
        return this.refPedidoStatusCodigo;
    }
    
    public void setRefPedidoStatusCodigo(Integer refPedidoStatusCodigo) {
        this.refPedidoStatusCodigo = refPedidoStatusCodigo;
    }
    public String getRefPedidoStatusDescricao() {
        return this.refPedidoStatusDescricao;
    }
    
    public void setRefPedidoStatusDescricao(String refPedidoStatusDescricao) {
        this.refPedidoStatusDescricao = refPedidoStatusDescricao;
    }
    public Set getTblPedidoses() {
        return this.tblPedidoses;
    }
    
    public void setTblPedidoses(Set tblPedidoses) {
        this.tblPedidoses = tblPedidoses;
    }




}


