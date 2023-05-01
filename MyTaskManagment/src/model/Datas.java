
package model;

import java.time.LocalDate;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import View.TelaProjectos;

public class Datas {
    Projectos p=new Projectos();
    
    DateFormat data=new SimpleDateFormat("dd,mm,yyyy");
    Date dataActual=new Date();
    LocalDate newData=dataActual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate DataEntrega=LocalDate.parse(p.getCreated_at(), DateTimeFormatter.ISO_LOCAL_DATE);
    LocalDate tempoEStimado=LocalDate.parse(p.getData_entrega(),DateTimeFormatter.ISO_LOCAL_DATE);
    
    public String getDate(){
        return data.format(dataActual);
    }
    
    public Long setTempoEstimado(){
        Long diferenca=ChronoUnit.DAYS.between(DataEntrega, tempoEStimado);
        return diferenca;
    }
    
    public Long TempoGasto(){
        Long tempoGasto=ChronoUnit.DAYS.between(newData, tempoEStimado);
        return tempoGasto;
    }
    
}
