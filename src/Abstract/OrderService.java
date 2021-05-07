package Abstract;

import Entity.*;

public interface OrderService {
	
	void add(Order order);
	void get(Order order);
	void update(Order order);
	void delete(Order order);
	void buy(Gamer gamer, Game game, Discount discount);
}
