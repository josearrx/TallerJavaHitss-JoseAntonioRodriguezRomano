package conjuntos;

import java.util.*;

public class Conjuntos {
    //Conjuntos
    private Set <Jugador> futbol = new HashSet<>();
    private Set <Jugador> basquetbol = new LinkedHashSet<>();
    private Set <Jugador> Voleibol = new TreeSet<>(Comparator.comparing(Jugador::getNombre));

    //Registrar jugadores
    public boolean registrarJugador(String disciplina, Jugador jugador)
    {
        switch (disciplina.toLowerCase()) 
        {
            case "futbol" -> {
                return futbol.add(jugador);
            }
            case "basquetbol" -> {
                return basquetbol.add(jugador);
            }
            case "voleibol" -> {
                return Voleibol.add(jugador);
            } 
            default -> {
                return false;
            }
        }
    }

    //Mostrar jugadores todos los jugadores inscritos en cada disciplina, de acuerdo con la implementacion del set
    // Mostrar todos los jugadores por cada disciplina
    public void mostrarTodosLosJugadores() {
        System.out.println("-> Fútbol:");
        if (futbol.isEmpty()) 
        {
            System.out.println("  (sin jugadores)");
        } 
        else 
        {
            for (Jugador j : futbol) 
            {
                System.out.println(j);
            }
        }

        System.out.println("\n-> Básquetbol:");
        if (basquetbol.isEmpty()) 
        {
            System.out.println("  (sin jugadores)");
        } 
        else 
        {
            for (Jugador j : basquetbol) 
            {
                System.out.println(j);
            }
        }

        System.out.println("\n-> Voleibol:");
        if (Voleibol.isEmpty()) 
        {
            System.out.println("  (sin jugadores)");
        } 
        else 
        {
            for (Jugador j : Voleibol) 
            {
                System.out.println(j);
            }
        }
    }


    //Buscar si un jugador esta inscrito en cierta disciplina
    public boolean buscarJugador(String disciplina, Jugador jugador)
    {
        Set<Jugador> set = getSet(disciplina);
        return set != null && set.contains(jugador);
    }

    //Eliminar jugadores por deporte 
    public boolean eliminarJugador(String disciplina, Jugador jugador)
    {
        Set<Jugador> set = getSet(disciplina);
        return set != null && set.remove(jugador);
    }

    /////////////////////////////////////////////////////////////////////////////////
    
    //Contar jugadores en cada disciplina
    public int contarJugadores(String disciplina)
    {
        Set<Jugador> set = getSet(disciplina);
        return set != null ? set.size() : 0;
    }

    //Fusionar equipos (union)
    public Set<Jugador> fusionarEquipos (String disciplina1, String disciplina2)
    {
        Set<Jugador> conjunto1 = getSet(disciplina1);
        Set<Jugador> conjunto2 = getSet(disciplina2);
        if (conjunto1 != null && conjunto2 != null){
            Set<Jugador> union = new HashSet<>(conjunto1);
            union.addAll(conjunto2);
            return union;
        }
        return null;
    }

    //Ver jugadores en comun (Interseccion)
    public Set <Jugador> jugadoresEnComun (String disciplina1, String disciplina2)
    {
        Set<Jugador> conjunto1 = getSet(disciplina1);
        Set<Jugador> conjunto2 = getSet(disciplina2);
        if (conjunto1 != null && conjunto2 != null){
            Set<Jugador> interseccion = new HashSet<>(conjunto1);
            interseccion.retainAll(conjunto2);
            return interseccion;
        }
        return null;
    }

    //Transferir un jugador de un deporte a otro
    public boolean transferirJugador(String disciplinaOrigen, String disciplinaDestino, Jugador jugador)
    {
        if (eliminarJugador(disciplinaOrigen, jugador)){
            return registrarJugador(disciplinaDestino, jugador);
        }
        return false;
    }

    //Mostrar todos los jugadores odenados por nombre
    public void mostrarTodosPorNombre()
    {
        Set <Jugador> todos = new TreeSet<>(Comparator.comparing(Jugador::getNombre));
        todos.addAll(futbol);
        todos.addAll(basquetbol);
        todos.addAll(Voleibol);
        System.out.println("| Jugadores ordenados por nombre: ");
        System.out.println("+----                              ----+");
        for (Jugador jugador : todos) {
            System.out.println(jugador);
        }
    }

    //Mostrar todos los jugadores en orden de inscripcion
    public void mostrarTodosEnOrdenInscripcion()
    {
        Set <Jugador> todos = new LinkedHashSet<>();
        todos.addAll(futbol);
        todos.addAll(basquetbol);
        todos.addAll(Voleibol);
        System.out.println("| Jugadores en orden de inscripcion: ");
        System.out.println("+----                         ----+");
        for (Jugador jugador : todos) {
            System.out.println(jugador);
        }
    }

    //Mostrar ranking de jugadores por id
    public void mostrarRankingPorId()
    {
        Set <Jugador> ranking = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
        ranking.addAll(futbol);
        ranking.addAll(basquetbol);
        ranking.addAll(Voleibol);
        System.out.println("| Ranking de jugadores por id: ");
        System.out.println("+----                         ----+");
        for (Jugador jugador : ranking) {
            System.out.println(jugador);
        }
    }

    //Obtener el conjunto correspondiente a la disciplina
    private Set<Jugador> getSet(String disciplina)
    {
        switch (disciplina.toLowerCase()) 
        {
            case "futbol" -> {
                    return futbol;
                }
            case "basquetbol" -> {
                    return basquetbol;
                }
            case "voleibol" -> {
                    return Voleibol;
                } 
            default -> {
                    return null;
                }
        }
    }
}
