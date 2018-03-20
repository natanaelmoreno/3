package morenolemusagustinnatanael;
import morenolemusagustinnatanael.lineaTelefonica;
public class MorenoLemusAgustinNatanael {

  private lineaTelefonica linea1;
    private lineaTelefonica linea2;
    private lineaTelefonica linea3;     
    
    public void inicializar()
    {
    linea1 = new lineaTelefonica();
    linea1.inicializar();
    
    linea2 = new lineaTelefonica();
    linea2.inicializar();
    
    linea3 = new lineaTelefonica();
    linea3.inicializar();
    }
    
    public lineaTelefonica darlinea1(){
    return linea1;
    }
    
    public lineaTelefonica darlinea2(){
    return linea2;
    }
    
    public lineaTelefonica darlinea3(){
    return linea3;
    }
    
    public void agregarllamadalocallinea1(int minutos){
    linea1.agregarLlamadaLocal(minutos);
    }
    
    public void agregarllamadalocallinea2(int minutos){
    linea2.agregarLlamadaLocal(minutos);
    }
    
    public void agregarllamadalocallinea3(int minutos){
    linea3.agregarLlamadaLocal(minutos);
    }
    
    public void agregarllamadalargadistancialinea1(int minutos){
    linea1.agregarLlamadaLargaDistancia(minutos);
    }
    
    public void agregarllamadalargadistancialinea2(int minutos){
    linea2.agregarLlamadaLargaDistancia(minutos);
    }
    
    public void agregarllamadalargadistancialinea3(int minutos){
    linea3.agregarLlamadaLargaDistancia(minutos);
    }
    
    public void agregarllamadacelularlinea1(int minutos){
    linea1.agregarLlamadaCelular(minutos);
    }
    
    public void agregarllamadacelularlinea2(int minutos){
    linea2.agregarLlamadaCelular(minutos);
    }
    
    public void agregarllamadacelularlinea3(int minutos){
    linea3.agregarLlamadaCelular(minutos);
    }
    
    public int dartotalnumerollamadas(){
    return linea1.darNumeroLlamadas()+ linea2.darNumeroLlamadas() + linea3.darNumeroLlamadas();
    }
    
    public int dartotalminutos(){
    return linea1.darNumeroMinutos() + linea2.darNumeroMinutos() + linea3.darNumeroMinutos();
    }
    
    public double dartotalcostollamadas(){
    return linea1.darCostosLlamadas() + linea2.darCostosLlamadas() + linea3.darCostosLlamadas();
    }
    
    public double darcostopromediominutos(){
    return (dartotalcostollamadas() /dartotalminutos());
    }
    
    public void reinicializar(){
    linea1.reiniciar();
    linea2.reiniciar();
    linea3.reiniciar();
    }
    
}
