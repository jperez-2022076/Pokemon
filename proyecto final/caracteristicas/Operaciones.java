package caracteristicas;
import java.util.Scanner;
public class Operaciones  {
	Scanner leer = new Scanner(System.in);
	Pokedex po = new Pokedex();
	Pokedex2 po2 = new Pokedex2();
	
	
	public void menu(){
		System.out.println("1.listado de pokemon");
		System.out.println("2.registro de batallas");
		System.out.println("3.batalla");
		System.out.println("4.estadisticas");
		System.out.println("5.salir");	
	}
	public void listadoPokemon(){
	po.pikachu();
	po.charmander();
	po.riolu();
	po2.squirtle();
	po2.cubone();
	po2.totodile();
	}
	


}
