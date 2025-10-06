package modelos;

import conjuntos.*;

import java.util.*;

public class Torneo {
	public static void main(String[] args) {
		Conjuntos torneo = new Conjuntos();
		Scanner sc = new Scanner(System.in);
		boolean salir = false;

		String disciplina;
		String nombre;
		String disciplina1, disciplina2;
		int id;

        // Registrar jugadores
        torneo.registrarJugador("futbol", new Jugador(1, "Carlos"));
        torneo.registrarJugador("futbol", new Jugador(2, "Ana"));
        torneo.registrarJugador("basquetbol", new Jugador(3, "Luis"));
        torneo.registrarJugador("basquetbol", new Jugador(4, "Ana")); // Ana también en basquetbol
        torneo.registrarJugador("voleibol", new Jugador(5, "María"));
        torneo.registrarJugador("voleibol", new Jugador(6, "José"));

		while (!salir) 
		{
			System.out.println("+======== Menú Torneo Universitario ========+");
			System.out.println("|-------------------------------------------|");
            System.out.println("|  1. Registrar jugador                     |");
            System.out.println("|  2. Mostrar jugadores por disciplina      |");
            System.out.println("|  3. Buscar jugador en disciplina          |");
            System.out.println("|  4. Eliminar jugador de disciplina        |");
            System.out.println("|  5. Contar jugadores en disciplina        |");
            System.out.println("|  6. Fusionar equipos                      |");
            System.out.println("|  7. Ver jugadores en común                |");
            System.out.println("|  8. Transferir jugador                    |");
            System.out.println("|  9. Mostrar todos ordenados por nombre    |");
            System.out.println("| 10. Mostrar todos en orden de inscripción |");
            System.out.println("| 11. Mostrar ranking por ID                |");
            System.out.println("| 12. Salir                                 |");
			System.out.println("|-------------------------------------------|");
            System.out.print(">> Opción: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) 
			{
                case 1 -> { // Registrar
					System.out.println("+----------------------+");
					System.out.println("|  Registrar jugador   |");
					System.out.println("+----------------------+");
                    System.out.print("| Disciplina: ");
                    disciplina = sc.nextLine();
                    System.out.print("| ID jugador: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("| Nombre jugador: ");
                    nombre = sc.nextLine();
                    Jugador jugador = new Jugador(id, nombre);
                    boolean reg = torneo.registrarJugador(disciplina, jugador);
					System.out.println("+----------------------+");
                    System.out.println(reg ? "  >> Registrado. <<" : "  >> Ya existe. <<");
					System.out.println("+----------------------+");
					System.out.println();
				}

                case 2 -> { // Mostrar todos
                    System.out.println("+-----------------------+");
                    System.out.println("|   Mostrar jugadores   |");
                    System.out.println("+-----------------------+");
                    torneo.mostrarTodosLosJugadores();
                    System.out.println("+-----------------------+");
                }

                case 3 -> { // Buscar
					System.out.println("+----------------------+");
					System.out.println("|    Buscar jugador    |");
					System.out.println("+----------------------+");
                    System.out.print("| Disciplina: ");
                    disciplina = sc.nextLine();
                    System.out.print("| ID jugador: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("| Nombre jugador: ");
                    nombre = sc.nextLine();
                    Jugador jugador = new Jugador(id, nombre);
					System.out.println("+----------------------+");
                    System.out.println(torneo.buscarJugador(disciplina, jugador) ? "  >> Está inscrito. <<" : "  >>No está inscrito. <<");
					System.out.println("+----------------------+");
					System.out.println();
				}

                case 4 -> {// Eliminar
					System.out.println("+----------------------+");
					System.out.println("|   Eliminar jugador   |");
					System.out.println("+----------------------+");
                    System.out.print("| Disciplina: ");
                    disciplina = sc.nextLine();
                    System.out.print("| ID jugador: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("| Nombre jugador: ");
                    nombre = sc.nextLine();
                    Jugador jugador = new Jugador(id, nombre);
					System.out.println("+----------------------+");
                    System.out.println(torneo.eliminarJugador(disciplina, jugador) ? "  >> Eliminado. <<" : "  >> No se encontró. <<");
					System.out.println("+----------------------+");
					System.out.println();
				}

                case 5 -> { // Contar
					System.out.println("+----------------------+");
					System.out.println("|   Contar jugadores   |");
					System.out.println("+----------------------+");
                    System.out.print("| Disciplina: ");
                    disciplina = sc.nextLine();
                    System.out.println("| Total: " + torneo.contarJugadores(disciplina));
					System.out.println("+----------------------+");
					System.out.println();
				}	

                case 6 -> { // Fusionar
					System.out.println("+----------------------+");
					System.out.println("|  Fusionar jugadores  |");
					System.out.println("+----------------------+");
                    System.out.print("| Primera disciplina: ");
                    disciplina1 = sc.nextLine();
                    System.out.print("| Segunda disciplina: ");
                    disciplina2 = sc.nextLine();
                    Set<Jugador> fusion = torneo.fusionarEquipos(disciplina1, disciplina2);
					System.out.println("+----------------------+");
                    if (fusion != null) {
                        System.out.println("| Jugadores fusionados:");
                        for (Jugador jugador : fusion) System.out.println(jugador);
						System.out.println("+----------------------+");
                    }
					System.out.println();
				}

                case 7 -> { // En común
					System.out.println("+------------------------------+");
					System.out.println("|      Jugadores en común      |");
					System.out.println("+------------------------------+");
                    System.out.print("| Primera disciplina: ");
                    disciplina1 = sc.nextLine();
                    System.out.print("| Segunda disciplina: ");
                    disciplina2 = sc.nextLine();
                    Set<Jugador> comun = torneo.jugadoresEnComun(disciplina1, disciplina2);
					System.out.println("+------------------------------+");
                    if (comun != null) {
                        System.out.println("| Jugadores en común:");
                        for (Jugador jugador : comun) System.out.println(jugador);
						System.out.println("+------------------------------+");
                    }
					System.out.println();
				}

                case 8 -> { // Transferir
					System.out.println("+------------------------------+");
					System.out.println("|     Transferir jugadores     |");
					System.out.println("+------------------------------+");
                    System.out.print("| Disciplina origen: ");
                    disciplina1 = sc.nextLine();
                    System.out.print("| Disciplina destino: ");
                    disciplina2 = sc.nextLine();
                    System.out.print("| ID jugador: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("| Nombre jugador: ");
                    nombre = sc.nextLine();
                    Jugador jugador = new Jugador(id, nombre);
					System.out.println("+------------------------------+");
                    System.out.println(torneo.transferirJugador(disciplina1, disciplina2, jugador) ? "  >> Transferido. <<" : "  >> No se pudo transferir. <<");
					System.out.println("+------------------------------+");
					System.out.println();
				}

                case 9 -> { // Orden alfabético
					System.out.println("+--------------------------------------+");
					System.out.println("| Ordenados por nombre alfabeticamente |");
					System.out.println("+--------------------------------------+");
                    torneo.mostrarTodosPorNombre();
					System.out.println("+--------------------------------------+");
					System.out.println();
				}

                case 10 -> { // Orden inscripción
					System.out.println("+---------------------------------+");
					System.out.println("|    Ordenados por inscripcion    |");
					System.out.println("+---------------------------------+");
                    torneo.mostrarTodosEnOrdenInscripcion();
					System.out.println("+---------------------------------+");
					System.out.println();
					
				}

                case 11 -> { // Ranking ID
					System.out.println("+---------------------------------+");
					System.out.println("|         Ranking por ID          |");
					System.out.println("+---------------------------------+");
                    torneo.mostrarRankingPorId();
					System.out.println("+---------------------------------+");
					System.out.println();
			    }

                case 12 -> { // Salir
                    salir = true;
			    }

                default -> {
                    System.out.println("Opción inválida.");
				}
            }
		}
		sc.close();
        System.out.println("***   Fin del torneo.   ***");
	}
}
