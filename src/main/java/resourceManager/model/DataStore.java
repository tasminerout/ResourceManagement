package resourceManager.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value= "session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class DataStore {
	private List<Person> store;
	private Calendar lastUpdated;
	
	public List<Person> getStore() {
		return store;
	}
	public void setStore(List<Person> store) {
		this.store = store;
	}
	public Calendar getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Calendar lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public DataStore() {
		this.store = new ArrayList<Person>();
	}
	
}
