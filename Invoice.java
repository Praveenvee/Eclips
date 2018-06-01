package one;
class voice{
	String pnum;
	String pdis;
	public int purchased;
	public double price;
	public double invoiceamount;
	
	
	public voice() {
		
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getPdis() {
		return pdis;
	}

	public void setPdis(String pdis) {
		this.pdis = pdis;
	}

	public int getPurchased() {
		return purchased;
	}

	public void setPurchased(int purchased) {
		if(purchased>0)
			this.purchased = purchased;
		else
			purchased = 0;
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>0)
		    this.price = price;
		else
			price =0;
	}
	
	public double getInvoiceAmount() {
		return invoiceamount;
	}
	public void setInvoiceAmount() {
		if(price<0)
			System.out.println("---The price is not valid---\n");
	    else
		this.invoiceamount=(price*purchased);
	}
	
	
}

public class Invoice {

	public static void main(String[] args) {
		voice obj = new voice();
		obj.setPnum("0A12GB");
		obj.setPdis("Its a good product in the market");
		obj.setPrice(20.00);
		obj.setPurchased(0);
		obj.setInvoiceAmount();
		System.out.println("Part Number : "+obj.getPnum()+"\nDiscription : "+obj.getPdis()+"\nPrice : "+"Rs."+obj.getPrice()+"\nPurchased : "+obj.getPurchased()+"\nInvoice Amount : "+"Rs."+obj.getInvoiceAmount());
		
	}
}
