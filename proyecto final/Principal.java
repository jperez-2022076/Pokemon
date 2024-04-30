import caracteristicas.*;
import java.util.Scanner;
public class Principal{
public static void main(String[] args) {
	Operaciones op = new Operaciones();
	Pokemon poke = new Pokemon();
	Scanner leer=new Scanner(System.in);
	int opcion=0;
	do{

	op.menu();
	opcion=leer.nextInt();
	switch(opcion){
	
	case 1:
		op.listadoPokemon();
	break;
    case 2:
    	poke.partidas();
	    break;
	case 3:
		poke.pokemones();

		break;
	case 4:
		poke.estadisticas();
		break;
	case 5:
		System.out.println("hasta la proxima bro....");
	}
    }while(opcion!=5);
 }
}