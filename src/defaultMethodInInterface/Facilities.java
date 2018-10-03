package defaultMethodInInterface;

public interface Facilities {
	public final double gameFeeRate = 200;
	public final double gymFeeRate = 300;
	
	public double maintenanceFee(int month);
	
	public default double gameFee(int month) {
		return month*gameFeeRate;
	}
	public default double gymFee(int month) {
		return month*gymFeeRate;
	}
}
