class TotalDays{
	
	public static int compDays(String fromDate, String tillDate){
		int totalDays = 0;
		String[] fromPart = fromDate.split(" ");
		String[] tillPart = tillDate.split(" ");
		int fromDay = Integer.parseInt(fromPart[0]);
		int tillDay = Integer.parseInt(tillPart[0]);
		int fromMonth = Integer.parseInt(fromPart[1]);
		int tillMonth = Integer.parseInt(tillPart[1]);
		int fromYear = Integer.parseInt(fromPart[2]);
		int tillYear = Integer.parseInt(tillPart[2]);
		
		int[] year = new int[12];

		for (int i = 0; i < 12; i++){
			if (i < 6){
				if (i == 1)
					year[i] = 28;
				else
					if (i %  2 == 0)
						year[i] = 31;
					else
						year[i] = 30;
			}
			else{
				if (i %  2 == 0)
					year[i] = 30;
				else
					year[i] = 31;
			}
		}
		//System.out.println(Arrays.toString(year));
		int countMonths = 0, leapDay = 1;
		
		while (fromMonth < tillMonth){
			//System.out.println(fromMonth);
			countMonths = countMonths + year[fromMonth-1];
			fromMonth++;
		}
		//System.out.println(countMonths);
		if ((fromYear < tillYear) && (((tillYear % 4 == 0) && (tillYear % 100 != 0)) || (tillYear % 400 == 0)) && (tillMonth > 1 && tillDay > 28)){
			countMonths = countMonths + 366;
			tillYear--;
		}
			
			
		while (fromYear < tillYear){
			if (((tillYear % 4 == 0) && (tillYear % 100 != 0)) || (tillYear % 400 == 0)){
				countMonths = countMonths + 366;
				//System.out.println("+");
				//System.out.println(countMonths);
			}
			else {
				countMonths = countMonths + 365;
				//System.out.println("-");
				//System.out.println(countMonths);
			}
			tillYear--;
		}
		
		fromMonth = Integer.parseInt(fromPart[1]);
		
		if ((((fromYear % 4 == 0) && (fromYear % 100 != 0)) || (fromYear % 400 == 0)) && (fromMonth < 3 && fromDay < 30))
			totalDays = countMonths - fromDay + tillDay + leapDay;
		else
			totalDays = countMonths - fromDay + tillDay;
		//System.out.println(totalDays);
		
		return totalDays;
	}

	public static void main(String[] args){
		int days = compDays("21 5 2007", "17 12 2014");
		System.out.println(days);	
	}	
}
