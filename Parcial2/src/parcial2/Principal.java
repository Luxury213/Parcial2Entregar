package parcial2;

public class Principal {
	
	public static void main(String[] args) {
		
		
		
		Serie listaSeries[]=new Serie[5];
	    Videojuegos listaVideojuegos[]=new Videojuegos[5];
	    
	    listaSeries[0]=new Serie();
	    listaSeries[1]=new Serie("8 millas", " Eminem ");
	    listaSeries[2]=new Serie("30 días con Anuel", 12, "Documental", "Emmanuel Gazmey Santiago");
	    listaSeries[3]=new Serie("El apagon", 25 ,"Documental", "Benito Antonio Martinez Ocasio");
	    listaSeries[4]=new Serie("Kanye History", 5, "Documental", "Kanye West");

	    listaVideojuegos[0]=new Videojuegos();
	    listaVideojuegos[1]=new Videojuegos("OverWatch 2", 30, "Shooters", "Blizzard");
	    listaVideojuegos[2]=new Videojuegos("World Of Warcraft", "Blizzard");
	    listaVideojuegos[3]=new Videojuegos("Minecraft Java Edition", 30, "Rol", "Mojang");
	    listaVideojuegos[4]=new Videojuegos("Sonic 2006", 200, "Plataforma y Carreras ", "Sonic Studio & Sega Inc");
	    
	    
	    listaSeries[1].entregar();
	    listaSeries[4].entregar();
	    listaVideojuegos[0].entregar();
	    listaVideojuegos[3].entregar();
	    
	    int entregados=0;
	    
	    
	    for(int i=0;i<listaSeries.length;i++){
	        if(listaSeries[i].isEntregado()){
	            entregados+=1;
	            listaSeries[i].devolver();

	        }
	        if(listaVideojuegos[i].isEntregado()){
	            entregados+=1;
	            listaVideojuegos[i].devolver();
	        }
	    }

	    System.out.println("El total de articulos es " + entregados);
	    
	    Serie serieMayor=listaSeries[0];
	    
	    Videojuegos videojuegoMayor=listaVideojuegos[0];
	    
	    
	    for(int i=1;i<listaSeries.length;i++){
	        if(listaSeries[i].compareTo(serieMayor)==Serie.mayor){
	            serieMayor=listaSeries[i];
	        }
	        if(listaVideojuegos[i].compareTo(videojuegoMayor)==Videojuegos.mayor){
	            videojuegoMayor=listaVideojuegos[i];
	        }

	        
	    }
	    
	    System.out.println(videojuegoMayor);
	    System.out.println(serieMayor);
	}
	}


