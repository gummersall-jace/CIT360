package edu.gummersall.JUnit;

public class JUnitProof {
		
	    // Attributes
	    private String equals;
	    private Boolean yes;
	    private Boolean no;
	    private String notNull;
	    private String yesNull;
	    private Integer same;
	    private Double notSame;
	    private String[] arrayEquals;
		
	    public JUnitProof() {
			this.getEquals();
			this.getYes();
			this.getNo();
			this.getNotNull();
			this.getYesNull();
			this.getSame();
			this.getNotSame();
			this.getArrayEquals();
		}

		public String getEquals() {
			return equals;
		}

		public void setEquals(String equals) {
			this.equals = equals;
		}

		public Boolean getYes() {
			return yes;
		}

		public void setYes(Boolean yes) {
			this.yes = yes;
		}

		public Boolean getNo() {
			return no;
		}

		public void setNo(Boolean no) {
			this.no = no;
		}

		public String getNotNull() {
			return notNull;
		}

		public void setNotNull(String notNull) {
			this.notNull = notNull;
		}

		public String getYesNull() {
			return yesNull;
		}

		public void setYesNull(String yesNull) {
			this.yesNull = yesNull;
		}

		public Integer getSame() {
			return same;
		}

		public void setSame(Integer same) {
			this.same = same;
		}

		public Double getNotSame() {
			return notSame;
		}

		public void setNotSame(Double notSame) {
			this.notSame = notSame;
		}

		public String[] getArrayEquals() {
			return arrayEquals;
		}

		public void setArrayEquals(String[] arrayEquals) {
			this.arrayEquals = arrayEquals;
		}
}
