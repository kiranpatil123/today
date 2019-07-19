package com.kiran.hashcode;

class HomeMaker {
	private int hid;
	private int hp;

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hid;
		result = prime * result + hp;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HomeMaker other = (HomeMaker) obj;
		if (hid != other.hid)
			return false;
		if (hp != other.hp)
			return false;
		return true;
	}

}

class Security {
	private int securityId;
	private String securityName;

	public int getSecurityId() {
		return securityId;
	}

	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Security [securityId=");
		builder.append(securityId);
		builder.append(", securityName=");
		builder.append(securityName);
		builder.append("]");
		return builder.toString();
	}

	public String getSecurityName() {
		return securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + securityId;
		result = prime * result + ((securityName == null) ? 0 : securityName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Security other = (Security) obj;
		if (securityId != other.securityId) {
			return false;
		}
		if (securityName == null) {
			if (other.securityName != null) {
				return false;
			}
		} else if (!securityName.equals(other.securityName))
			return false;
		return true;
	}

}

public class DemoHashCodeEquals {

	public static void main(String[] args) {
	

		Security security = new Security();
		Security security2 = new Security();
		
		security.setSecurityId(1);
		security.setSecurityName("kiran");
		
		
		security2.setSecurityId(1);
		security2.setSecurityName("kiran");
		
		System.out.println("hash code of kiran "+"kiran".hashCode());

		System.out.println(security.hashCode());
		System.out.println(security2.hashCode());

		if (security.hashCode() == security2.hashCode())
			System.out.println("yes both are equal");
		System.out.println(security.equals(security2));

	}

}
