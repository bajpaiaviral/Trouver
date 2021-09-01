package enums;

public enum ResultCode {
	SUCCESS("EOS_0000", "S", "Success", "SUCCESS");
	private String resultCodeId;
	 private String resultCode;
	private String resultMsg;
	    private String resultStatus;
	ResultCode(String resultCodeId, String resultCode, String resultMsg, String resultStatus) {
        this.resultCodeId = resultCodeId;
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.resultStatus = resultStatus;
    }
	public String getResultCodeId() {
		return resultCodeId;
	}
	public void setResultCodeId(String resultCodeId) {
		this.resultCodeId = resultCodeId;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	
}
