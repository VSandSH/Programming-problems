class Ranges{
	private static List<Item> mainList;
	
	public static class Item {
		float x;
		float y;
		Item(float x,float y){
			this.x = x;
			this.y = y;
		}
	}
	
	Ranges(){
		mainList = new LinkedList<Item>();
	}

	public void setRange(float x, float y) {
			if (x < y) {
				Item item = new Item(x,y);
				mainList.add(item);
			}
			else{
				 System.out.println("Error! Value X = " + x + " must be less than or equal to value Y = " + y );
				 System.exit(0);
			}
	}
	
	public float getX(int i){
		Item item = mainList.get(i);
		return item.x;
	}

	public void getRanges(){
		List<Item> finalList = new LinkedList<Item>();
		finalList.add(mainList.get(0));

		int j = 0;
		for (int i = 1; i < mainList.size(); i++ ){
			if (((mainList.get(i).x <= finalList.get(j).y)) && mainList.get(i).y > finalList.get(j).y){
				finalList.get(j).y = mainList.get(i).y;
				//System.out.println(finalList.get(j).x + " " + finalList.get(j).y );
			}
			else if (mainList.get(i).x > finalList.get(j).y){			
				finalList.add(mainList.get(i));
				j++;
			}
		}
		System.out.print("Solution: ");
		printRanges(finalList);
	}
	
	public void sortRanges(){  // [(2,4), (1,3), (7,8), (1,5), (8,10)] = [(1,5), (7,10)]
		System.out.print("Unsorted list: ");
		printRanges(mainList);
		int j = 0, i = 0;
		for (i = 1; i < mainList.size(); i++){
			j = i;
			while ((( j > 0 ) && (mainList.get(j).x < mainList.get(j-1).x)) || 
					(j > 0 && (mainList.get(j).x == mainList.get(j-1).x) && (mainList.get(j).y < mainList.get(j-1).y))){
				Item tmp = mainList.get(j-1);   // swap i and j
				mainList.set(j-1, mainList.get(j));
				mainList.set(j, tmp);
				j--;
			}
		}
		System.out.print("Sorted list: ");
		printRanges(mainList);
	}
	
	public static void printRanges(List<Item> list){
		for (Item i : list){
			System.out.print(i.x + " "+ i.y + "   ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args){
		Ranges range = new Ranges();
		range.setRange(7,8);
		range.setRange(1,5);
		range.setRange(8,10);
		//range.setRange(22,4);
		range.setRange(1,3);
		//range.setRange(12,4);
		range.setRange(2,4);
		//range.setRange(12,1);
		range.sortRanges();
		range.getRanges();
	}
}
