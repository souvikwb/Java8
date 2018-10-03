package defaultMethodInInterface;

public class FullTimeMember extends Member {
	public final double fullTimeMaintenanceCost = 600;
	public final double fullTimeMemberFee = 1000;
	public final double specialDiscount = 100;
	@Override
	public double maintenanceFee(int month) {		
		return month*fullTimeMaintenanceCost;
	}

	@Override
	public double memberFee(int month) {
		return month*fullTimeMemberFee;
	}
	
	public double gameFee(int month) {
		return month*gameFeeRate - specialDiscount;
	}
	
	public double gymFee(int month) {
		return month*gymFeeRate - specialDiscount;
	}
}
