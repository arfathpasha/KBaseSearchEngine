package kbasesearchengine.queue;

import java.io.IOException;

import kbasesearchengine.events.ObjectStatusEvent;

public interface ObjectStatusEventIterator {
	
	public boolean hasNext() throws IOException;
	
	public ObjectStatusEvent next() throws IOException;
	
	public void markAsVisited(boolean isIndexed) throws IOException;
	
}
