package redis.clients.collections;

import java.util.Set;

public interface SetStructure <T> {

	Set<T> createSet(String key);
	
	void delete(String key);
}
