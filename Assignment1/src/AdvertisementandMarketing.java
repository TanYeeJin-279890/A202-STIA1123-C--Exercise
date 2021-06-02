
public class AdvertisementandMarketing extends BeveragesShop { // subclass of BeveragesShop
	private String titleAd;
	private double voucher;
	private String promotion;
	private String date;
	
	public AdvertisementandMarketing(){
		this.titleAd = "Buy More than RM500 get voucher";
		this.voucher = 20.00;
		this.promotion = "Buy 100 free 1 ctn(24 pcs)";
		this.date = "31.7.2021";
		showAd();
	}
	
	public void showAd() {
		System.out.println("*****************HOT PROMOTION**************");
		System.out.println(promotion + " in any types of beverages.");
		System.out.println( titleAd +
				           " for RM "+voucher);
		System.out.println("Voucher only available before "+ date);
		System.out.println();
	}

}
