package INHERITANCE;

public class main {

	public static void main(String[] args) {
        Television objA = new Television (1.8,24.3);
		System.out.println("Resolution MaxVolume > "+objA.getresolution()+" K, "+objA.getmaxVol()+" dB(decibels).");
		System.out.println("Area of Television > " + objA.area());
		System.out.println("Ratio of Screen Size > " + objA.ratio());
		
		System.out.println();
		
		LG objLG = new LG(1.8,24.3,42.0);
		System.out.println("-------------------------------LG----------------------------------");
		System.out.println("Length Resolution MaxVolume > " + objLG.getlength()+ " inch "+ objLG.getresolution()+" K, "+ objLG.getmaxVol()+" dB(decibels).");
		System.out.println("Volume of Television > " + objLG.volume());
		System.out.println("Ratio of Screen Size > " + objLG.ratio());
		
		System.out.println();
		
		PHILIPS objPHILIPS = new PHILIPS(1.8,24.3,48.0);
		System.out.println("-------------------------------PHILIPS-----------------------------");
		System.out.println("Length Resolution MaxVolume > " + objPHILIPS.getlength()+" inch "+ objPHILIPS.getresolution()+" K, "+ objPHILIPS.getmaxVol()+" dB(decibels).");
		System.out.println("Volume of Television > " + objPHILIPS.volume());
		System.out.println("Ratio of Screen Size > " + objPHILIPS.ratio());
		

	}

}
