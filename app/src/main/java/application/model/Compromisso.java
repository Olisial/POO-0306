package application.model;

import java.util.Calendar;

public class Compromisso extends AbstractAtividade {
    private Calendar dataInicial;
    private Calendar dataFinal;
    
    public Calendar getDatainicial();{
        return dataInicial;
    }
    public void setdataInicial (Calendar dataInicial){
        this.dataInicial = dataInicial;
    }
    public Calendar getDataFinal(){
        return dataFinal;
    }
    public void setDataFinal(Calendar dataFinal){
        this.dataFinal = dataFinal;
    }
    @Override
    public String getDetalhes(){
        return "[C]" + this.getDescricao() + ": :"
            + this.getDatainicial().getTime() + ": :"
            + this.getDataFinal().getTime();
    }

    public void setdataInicial(int dia, int mes, int ano) {
        Calendar c = Calendar.getInstance();
        c.set(ano, mes, dia);
        this.dataInicial = c;
    }

    public void setDataFinal(int dia, int mes, int ano) {
        Calendar c = Calendar.getInstance();
        c.set(ano, mes, dia);
        this.dataFinal = c;
}
