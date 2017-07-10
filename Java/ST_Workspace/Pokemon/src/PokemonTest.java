
public class PokemonTest {

	public static void main(String[] args) {
		
		
		Pokedex pokedex = new Pokedex();
		
		Pokemon pikachu    = pokedex.createPokemon("pikachu",90000,"pokemon");
		Pokemon raychu    = pokedex.createPokemon("raychu",80000000,"electricity");
		pokedex.pokemonInfo(raychu);
		pokedex.attackPokemon(raychu);
		pokedex.pokemonInfo(raychu);
	}

}
