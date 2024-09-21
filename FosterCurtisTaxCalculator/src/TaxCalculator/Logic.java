package TaxCalculator;


public class Logic {
	
	private String statusTitle,
	   subTitle,
	   ten,
	   fithteen,
	   twentyFive,
	   twentyEight,
	   thirtyThree, 
	   thirtyFive;
	
	public Logic() {
		this.statusTitle = "Filing Single Tax Chart: ";
		   this.subTitle = "Taxable Income\t\tRate";
		   this.ten = "\t$0  - $8350\t\t 10%";
		   this.fithteen = "  $8,351 – $33,950\t 15%";
		   this.twentyFive = "$33,951 – $82,250\t\t 25%";
		   this.twentyEight = "$82,251 – $171,550\t\t 28%";
		   this.thirtyThree = "$171,551 – $372,950\t 33%";
		   this.thirtyFive = "$372,951 +\t\t\t 35%";
	}
	
	public Logic(String statusTitle, String subTitle, String ten, 
					  String fithteen, String twentyFive, String twentyEight, 
					  String thirtyThree, String thirtyFive) {
		   this.statusTitle = statusTitle;
		   this.subTitle = subTitle;
		   this.ten = ten;
		   this.fithteen = fithteen;
		   this.twentyFive = twentyFive;
		   this.twentyEight = twentyEight;
		   this.thirtyThree = thirtyThree;
		   this.thirtyFive = thirtyFive;		
	}
	
	public String getStatusTitle() {
		return statusTitle;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public String getTen() {
		return ten;
	}

	public String getFithteen() {
		return fithteen;
	}

	public String getTwentyFive() {
		return twentyFive;
	}

	public String getTwentyEight() {
		return twentyEight;
	}

	public String getThirtyThree() {
		return thirtyThree;
	}

	public String getThirtyFive() {
		return thirtyFive;
	}
	public void setStatusTitle(String statusTitle) {
		this.statusTitle = statusTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setFithteen(String fithteen) {
		this.fithteen = fithteen;
	}

	public void setTwentyFive(String twentyFive) {
		this.twentyFive = twentyFive;
	}

	public void setTwentyEight(String twentyEight) {
		this.twentyEight = twentyEight;
	}

	public void setThirtyThree(String thirtyThree) {
		this.thirtyThree = thirtyThree;
	}

	public void setThirtyFive(String thirtyFive) {
		this.thirtyFive = thirtyFive;
	}
	
	public void getMarriedChart() {
		setStatusTitle("Filing Married Jointly Tax Chart");
		setSubTitle("Taxable Income   Rate");
		setTen("$0 – $16,700");
		setFithteen("$16,701 – $67,900"); 
		setTwentyFive("$67,901 – $137,050"); 
		setTwentyEight("$137,051 – $208,850"); 
		setThirtyThree("$208,851 – $372,950");
		setThirtyFive("$372,951+");
		
	}
	
	public void getSeparatedChart() {
		setStatusTitle("Filing Married but Separately");
		setSubTitle("Taxable Income   Rate"); 
		setTen("$0 - $8350"); 
		setFithteen("$8,351 – $33,950");
		setTwentyFive("$33,951 – $68,525");
		setTwentyEight("$68,525 – $104,425");
		setThirtyThree("$104,426 – $186,475");
		setThirtyFive("$186,476+");	
	}
	
	public void getHeadOfHouseholdChart() {
		setStatusTitle("Filing Head of Household");
		setSubTitle("Taxable Income   Rate");
		setTen("$0 - $11,950");
		setFithteen("$11,951 – $45,500"); 
		setTwentyFive("$45,501 – $117,450"); 
		setTwentyEight("$117,451 – $190,200"); 
		setThirtyThree("$190,201 - $372,950");
		setThirtyFive("$372,951+");	
	}
	

}
