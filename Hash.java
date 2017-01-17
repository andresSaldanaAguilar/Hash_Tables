import java.util.Arrays;



public class Hash{

  int tamanio;
  String [] arreglo,contador;

  public Hash(int tamanio){
    this.tamanio=tamanio;
    arreglo=new String[tamanio];
    Arrays.fill(arreglo,"-1");
  }

 public void funcionHash(String [] cadenaArreglo, String [] arreglo){
   for (int i=0;i<cadenaArreglo.length;i++) {
     String dato= cadenaArreglo[i];
     int indiceArreglo= Integer.parseInt(dato)%7;
     System.out.println("El indice es: "+indiceArreglo+" ,para el dato: "+dato);

     //tratando las colisiones
           while(arreglo[indiceArreglo]!="-1"){
              indiceArreglo++;
              System.out.println("Ocurrio colision en indice: "+(indiceArreglo-1)+ " ,Nuevo indice: " +indiceArreglo);
              indiceArreglo%=tamanio;
           }
            arreglo[indiceArreglo]=dato;
      }
 }

 public static void main(String args[]){
   Hash h=new Hash(8);
   String [] elementos= {"20","33","21","10","12","14","56","100"};
   h.funcionHash(elementos,h.arreglo);
 }
}
