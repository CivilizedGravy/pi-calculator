import java.math.BigDecimal;

public class picalc {

	public picalc() {
		int k = 0;
		double pip = 0;
		// BBP Summation formula for PI
		BigDecimal bd = new BigDecimal(pip);
		int nthTerm = 100; //may not be completly accurate , pi is meant to be infinite
		
		while (k!=nthTerm) {
		
			double denom = 8 * k;
			double pow = 1 / (Math.pow(16, k));
			double f = 4 / (denom + 1);
			double s = 2 / (denom + 4);
			double t = 1 / (denom + 5);
			double fo = 1 / (denom + 6);
			
			BigDecimal pi = new BigDecimal(pow * (f - s - t - fo));
			
			
			bd = bd.add(pi);
			
			k++;

		}
		System.out.println(bd.toString());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new picalc();
	}

}
