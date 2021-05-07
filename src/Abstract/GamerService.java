package Abstract;

import Entity.Gamer;

public interface GamerService {
	
	void add(Gamer gamer);
	void get(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
