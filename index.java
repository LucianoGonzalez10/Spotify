import java.io.File;

public class index {
    public static void main(String[] args) {
        CollectionsCancion canciones = new CollectionsCancion();
        CollectionsPlaylist playlists = new CollectionsPlaylist();
        
         // CREAR ARCHIVOS
        File f = new File("zCanciones.json");
        File f3 = new File("zplaylists.json");
        
        // CANCIONES CARGA
        Cancion cancion1 = new Cancion(1, "Lala", "Reggaeton", "audio/Myke-Lala.wav", "Media/LalaPortada.png");
        Cancion cancion2 = new Cancion(2, "La Falda", "Reggaeton", "audio/Myke-LaFalda.wav", "Media/LaFaldaPortada.png");
        Cancion cancion3 = new Cancion(3, "Piensan", "Reggaeton", "audio/Myke-Piensan.wav", "Media/PiensanPortada.png");
        Cancion cancion4 = new Cancion(4, "Call Me Baby", "Trap", "audio/Call-Me-Baby.wav", "Media/CallMeMaybePortada.png");
        Cancion cancion5 = new Cancion(5, "Normal", "Reggaeton", "audio/Feid-Normal.wav", "Media/NormalPortada.png");

        Cancion cancion6 = new Cancion(6, "Mina el Hammani", "Trap", "audio\\Cruz-Mina-El-Hammani.wav", "Media/MinaElHammaniPortada.png");
        Cancion cancion7 = new Cancion(7, "Contando Lunares", "Trap", "audio/Cruz-Contando-Lunares.wav", "Media/contando.jpeg");
        Cancion cancion8 = new Cancion(8, "Un Monton", "Trap", "audio\\Duki-Un-Monton.wav", "Media/UnMontonPortada.png");
        Cancion cancion9 = new Cancion(9, "Feliz Cumplea Ferxxo", "Reggaeton", "audio/Feid-FelizCum.wav", "Media/FelizCumplePortada.png");
        Cancion cancion10 = new Cancion(10, "Vato", "Hip Hop", "audio/Snoop-Vato.wav", "Media/VatoPortada.png");

        Cancion cancion11 = new Cancion(11, "Algo Magico", "Reggaeton", "audio/Rauw-Algo-Magico.wav", "Media/AlgoMagicoPortada.png");
        Cancion cancion12 = new Cancion(12, "Wild And Free", "Hip Hop", "audio/Snoop-WildFree.wav", "Media/WildAndFreePortada.png");
        Cancion cancion13 = new Cancion(13, "Besame Remix", "Trap", "audio/Besame-Remix.wav", "Media/BesameRemixPortada.png");
        Cancion cancion14 = new Cancion(14, "Porfa", "Reggaeton", "audio/Feid-Porfa.wav", "Media/PorfaPortada.png");
        Cancion cancion15 = new Cancion(15, "Riders on Storm", "Hip Hop", "audio/Snoop-Riders.wav", "Media/RidersOnTheStormPortada.png");

        Cancion cancion16 = new Cancion(16, "Explicito", "Reggaeton", "audio/Myke-Explicito.wav", "Media/ExplicitoPortada.png");
        Cancion cancion17 = new Cancion(17, "Drop It Like It is Hot", "Hip Hop", "audio/Snoop-Drop.wav", "Media/DropItPortada.png");    
        Cancion cancion18 = new Cancion(18, "Relacion Rota", "Reggaeton", "audio/Myke-Relacion.wav", "Media/RelacionPortada.png");    
        Cancion cancion19 = new Cancion(19, "Tu", "Reggaeton", "audio/Myke-Tu.wav", "Media/TuPortada.png");    
        Cancion cancion20 = new Cancion(20, "Diosa", "Reggaeton", "audio/Myke-Diosa.wav", "Media/DiosaPortada.png");    
        Cancion cancion21 = new Cancion(21, "Otro", "Reggaeton", "audio/Myke-Otro.wav", "Media/OtroPortada.png");    
        Cancion cancion22 = new Cancion(22, "Inocente", "Reggaeton", "audio/Myke-Inocente.wav", "Media/InocentePortada.png");    

    
         // // // AGREGAR CANCIONES A LA COLECCION CANCIONES
         canciones.agregarCanciones(cancion1);
         canciones.agregarCanciones(cancion2);
         canciones.agregarCanciones(cancion3);
         canciones.agregarCanciones(cancion4);
         canciones.agregarCanciones(cancion5);
         canciones.agregarCanciones(cancion6);
         canciones.agregarCanciones(cancion7);
         canciones.agregarCanciones(cancion8);
         canciones.agregarCanciones(cancion9);
         canciones.agregarCanciones(cancion10);
         canciones.agregarCanciones(cancion11);
         canciones.agregarCanciones(cancion12);
         canciones.agregarCanciones(cancion13);
         canciones.agregarCanciones(cancion14);
         canciones.agregarCanciones(cancion15);
         canciones.agregarCanciones(cancion16);
         canciones.agregarCanciones(cancion17);
         canciones.agregarCanciones(cancion18);
         canciones.agregarCanciones(cancion19);
         canciones.agregarCanciones(cancion20);
         canciones.agregarCanciones(cancion21);
         canciones.agregarCanciones(cancion22);

        // // CREO PLAYLIST
        Playlist playlist1 = new Playlist("Trap", "Media/Trap.png");
        playlist1.agregarCancion(cancion4);
        playlist1.agregarCancion(cancion6);
        playlist1.agregarCancion(cancion7);
        playlist1.agregarCancion(cancion8);
        playlist1.agregarCancion(cancion13);

        Playlist playlist2 = new Playlist("Reggaeton", "Media/Reggaeton.png");
        playlist2.agregarCancion(cancion1);
        playlist2.agregarCancion(cancion2);
        playlist2.agregarCancion(cancion3);
        playlist2.agregarCancion(cancion5);
        playlist2.agregarCancion(cancion9);
        playlist2.agregarCancion(cancion11);
        playlist2.agregarCancion(cancion14);
        playlist2.agregarCancion(cancion16);
        playlist2.agregarCancion(cancion18);
        playlist2.agregarCancion(cancion19);
        playlist2.agregarCancion(cancion20);
        playlist2.agregarCancion(cancion21);
        playlist2.agregarCancion(cancion22);


        Playlist playlist3 = new Playlist("Hip Hop", "Media/hiphop.png");
        playlist3.agregarCancion(cancion10);
        playlist3.agregarCancion(cancion12);
        playlist3.agregarCancion(cancion15);
        playlist3.agregarCancion(cancion17);

        Playlist playlist4 = new Playlist("Cruz Cafune", "Media/CruzCafune.jpg");
        playlist4.agregarCancion(cancion6);
        playlist4.agregarCancion(cancion7);
       
        Playlist playlist5 = new Playlist("Feid", "Media/Feid.jpg");
        playlist5.agregarCancion(cancion9);
        playlist5.agregarCancion(cancion14);
       
        Playlist playlist6 = new Playlist("Myke Towers", "Media/MykeTowers.jpg");
        playlist6.agregarCancion(cancion1);
        playlist6.agregarCancion(cancion2);
        playlist6.agregarCancion(cancion3);
        playlist6.agregarCancion(cancion16);
        playlist6.agregarCancion(cancion18);
        playlist6.agregarCancion(cancion19);
        playlist6.agregarCancion(cancion20);
        playlist6.agregarCancion(cancion21);
        playlist6.agregarCancion(cancion22);

        Playlist playlist7 = new Playlist("Rauw Alejandro", "Media/RauwAlejandro.jpg");
        playlist7.agregarCancion(cancion11);
        Playlist playlist8 = new Playlist("Snoop Dog", "Media/SnoopDog.jpg");
        playlist8.agregarCancion(cancion12);
        playlist8.agregarCancion(cancion15);
        playlist8.agregarCancion(cancion17);

        // // // AGREGAR PLAYLISTS A LA COLECCION
        playlists.agregarPlaylist(playlist1);
        playlists.agregarPlaylist(playlist2);
        playlists.agregarPlaylist(playlist3);
        playlists.agregarPlaylist(playlist4);
        playlists.agregarPlaylist(playlist5);
        playlists.agregarPlaylist(playlist6);
        playlists.agregarPlaylist(playlist7);
        playlists.agregarPlaylist(playlist8);

        // // CARGAR CANCIONES, PLAYLIST Y ARTISTAS A LOS ARCHIVOS
        canciones.cargarArchivo(f);
        playlists.cargarArchivo(f3); 
    }
}
