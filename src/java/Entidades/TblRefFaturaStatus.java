package Entidades;
// Generated 31/03/2015 20:14:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TblRefFaturaStatus generated by hbm2java
 */
public class TblRefFaturaStatus  implements java.io.Serializable {


     private Integer refFaturaStatusCodigo;
     private String refFaturaStatusDescricao;
     private Set tblFaturas = new HashSet(0);

    public TblRefFaturaStatus() {
    }

	
    public TblRefFaturaStatus(String refFaturaStatusDescricao) {
        this.refFaturaStatusDescricao = refFaturaStatusDescricao;
    }
    public TblRefFaturaStatus(String refFaturaStatusDescricao, Set tblFaturas) {
       this.refFaturaStatusDescricao = refFaturaStatusDescricao;
       this.tblFaturas = tblFaturas;
    }
   
    public Integer getRefFaturaStatusCodigo() {
        return this.refFaturaStatusCodigo;
    }
    
    public void setRefFaturaStatusCodigo(Integer refFaturaStatusCodigo) {
        this.refFaturaStatusCodigo = refFaturaStatusCodigo;
    }
    public String getRefFaturaStatusDescricao() {
        return this.refFaturaStatusDescricao;
    }
    
    public void setRefFaturaStatusDescricao(String refFaturaStatusDescricao) {
        this.refFaturaStatusDescricao = refFaturaStatusDescricao;
    }
    public Set getTblFaturas() {
        return this.tblFaturas;
    }
    
    public void setTblFaturas(Set tblFaturas) {
        this.tblFaturas = tblFaturas;
    }




}


