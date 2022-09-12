package sonataServiceExample;
import java.util.ArrayList;
import java.util.List;

public class MyServiceImpla {
	
	private MyServiceIntf myService ;
	
	MyServiceImpla(){}
	public MyServiceImpla(MyServiceIntf mySer) {
		this.myService = mySer;
		
	}
		
	public List<String> retriveRELATED(String user){ 
	List<String> filteredvalue = new ArrayList<String>();
	List<String> allToDo = myService.retrieveUsers(user);
	for(String all :allToDo) {
		if (all.contains("Spring")) {
			filteredvalue.add(all);
			
		}
	}
	return filteredvalue;
	}

}
