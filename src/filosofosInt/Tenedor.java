package filosofosInt;

public class Tenedor{

int numero;
boolean enUso;

public Tenedor(int x){
numero = x;
}

synchronized public void usar(){ // synchronized : para no usar este metodo simultaneamente
if(enUso){
System.out.println("Tenedor "+numero+" esta en uso, espera");
}else{
enUso= true;
System.out.println("Se esta usando el tenedor "+numero);
}
}

synchronized public void dejar(){
enUso = false;
System.out.println("Tenedor "+numero+" esta ahora disponible");
}

}