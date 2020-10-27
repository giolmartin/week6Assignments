import java.util.ArrayList;



public class ExpandableArray {

	private ArrayList<Object> list = new ArrayList<Object>();

	public ExpandableArray() {

	}

	public void set(int index, Object value) {

		ArrayList<Object> newList = new ArrayList<Object>();

		if (index > 0) {
			if (list.size() != 0) {
				newList = list;
			} 
			if (list.size() > index) {
				newList.remove(index);
				newList.add(index, value);
			} else if(list.size() < index) {
				for(int i = list.size(); i < index; i++) {
					newList.add(null);
				} 
				newList.add(value);
				list = newList;	
			}
		}
	}

	public Object get (int index) {
		Object obj;
		try {

			obj = list.get(index);
		} catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			return null;
		}
		return obj;
	}
}
