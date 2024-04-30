package caracteristicas;
import java.util.Scanner;
public class Pokemon {
	Scanner leer = new Scanner(System.in);
	Pokedex po = new Pokedex();
	Pokedex2 po2 = new Pokedex2();
	private String jugador1;
	private String jugador2;
	int avatar1;
	int avatar2;
	int avatar3;
	int avatar4;
	int eleccion = 0;
	int eleccion_1 = 0;
	int pikachucontador = 0;
	int charmandercontador = 0;
	int riolucontador = 0;
	int squirtlecontador = 0;
	int cubonecontador = 0;
	int totodilecontador = 0;
	int partidas = 0;
	int a= (int)(Math.random()*(100-50)+50);
	int vida1 = a;
	int b= (int)(Math.random()*(20-5)+5);
	int ataque1 = b;
	int c= (int)(Math.random()*(100-50)+50);
	int vida2 = c;
	int d= (int)(Math.random()*(20-5)+5);
	int ataque2 = d;
	int e= (int)(Math.random()*(100-50)+50);
	int vida3 = e;
	int f= (int)(Math.random()*(20-5)+5);
	int ataque3 = f;
	int g= (int)(Math.random()*(100-50)+50);
	int vida4 = g;
	int t= (int)(Math.random()*(20-5)+5);
	int ataque4 = t;
	int res1;
	int res2;
	int res3;
	int res4;
	int ganador1 = 0;
	int ganador2 = 0;
	
	public Pokemon(){	
	}
	public Pokemon( String jugador1, String jugador2){	
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	public void setjugador1(String jugador1){
		this.jugador1 = jugador1;
	}
	public void setjugador2(String jugador2){
		this.jugador2 = jugador2;
	}
	public String getjugador1(){
	return jugador1;
	}
	public String getjugador2(){
	return jugador2;
	}
	public void partidas(){
		System.out.println( getjugador1() + "  vs  " + getjugador2() );
		System.out.println("las partidas realizadas son "+ partidas);
		System.out.println("el jugador 1 a ganado "+ ganador1);
		System.out.println("el jugador 2 a ganado "+ ganador2);
	}
	public void estadisticas(){
		System.out.println("se a utilizado " +pikachucontador+ " pikachu");
		System.out.println("se a utilizado " +charmandercontador+ " charmander");
		System.out.println("se a utilizado " +riolucontador+ " riolu");
		System.out.println("se a utilizado " +squirtlecontador+ " squirtle");
		System.out.println("se a utilizado " +cubonecontador+ " cubone");
		System.out.println("se a utilizado "+totodilecontador+" totodile");
		System.out.println("el jugador 1 a ganado " + ganador1);
		System.out.println("el jugador 2 a ganado " + ganador2);
	}

			public void pokemones(){
				 if (vida1<0){
				System.out.println("estado muerto");
			}
			if(vida2<0){
				System.out.println("estado muerto");
			}
			if(vida3<0){
				System.out.println("estado muerto");
			}
			if(vida4<0){
				System.out.println("estado muerto");
			}
				partidas++;
				System.out.println("nombre del primer jugador");
				String nombre1 = leer.nextLine();
				System.out.println("nombre del segundo jugador");
				String nombre2 = leer.nextLine(); 
				setjugador1( nombre1 );
				setjugador2( nombre2 );
				System.out.println(nombre1 + "   vs    "+ nombre2);
				System.out.println("1.pikachu");
				System.out.println("2.charmander");
				System.out.println("3.riolu");
				System.out.println("4.squirtle");
				System.out.println("5.cubone");
				System.out.println("6.totodile");
		System.out.println("----"+ getjugador1() +"----");
		System.out.println("que pokemon quieres");
		int avatar1 = leer.nextInt();
		System.out.println("que pokemon quieres");
		int avatar2 = leer.nextInt();
		System.out.println("----"+ getjugador2()+ "----");
		System.out.println("que pokemon quieres");
		int avatar3 = leer.nextInt();
		System.out.println("que pokemon quieres");
		int avatar4 = leer.nextInt();
		
			System.out.println("primer jugador-----" + getjugador1()+ "--------" );
			if (avatar1==1){
			po.pikachu();
			System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
			pikachucontador++;				
		}else if(avatar1==2){
			po.charmander();
			System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
			charmandercontador++;			
		}else if(avatar1==3){
			po.riolu();
			System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
			riolucontador++;		
		}else if(avatar1==4){
			po2.squirtle();
			System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
			squirtlecontador++;			
		}else if(avatar1==5){
			po2.cubone();
			System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
			cubonecontador++;		
		}else if(avatar1==6){
			po2.totodile();	
			System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
			totodilecontador++;					
		}	
			if (avatar2==1){
			po.pikachu();
			System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
			pikachucontador++;			
		}else if(avatar2==2){
			po.charmander();
			System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
			charmandercontador++;		
		}else if(avatar2==3){
			po.riolu();
			System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);		
			riolucontador++;
		}else if(avatar2==4){
			po2.squirtle();
			System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
			squirtlecontador++;		
		}else if(avatar2==5){
			po2.cubone();
			System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
			cubonecontador++;		
		}else if(avatar2==6){
			po2.totodile();
			System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);	
			totodilecontador++;		
		}	
		System.out.println("----"+ getjugador2()+ "----");
			if (avatar3==1){
			po.pikachu();
			System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);	
			pikachucontador++	;			
		}else if(avatar3==2){
			po.charmander();
			System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);	
			charmandercontador++;		
		}else if(avatar3==3){
			po.riolu();
			System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
			riolucontador++;
		}else if(avatar3==4){
			po2.squirtle();
			System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
			squirtlecontador++;
		}else if(avatar3==5){
			po2.cubone();
			System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
			cubonecontador++;
		}else if(avatar3==6){
			po2.totodile();	
			System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
			totodilecontador++;		
		}	
			if (avatar4==1){
			po.pikachu();
			System.out.println("vida"+vida4);
			System.out.println("ataque"+ataque4);	
			pikachucontador++;
		}else if(avatar4==2){
			po.charmander();
				System.out.println("vida"+vida4);
			System.out.println("ataque"+ataque4);	
			charmandercontador++;
		}else if(avatar4==3){
			po.riolu();
				System.out.println("vida"+vida4);
			System.out.println("ataque"+ataque4);	
			riolucontador++;
		}else if(avatar4==4){
			po2.squirtle();
				System.out.println("vida"+vida4);
			System.out.println("ataque"+ataque4);	
			squirtlecontador++;
		}else if(avatar4==5){
			po2.cubone();
				System.out.println("vida"+vida4);
			System.out.println("ataque"+ataque4);	
			cubonecontador++;
		}else if(avatar4==6){
			po2.totodile();
				System.out.println("vida"+vida4);
			System.out.println("ataque"+ataque4);	
			totodilecontador++	;
		}	
		do{
		System.out.println("primer jugador-----" + getjugador1()+ "--------" );
		switch(avatar1){
			case 1:
				System.out.println("1.pikachu");
				break;
			case 2:
				System.out.println("1.charmander");
				break;
			case 3:
				System.out.println("1.riolu");
				break;
			case 4:
				System.out.println("1.squirtle");
				break;
			case 5:
				System.out.println("1.cubone");
				break;
			case 6:
				System.out.println("1.totodile");
				break;
		}
		if(vida1<=0){
				System.out.println("estado muerto");
				System.out.println("-------------");
			}
		switch(avatar2){
			case 1:
				System.out.println("2.pikachu");
				break;
			case 2:
				System.out.println("2.charmander");
				break;
			case 3:
				System.out.println("2.riolu");
				break;
			case 4:
				System.out.println("2.squirtle");
				break;
			case 5:
				System.out.println("2.cubone");
				break;
			case 6:
				System.out.println("2.totodile");
				break;
		}
		if(vida2<=0){
				System.out.println("estado muerto");
				System.out.println("-------------");
			}
		System.out.println("pokemones enemigos");
			switch(avatar3){
			case 1:
				System.out.println("1.pikachu");
				break;
			case 2:
				System.out.println("1.charmander");
				break;
			case 3:
				System.out.println("1.riolu");
				break;
			case 4:
				System.out.println("1.squirtle");
				break;
			case 5:
				System.out.println("1.cubone");
				break;
			case 6:
				System.out.println("1.totodile");
				break;
		}
		if(vida3<=0){
				System.out.println("estado muerto");
				System.out.println("-------------");
			}
		switch(avatar4){
			case 1:
				System.out.println("2.pikachu");
				break;
			case 2:
				System.out.println("2.charmander");
				break;
			case 3:
				System.out.println("2.riolu");
				break;
			case 4:
				System.out.println("2.squirtle");
				break;
			case 5:
				System.out.println("2.cubone");
				break;
			case 6:
				System.out.println("2.totodile");
				break;
		}	
		if(vida4<=0){
				System.out.println("estado muerto");
				System.out.println("-------------");
			}
		System.out.println(getjugador1()+ " Con que pokemon deseas atacar 1 o 2");
		int eleccion = leer.nextInt();
		System.out.println("A que pokemon de" +getjugador2()+ " enemigo quieres atacar 1 o 2");
		int eleccion_1 = leer.nextInt();
			if (eleccion ==1 && eleccion_1==1){

			System.out.println("primer jugador-----" + getjugador1()+ "--------" );

			switch( avatar1 ){
			case 1:
				po.pikachu();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
			
				break;
			case 2:
				po.charmander();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 3:
				po.riolu();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 4:
				po2.squirtle();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);			
				break;
			case 5:
				po2.cubone();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);				
				break;
			case 6:
				po2.totodile();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);				
				break;
			}
				switch( avatar3 ){
			case 1:
				po.pikachu();
				res3=vida3-ataque1;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);				
				break;
			case 2:
				po.charmander();
				res3=vida3-ataque1;
					vida3 = res3;	
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				
				break;
			case 3:
				po.riolu();
				res3=vida3-ataque1;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);			
				break;
			case 4:
				po2.squirtle();
				res3=vida3-ataque1;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);				
				break;
			case 5:
				po2.cubone();
				res3=vida3-ataque1;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);				
				break;
			case 6:
				po2.totodile();
					res3=vida3-ataque1;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);			
				break;
			}
			if(vida3<=0){
				System.out.println("estado muerto");
			}
		}
		if (eleccion ==1 && eleccion_1==2){
			System.out.println("primer jugador-----" + getjugador1()+ "--------" );
			switch( avatar1 ){
			case 1:
				po.pikachu();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 2:
				po.charmander();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 3:
				po.riolu();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 4:
				po2.squirtle();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 5:
				po2.cubone();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 6:
				po2.totodile();
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			}
				switch( avatar4 ){
			case 1:
				po.pikachu();
				res4=vida4-ataque1;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
					
				break;
			case 2:
				po.charmander();
				res4=vida4-ataque1;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);				
				break;
			case 3:
				po.riolu();
				res4=vida4-ataque1;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);				
				break;
			case 4:
				po2.squirtle();
				res4=vida4-ataque1;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);				
				break;
			case 5:
				po2.cubone();
				res4=vida4-ataque1;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				
				break;
			case 6:
				po2.totodile();
				res4=vida4-ataque1;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);				
				break;
			}
			if(vida4<=0){
				System.out.println("estado muerto");
			}
		}
		if (eleccion ==2 && eleccion_1==1){
			System.out.println("primer jugador-----" + getjugador1()+ "--------" );
			switch( avatar2 ){
			case 1:
				po.pikachu();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 2:
				po.charmander();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 3:
				po.riolu();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 4:
				po2.squirtle();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 5:
				po2.cubone();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 6:
				po2.totodile();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			}
				switch( avatar3 ){
			case 1:
				po.pikachu();
				res3=vida3-ataque2;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);				
				break;
			case 2:
				po.charmander();
				res3=vida3-ataque2;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 3:
				po.riolu();
				res3=vida3-ataque2;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);				
				break;
			case 4:
				po2.squirtle();
				res3=vida3-ataque2;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);				
				break;
			case 5:
				po2.cubone();
					res3=vida3-ataque2;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 6:
				po2.totodile();
				res3=vida3-ataque2;
					vida3 = res3;
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);				
				break;
			}
			if(vida3<=0){
				System.out.println("estado muerto");
			}
		}
		if (eleccion ==2 && eleccion_1==2){
			System.out.println("primer jugador-----" + getjugador1()+ "--------" );
			switch( avatar2 ){
			case 1:
				po.pikachu();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 2:
				po.charmander();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 3:
				po.riolu();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 4:
				po2.squirtle();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 5:
				po2.cubone();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 6:
				po2.totodile();
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			}
				switch( avatar4 ){
			case 1:
				po.pikachu();
				res4=vida4-ataque2;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);				
				break;
			case 2:
				po.charmander();
				res4=vida4-ataque2;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);				
				break;
			case 3:
				po.riolu();
				res4=vida4-ataque2;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			case 4:
				po2.squirtle();
				res4=vida4-ataque2;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);				
				break;
			case 5:
				po2.cubone();
				res4=vida4-ataque2;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);				
				break;
			case 6:
				po2.totodile();
					res4=vida4-ataque2;
					vida4 = res4;
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			}
			if(vida4<=0){
				System.out.println("estado muerto");
			}
		}
		System.out.println("segundo -----" + getjugador2()+ "--------" );
		switch(avatar3){
			case 1:
				System.out.println("1.pikachu");
				break;
			case 2:
				System.out.println("1.charmander");
				break;
			case 3:
				System.out.println("1.riolu");
				break;
			case 4:
				System.out.println("1.squirtle");
				break;
			case 5:
				System.out.println("1.cubone");
				break;
			case 6:
				System.out.println("1.totodile");
				break;
		}
		if(vida3<=0){
				System.out.println("estado muerto");
				System.out.println("-------------");
			}	
		switch(avatar4){
			case 1:
				System.out.println("2.pikachu");
				break;
			case 2:
				System.out.println("2.charmander");
				break;
			case 3:
				System.out.println("2.riolu");
				break;
			case 4:
				System.out.println("2.squirtle");
				break;
			case 5:
				System.out.println("2.cubone");
				break;
			case 6:
				System.out.println("2.totodile");
				break;
		}
	if(vida4<=0){
				System.out.println("estado muerto");
				System.out.println("-------------");
			}
		System.out.println("pokemones enemigos");
		
			switch(avatar1){
			case 1:
				System.out.println("1.pikachu");
				break;
			case 2:
				System.out.println("1.charmander");
				break;
			case 3:
				System.out.println("1.riolu");
				break;
			case 4:
				System.out.println("1.squirtle");
				break;
			case 5:
				System.out.println("1.cubone");
				break;
			case 6:
				System.out.println("1.totodile");
				break;
		}
		if(vida1<=0){
				System.out.println("estado muerto");
				System.out.println("-------------");
			}

		switch(avatar2){
			case 1:
				System.out.println("2.pikachu");
				break;
			case 2:
				System.out.println("2.charmander");
				break;
			case 3:
				System.out.println("2.riolu");
				break;
			case 4:
				System.out.println("2.squirtle");
				break;
			case 5:
				System.out.println("2.cubone");
				break;
			case 6:
				System.out.println("2.totodile");
				break;
		}
		if(vida2<=0){
				System.out.println("estado muerto");
				System.out.println("-------------");
			}
	
	
		System.out.println(getjugador2()+" que pokemon deseas atacar 1 o 2");
		int eleccionj = leer.nextInt();
		System.out.println(" a que pokemon atacaras de "+ getjugador1());
		int eleccionj_1 = leer.nextInt();	
			if (eleccionj ==1 && eleccionj_1==1){
			System.out.println("segundo jugador-----" + getjugador2()+ "--------" );
			switch(  avatar3){
			case 1:
				po.pikachu();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 2:
				po.charmander();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 3:
				po.riolu();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 4:
				po2.squirtle();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 5:
				po2.cubone();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 6:
				po2.totodile();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			}
				switch( avatar1  ){
			case 1:
				po.pikachu();
				res1=vida1-ataque3;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 2:
				po.charmander();
				res1=vida1-ataque3;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 3:
				po.riolu();
				res1=vida1-ataque3;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 4:
				po2.squirtle();
				res1=vida1-ataque3;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 5:
				po2.cubone();
					res1=vida1-ataque3;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 6:
				po2.totodile();
					res1=vida1-ataque3;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			}
			if(vida1<=0){
				System.out.println("estado muerto");
			}
		}
		if (eleccionj ==1 && eleccionj_1==2){
			System.out.println("primer jugador-----" + getjugador2()+ "--------" );
			switch(  avatar3 ){
			case 1:
				po.pikachu();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 2:
				po.charmander();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 3:
				po.riolu();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 4:
				po2.squirtle();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 5:
				po2.cubone();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			case 6:
				po2.totodile();
				System.out.println("vida"+vida3);
				System.out.println("ataque"+ataque3);
				break;
			}
				switch( avatar2 ){
			case 1:
				po.pikachu();
				res2=vida2-ataque3;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 2:
				po.charmander();
				res2=vida2-ataque3;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 3:
				po.riolu();
				res2=vida2-ataque3;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 4:
				po2.squirtle();
				res2=vida2-ataque3;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 5:
				po2.cubone();
					res2=vida2-ataque3;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 6:
				po2.totodile();
					res2=vida2-ataque3;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);			
				break;
			}
			if(vida2<=0){
				System.out.println("estado muerto");
			}
		}
		if (eleccionj ==2 && eleccionj_1==1){
			System.out.println("primer jugador-----" + getjugador2()+ "--------" );
			switch(  avatar4 ){
			case 1:
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				po.pikachu();
				break;
			case 2:
				po.charmander();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			case 3:
				po.riolu();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			case 4:
				po2.squirtle();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			case 5:
				po2.cubone();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			case 6:
				po2.totodile();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			}
				switch( avatar1 ){
			case 1:
				po.pikachu();
				res1=vida1-ataque4;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);			
				break;
			case 2:
				po.charmander();
				res1=vida1-ataque4;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);				
				break;
			case 3:
				po.riolu();
				res1=vida1-ataque4;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);
				break;
			case 4:
				po2.squirtle();
					res1=vida1-ataque4;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);			
				break;
			case 5:
				po2.cubone();
					res1=vida1-ataque4;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);				
				break;
			case 6:
				po2.totodile();
				res1=vida1-ataque4;
					vida1 = res1;
				System.out.println("vida"+vida1);
				System.out.println("ataque"+ataque1);	
				break;
			}
			if(vida1<=0){
				System.out.println("estado muerto");
			}
		}
		if (eleccionj ==2 && eleccionj_1==2){
			System.out.println("segundo jugador-----" + getjugador2()+ "--------" );
			switch( avatar4 ){
			case 1:
				po.pikachu();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			case 2:
				po.charmander();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			case 3:
				po.riolu();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			case 4:
				po2.squirtle();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			case 5:
				po2.cubone();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			case 6:
				po2.totodile();
				System.out.println("vida"+vida4);
				System.out.println("ataque"+ataque4);
				break;
			}
				switch( avatar2 ){
			case 1:
				po.pikachu();
				res2=vida2-ataque4;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 2:
				po.charmander();
					res2=vida2-ataque4;	
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);				
				break;
			case 3:
				po.riolu();
				res2=vida2-ataque4;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 4:
				po2.squirtle();
				res2=vida2-ataque4;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 5:
				po2.cubone();
				res2=vida2-ataque4;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			case 6:			
				po2.totodile();
				res2=vida2-ataque4;
					vida2 = res2;
				System.out.println("vida"+vida2);
				System.out.println("ataque"+ataque2);
				break;
			}
			if(vida2<=0){
				System.out.println("estado muerto");
			}
		}		   
			
		}while(vida1>=0 && vida2>=0 || vida3>=0 && vida4>=0);
		
		if(vida3<=0 && vida4<=0){
				ganador1++;
				System.out.println(getjugador1() + "  a ganado la batalla");
			}
			if(vida1<=0 && vida2<=0){
				ganador2++;
				System.out.println(getjugador2() + "  a ganado la batalla");
			}	
}
}
